package mu.micro.java.client.example.okhttp;

import java.io.IOException;
import mu.micro.java.client.http.MicroHttpRequest;
import mu.micro.java.client.http.ok.MicroOKHttpClient;
import mu.micro.java.client.http.ok.MicroOKHttpOptions;

public class OKHttpClientDemo {

    public static void main(String[] args) throws IOException {
        MicroOKHttpOptions okHttpOptions = new MicroOKHttpOptions();
        okHttpOptions.setLocal(true);
        MicroOKHttpClient client = new MicroOKHttpClient(okHttpOptions);

        MicroHttpRequest request = new MicroHttpRequest();
        client.Call("go.micro.api.greeter", "Greeter.Hi", "{\"name\":\"Micro\"}");
    }
}
