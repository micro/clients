package mu.micro.java.client.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MicroHttpRequest {
    private String service;
    private String endpoint;
    private Object body;
}
