package mu.micro.java.client.http.ok;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.io.IOException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import mu.micro.java.client.http.MicroHttpClient;
import mu.micro.java.client.http.MicroHttpOptions;
import mu.micro.java.client.http.MicroHttpResponse;

@Data
@Slf4j
public class MicroOKHttpClient implements MicroHttpClient {

    private MicroHttpOptions options;

    private static String defaultLocal = "http://localhost:8080/client";
    private static String defaultLive = "https://api.micro.mu/client";

    private OkHttpClient okClient;

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
    public MicroHttpResponse Call(String service, String endpoint, Object body) {
        Gson gson = new GsonBuilder().create();

        RequestBody okBody = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            gson.toJson(body)
        );

        final Request okRequest = new Request.Builder()
            .url(this.options.getAddress())
            .header("X-Micro-Token", this.options.getToken())
            .post(okBody)
            .build();

        MicroHttpResponse microHttpResponse = null;
        try {
            Response response = okClient.newCall(okRequest).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            microHttpResponse = gson.fromJson(response.body().charStream(), MicroHttpResponse.class);

            System.out.println(response.body().string());
        } catch (IOException ex) {
            microHttpResponse = new MicroHttpResponse();
            microHttpResponse.setError(ex.getMessage());
        }

        return microHttpResponse;
    }
}
