package krd.legislation.legislation2.controllers;


import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.services.TerminatedLawServices;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TerminatedLawController {
    private TerminatedLawServices terminatedLawServices;

    public TerminatedLawController(TerminatedLawServices terminatedLawServices) {
        this.terminatedLawServices = terminatedLawServices;
    }

    @RequestMapping(value = "/terminated-law", method = RequestMethod.GET)
    public String getTerminatedLaw(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/terminated-law";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = terminatedLawServices.terminatedLaws("1", pageNumber -1);
                title = "لیستی یاسا هەڵوەشاوەکان";

            } else if (lang.equals("ar")) {
                list = terminatedLawServices.terminatedLaws("2", pageNumber -1);
                title = "قائمة التشريعات الملغية";
            } else {
                list = terminatedLawServices.terminatedLaws("3", pageNumber -1);
                title = "";
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
