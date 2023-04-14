package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Destur {

@GetMapping("/dasturiHaremiKurdistan")

    public String desturproject()
    {
        return "dasturiHaremiKurdistan";
    }
}
