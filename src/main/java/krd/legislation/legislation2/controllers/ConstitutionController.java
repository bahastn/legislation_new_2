package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConstitutionController {
    @GetMapping("/constitution")
    public String constitutionLaw() {
        return "constitution";
    }

    @GetMapping("/dasturiHaremiKurdistan2")
    public String constitutionLawKurdistan() {
        return "DasturiHaremiKurdistan";
    }
}
