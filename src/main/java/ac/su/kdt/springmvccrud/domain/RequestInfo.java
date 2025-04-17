package ac.su.kdt.springmvccrud.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class RequestInfo {
    private String method;
    private String uri;
    private String protocol;
    private String remoteAddr;
    private Map<String, String> headers;
    private Map<String, String[]> parameters;
    private Map<String, Object> sessionAttributes;
}
