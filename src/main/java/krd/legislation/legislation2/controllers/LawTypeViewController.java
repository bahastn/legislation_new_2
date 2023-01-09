package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LawTypeViewController {
    @GetMapping("/law-type")
    public String viewLawTypes(Model model){
        return "law-type";
    }
}
