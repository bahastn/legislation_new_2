package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddLawController {
    @GetMapping("/add-law")
    public String addlaw(){
        return "add-law";
    }
}
