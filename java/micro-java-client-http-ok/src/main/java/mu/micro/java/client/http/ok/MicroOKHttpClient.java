package mu.micro.java.client.http.ok;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.util.Base64;
import java.util.logging.Logger;
import lombok.Data;
import mu.micro.java.client.http.MicroHttpClient;
import mu.micro.java.client.http.MicroHttpOptions;
import mu.micro.java.client.http.MicroHttpRequest;
import mu.micro.java.client.http.MicroHttpResponse;

@Data
public class MicroOKHttpClient implements MicroHttpClient<Object, MicroHttpResponse> {

    private static final Logger logger = Logger.getLogger(MicroOKHttpClient.class.getName());

    private MicroHttpOptions options;

    private static String defaultLocal = "http://localhost:8080/client";
    private static String defaultLive = "https://api.micro.mu/client";

    private OkHttpClient okClient = new OkHttpClient();

    public MicroOKHttpClient(MicroOKHttpOptions options) {
        if (options != null) {
            this.options = options;
        } else {
            this.options = new MicroHttpOptions();
            this.options.setAddress(defaultLive);
        }

        if (options != null && options.isLocal()) {
            this.options.setAddress(defaultLocal);
        }
    }


    @Override
    public MicroHttpResponse Call(String service, String endpoint, Object body, Class rspBodyClass) {
        Gson gson = new GsonBuilder().create();

        MicroHttpRequest microHttpRequest = new MicroHttpRequest(service, endpoint, Base64.getEncoder().encodeToString(gson.toJson(body).getBytes()));

        logger.info(gson.toJson(microHttpRequest));

        Request request = new Request.Builder()
            .url(this.options.getAddress())
            .method("POST", RequestBody.create(MediaType.parse("application/json"), gson.toJson(microHttpRequest)))
            .header("X-Micro-Token", this.options.getToken())
            .build();

        MicroHttpResponse<Object> microHttpResponse = null;
        try {
            Call call = okClient.newCall(request);
            Response response = call.execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            microHttpResponse = gson.fromJson(response.body().charStream(), MicroHttpResponse.class);
            if (microHttpResponse.getBody() != null) {
                microHttpResponse.setEncodedBody(
                    gson.fromJson(new String(Base64.getDecoder().decode(microHttpResponse.getBody().getBytes())), rspBodyClass));
            }
        } catch (IOException ex) {
            microHttpResponse = new MicroHttpResponse();
            microHttpResponse.setError(ex.getMessage());
        }

        return microHttpResponse;
    }
}
