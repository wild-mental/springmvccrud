package ac.su.kdt.springmvccrud.controller;

import ac.su.kdt.springmvccrud.domain.LoginForm;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller  // 페이지 응답을 기본으로 함
// @RestController  // 본문 콘텐츠를 직접 응답함 (JSON)
@RequestMapping("/")
public class ExampleController {
    @GetMapping("/example1")
    @ResponseBody
    public String example1(HttpServletRequest request) {
//        String param1 = request.getParameter("param1");
//        int param2 = Integer.parseInt(request.getParameter("param2"));
//        return param1 + " / " + param2;

        return request.getHeader("requestHeader");
    }

    // 2번째 방법
    @GetMapping("/example2-form")
    public String showForm(Model model){
        model.addAttribute("loginForm", new LoginForm());
        return "login-form";
    }

    @PostMapping("/example2-submit")
    @ResponseBody
    public String submitForm(@ModelAttribute("loginForm") LoginForm loginForm){
        return "email : " + loginForm.getEmail() + " / pass : " + loginForm.getPassword();
    }

    @GetMapping("/example3-pathvar/{var1}/{var2}/{var3}")
    @ResponseBody
    public String pathVar123(
        @PathVariable String var1,
        @PathVariable String var2,
        @PathVariable String var3
    ) {
        return "var1: " + var1 + " var2: " + var2 + " var3: " + var3;
    }

    @GetMapping("/example4-reqparam")
    @ResponseBody
    public String reqParam(
        @RequestParam(value = "par1", defaultValue = "par1 missing") String param1,
        @RequestParam(value = "par2", defaultValue = "null") String param2,
        @RequestParam(value = "par3", defaultValue = "0") String param3
    ) {
        // Validation patterns
        // 1) null check
        if (param1 == null || param2.equals("null")) {
            // defaultValue 조건에 맞추어서 분기 수행
            return "at least 1 param is missing";
        }
        // 2) type check  => 이후 수신데이터의 포맷 체크
        try {
            Integer.parseInt(param3);
        }
        catch (Exception e) {
            return "param3 is not a number";
        }
        return "param1: " + param1 + " param2: " + param2 + " param3: " + param3;
    }

    @PostMapping("/example5-reqbody")
    @ResponseBody
    public String example5(
        @RequestParam String param1,
        @RequestBody String payload
    ) {
        return "Received body data: " + payload + " param1: " + param1;
    }
}
