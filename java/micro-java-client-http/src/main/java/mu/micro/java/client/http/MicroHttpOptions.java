package mu.micro.java.client.http;

import lombok.Data;

@Data
public class MicroHttpOptions {

    String token = "";
    String address;
    boolean local;
}
