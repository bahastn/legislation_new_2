package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.services.AboutUsServices;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.controllers
 * @date 2/28/2021
 * @Time 8:52 AM
 */
@Controller
public class AboutUsController {




    @GetMapping("about")
    public String aboutUs(Model model) {



        return "about";
    }
}
