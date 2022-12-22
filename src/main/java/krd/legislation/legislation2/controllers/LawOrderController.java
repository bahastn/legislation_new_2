package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.services.LawOrderServices;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LawOrderController {
    private LawOrderServices lawOrderServices;

    public LawOrderController(LawOrderServices lawOrderServices) {
        this.lawOrderServices = lawOrderServices;
    }

    @RequestMapping(value = "/orders-law", method = RequestMethod.GET)
    public String getOrderLaw(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/orders-law";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawOrderServices.orderLaws("1", pageNumber - 1);
                title = "لیستی بڕیارەکان";

            } else if (lang.equals("ar")) {
                list = lawOrderServices.orderLaws("2", pageNumber - 1);
                title = "القرارات التشريعية";
            } else {
                list = lawOrderServices.orderLaws("3", pageNumber - 1);
                title = "";
            }
            if (list.isEmpty()) {
                title = "";
            }


        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "index";
        }

        return getStringPar(pageNumber, model, list, mapping, title);
    }

    private String getStringPar(@RequestParam int pageNumber, Model model, Page<Legislation> list, String mapping, String title) {
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalPages", list.getTotalPages());
        model.addAttribute("totalItems", list.getTotalElements());
        model.addAttribute("mapping", mapping);
        model.addAttribute("title", title);
        model.addAttribute("laws", list);
        return "orders-law";
    }

}
