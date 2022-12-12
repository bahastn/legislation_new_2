package krd.legislation.legislation2.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class IndexController {
    @GetMapping("index")
    public String index() {
        return "index";
    }
}