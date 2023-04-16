package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstProject {

    @GetMapping("/firstproject")
    public String viewFirstProject()
    {
        return "firstproject";
    }

    @GetMapping("/lizhna18")
    public String lizhna18kas()
    {
        return "lizhna18";
    }

    @GetMapping("/lizhna20")
    public String lizhna20kas()
    {
        return "lizhna20";
    }
}
