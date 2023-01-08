package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.services.AboutUsServices;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class KurdistanLawController {

    @GetMapping("Kurdistan_Law")
    public String kurdistanLaw(Model model) {
        return "Kurdistan_Law";
    }
}