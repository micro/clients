package mu.micro.java.client.http;

public interface MicroHttpClient<R extends Object, P extends MicroHttpResponse> {

    <B> P Call(String service, String endpoint, R reqBody, Class<B> rspBodyClass);
}
