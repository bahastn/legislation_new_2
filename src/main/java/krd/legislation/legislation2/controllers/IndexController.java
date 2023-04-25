package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.services.AboutUsServices;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class IndexController {
    private AboutUsServices aboutUsServices;

    public IndexController(AboutUsServices aboutUsServices) {
        this.aboutUsServices = aboutUsServices;
    }

    @GetMapping("index")
    public String index(Model model) {

        String lang = LocaleContextHolder.getLocale().getLanguage();

        if (lang == "ku") {
            lang = "1";
        }
        if (lang == "ar") {
            lang = "2";
        }

        Integer totalNumberOfLaws = aboutUsServices.getTotalInsertedLaw(lang, "2");

        if (aboutUsServices.getTotalInsertedLaw(lang, "2") != null) {
            model.addAttribute("law", aboutUsServices.getTotalInsertedLaw(lang, "2"));
        } else {
            model.addAttribute("law", 0);
        }
        if (aboutUsServices.getTotalInsertedLaw(lang, "3") != null) {
            model.addAttribute("order", aboutUsServices.getTotalInsertedLaw(lang, "3"));
        } else {
            model.addAttribute("order", 0);
        }
        if (aboutUsServices.getTotalInsertedLaw(lang, "6") != null) {
            model.addAttribute("management", aboutUsServices.getTotalInsertedLaw(lang, "6"));
        } else {
            model.addAttribute("management", 0);
        }
        if (aboutUsServices.getTotalInsertedLaw(lang, "5") != null) {
            model.addAttribute("managementOrder", aboutUsServices.getTotalInsertedLaw(lang, "5"));
        } else {
            model.addAttribute("managementOrder", 0);
        }
        if (aboutUsServices.getTotalInsertedLaw(lang, "4") != null) {
            model.addAttribute("guide", aboutUsServices.getTotalInsertedLaw(lang, "4"));
        } else {
            model.addAttribute("guide", 0);
        }

        return "index";
    }

    @GetMapping("/")
    public String index2(Model model) {

        String lang = LocaleContextHolder.getLocale().getLanguage();

        if (lang == "ku") {
            lang = "1";
        }
        if (lang == "ar") {
            lang = "2";
        }


        Integer totalSimpleLaw = aboutUsServices.getTotalInsertedLaw(lang, "2");
        if (totalSimpleLaw != null) {
            model.addAttribute("law", totalSimpleLaw);
        } else {
            model.addAttribute("law", 0);
        }
        Integer totalOrders = aboutUsServices.getTotalInsertedLaw(lang, "3");
        if (totalOrders != null) {
            model.addAttribute("order", totalOrders);
        } else {
            model.addAttribute("order", 0);
        }
        Integer totalManagement = aboutUsServices.getTotalInsertedLaw(lang, "6");
        if ( totalManagement!= null) {
            model.addAttribute("management", totalManagement);
        } else {
            model.addAttribute("management", 0);
        }
        Integer totalManagementOrder = aboutUsServices.getTotalInsertedLaw(lang, "5");
        if ( totalManagementOrder != null) {
            model.addAttribute("managementOrder", totalManagementOrder);
        } else {
            model.addAttribute("managementOrder", 0);
        }
        Integer totalGuide= aboutUsServices.getTotalInsertedLaw(lang, "4");
        if (totalGuide != null) {
            model.addAttribute("guide", totalGuide);
        } else {
            model.addAttribute("guide", 0);
        }

        return "index";
    }
}