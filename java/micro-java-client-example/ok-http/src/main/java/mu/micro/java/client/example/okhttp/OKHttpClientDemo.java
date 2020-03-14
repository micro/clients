package mu.micro.java.client.example.okhttp;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import lombok.Data;
import mu.micro.java.client.http.MicroHttpResponse;
import mu.micro.java.client.http.ok.MicroOKHttpClient;
import mu.micro.java.client.http.ok.MicroOKHttpOptions;

public class OKHttpClientDemo {

    private static final Logger logger = Logger.getLogger(OKHttpClientDemo.class.getName());

    public static void main(String[] args) {
        MicroOKHttpOptions okHttpOptions = new MicroOKHttpOptions();
        okHttpOptions.setLocal(true);
        MicroOKHttpClient client = new MicroOKHttpClient(okHttpOptions);

        Map<String, String> testData = new HashMap<>();
        testData.put("name", "Micro");
        MicroHttpResponse<Body> response = client.Call("go.micro.api.greeter", "Say.Hello", testData, Body.class);

        logger.info(response.getError());
        logger.info(response.getBody());
        logger.info(response.getEncodedBody().getMsg());
    }

    @Data
    public static class Body {
        String msg;
    }
}
