package mu.micro.java.client.http;

import lombok.Data;

@Data
public class MicroHttpRequest {

    private String service;
    private String endpoint;
    private String body;
}
