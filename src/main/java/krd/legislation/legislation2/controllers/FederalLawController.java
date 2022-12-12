package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FederalLawController {
    @GetMapping("/federal-law")
    public String federalLaw(){
        return "federal-law";
    }
}
