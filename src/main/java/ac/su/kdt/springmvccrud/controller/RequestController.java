package ac.su.kdt.springmvccrud.controller;

import ac.su.kdt.springmvccrud.domain.RequestInfo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class RequestController {
    @GetMapping("/request-info-json")
    public RequestInfo getRequestInfo(HttpServletRequest request) {
        Map<String, String> headers = new HashMap<>();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            headers.put(name, request.getHeader(name));
        }

        Map<String, String[]> parameters = request.getParameterMap();

        Map<String, Object> sessionAttrs = new HashMap<>();
        HttpSession session = request.getSession(false);
        if (session != null) {
            Enumeration<String> attrNames = session.getAttributeNames();
            while (attrNames.hasMoreElements()) {
                String name = attrNames.nextElement();
                sessionAttrs.put(name, session.getAttribute(name));
            }
        }

        return RequestInfo.builder()
            .method(request.getMethod())
            .uri(request.getRequestURI())
            .protocol(request.getProtocol())
            .remoteAddr(request.getRemoteAddr())
            .headers(headers)
            .parameters(parameters)
            .sessionAttributes(sessionAttrs)
            .build();
    }
}
