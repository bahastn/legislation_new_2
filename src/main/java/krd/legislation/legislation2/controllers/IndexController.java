package krd.legislation.legislation2.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class IndexController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("index")
    public String index() {
        return "index";
    }
}