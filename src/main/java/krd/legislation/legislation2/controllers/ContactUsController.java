package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactUsController {
    
    @GetMapping("contact-us")
    public String viewContactPage(Model model){
        return "contact";
    }
}
