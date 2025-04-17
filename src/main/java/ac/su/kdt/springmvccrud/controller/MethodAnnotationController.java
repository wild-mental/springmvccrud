package ac.su.kdt.springmvccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController  // 전체 컨트롤러 클래스 동작에 대해서 응답 본문 리턴
@RequestMapping("/method-annotation")
public class MethodAnnotationController {

    // 요청의 유형을 외부에서 어떤 것을 받든지 관계없이
    // 실제 코드 내용이 적절하게 구현되어 있지 않으면
    // 웹 프로그램으로서 표준을 완전히 무시하게 된다

    @RequestMapping(
        value = "/get1",
        method = RequestMethod.GET  // 기본값이 GET
    )
    @ResponseBody  // 인라인 형태로 직접 응답 본문 리턴
    public String get1() {
        return "<h1>GET METHOD RESPONSE EXAMPLE 1</h1>";
    }

    @GetMapping("/get2")
    @ResponseBody  // 인라인 형태로 직접 응답 본문 리턴
    public String get2() {
        return "<h1>GET METHOD RESPONSE EXAMPLE 2</h1>";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "<h1>POST METHOD RESPONSE EXAMPLE</h1>";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "<h1>PUT METHOD RESPONSE EXAMPLE</h1>";
    }

    @PatchMapping("/patch")
    @ResponseBody
    public String patch() {
        return "<h1>PATCH METHOD RESPONSE EXAMPLE</h1>";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "<h1>DELETE METHOD RESPONSE EXAMPLE</h1>";
    }
}
