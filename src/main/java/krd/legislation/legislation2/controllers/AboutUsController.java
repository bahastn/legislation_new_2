package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
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
    public String aboutUs() {
        return "about";
    }
}
