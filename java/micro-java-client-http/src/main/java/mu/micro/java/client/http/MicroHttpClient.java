package mu.micro.java.client.http;

public interface MicroHttpClient<R extends MicroHttpRequest, P extends MicroHttpResponse> {

    P Call(String service, String endpoint, R request);
}
