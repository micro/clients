package mu.micro.java.client;

public interface MicroHttpClient<R, P> {

    P Call(String service, String endpoint, R request);
}
