package krd.legislation.legislation2.controllers;


import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.services.TerminatedLawServices;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TerminatedLawController {
    private TerminatedLawServices terminatedLawServices;

    public TerminatedLawController(TerminatedLawServices terminatedLawServices) {
        this.terminatedLawServices = terminatedLawServices;
    }

    @RequestMapping(value = "/terminated-law", method = RequestMethod.GET)
    public String getTerminatedLaw(Model model) {

        List<Legislation> list = null;
        String mapping = "/terminated-law";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = terminatedLawServices.terminatedLaws("1");
                title = "لیستی یاسا هەڵوەشاوەکان";

            } else if (lang.equals("ar")) {
                list = terminatedLawServices.terminatedLaws("2");
                title = "قائمة القرارات";
            } else {
                list = terminatedLawServices.terminatedLaws("3");
//                title = "لیستی بڕیارەکان";
            }

        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "index";
        }
        model.addAttribute("title", title);
        model.addAttribute("laws", list);
        return "terminated-law";
    }


}
