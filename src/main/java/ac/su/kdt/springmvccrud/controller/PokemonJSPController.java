package ac.su.kdt.springmvccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pokemon")
public class PokemonJSPController {
    @GetMapping("/list10")
    public String list10() {
        return "pokemon-get";
    }

    // @GetMapping 으로 Form 화면 표시
    // =>
    // @PutMapping or @PostMapping 에서 제출된 내용 수신
}
