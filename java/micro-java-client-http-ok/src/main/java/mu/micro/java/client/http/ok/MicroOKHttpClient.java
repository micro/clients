package mu.micro.java.client.http.ok;

import lombok.Data;
import mu.micro.java.client.http.MicroHttpClient;
import mu.micro.java.client.http.MicroHttpOptions;
import mu.micro.java.client.http.MicroHttpRequest;
import mu.micro.java.client.http.MicroHttpResponse;

@Data
public class MicroOKHttpClient implements MicroHttpClient {

    private MicroHttpOptions options;

    private static String defaultLocal = "http://localhost:8080/client";
    private static String defaultLive = "https://api.micro.mu/client";

    public MicroOKHttpClient(MicroHttpOptions options) {
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
    public MicroHttpResponse Call(String service, String endpoint, MicroHttpRequest request) {
        return null;
    }
}
