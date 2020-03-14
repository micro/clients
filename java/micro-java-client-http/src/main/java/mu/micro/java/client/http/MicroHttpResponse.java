package mu.micro.java.client.http;

import lombok.Data;

@Data
public class MicroHttpResponse<T> {

    private String body;
    private int code;
    private String id;
    private String detail;
    private String status;
    private String error;

    private T encodedBody;
}
