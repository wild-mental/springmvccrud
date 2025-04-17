package ac.su.kdt.springmvccrud.controller;

import ac.su.kdt.springmvccrud.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        String message = exampleService.getMessage();
        model.addAttribute("message", message);
        return "helloView";
    }
}