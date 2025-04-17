package ac.su.kdt.springmvccrud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{id}")
    @ResponseBody  // 인라인 형태로 직접 응답 본문 리턴
    public String get(
        @PathVariable String id,
        @RequestParam String param
    ) {
        return "<h1>USER No." + id +  " DATA RESPONSE / param:" + param + "</h1>";
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
