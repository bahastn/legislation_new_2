package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import krd.legislation.legislation2.services.YearsServices;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;

@Controller
public class ListOfYearsController {
    private YearsServices yearsServices;
    private LegislationRepository legislationRepository;

    public ListOfYearsController(YearsServices yearsServices, LegislationRepository legislationRepository) {
        this.yearsServices = yearsServices;
        this.legislationRepository = legislationRepository;
    }

    @GetMapping("/list-years")
    public String viewListOfYears(Model model){
        List<Integer> lawListOfYears = yearsServices.getLawListOfYears();
        List<Integer> orderListOfYears = yearsServices.getOrderListOfYears();
        model.addAttribute("lawYears",lawListOfYears );
        model.addAttribute("orderYears",orderListOfYears );
        return "list-years";
    }

    @RequestMapping(value = "years", method = {RequestMethod.GET, RequestMethod.POST})
    public String law(@RequestParam Integer year, Model model) {

        List<Legislation> list = new ArrayList<>();
        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = legislationRepository.findBySelectedYearLaws("1", year, "1");
                Collections.sort(list, comparing(Legislation::getLawNumber));
            } else if (lang.equals("ar")) {
                list = legislationRepository.findBySelectedYearLaws("1", year, "2");
                Collections.sort(list, comparing(Legislation::getLawNumber));
            } else {
                list = legislationRepository.findBySelectedYearLaws("1", year, "3");
                Collections.sort(list, comparing(Legislation::getLawNumber));
            }

        } catch (Exception e) {
            e.getMessage();
        }

        model.addAttribute("laws", list);

        return "years";
    }

    @RequestMapping(value = "years-o", method = {RequestMethod.GET, RequestMethod.POST})
    public String orders(@RequestParam Integer year, Model model) {

        List<Legislation> list = new ArrayList<>();
        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = legislationRepository.findBySelectedYearOrders("1", year, "1");
                Collections.sort(list, comparing(Legislation::getLawNumber));
            } else if (lang.equals("ar")) {
                list = legislationRepository.findBySelectedYearOrders("1", year, "2");
                Collections.sort(list, comparing(Legislation::getLawNumber));
            } else {
                list = legislationRepository.findBySelectedYearOrders("1", year, "3");
                Collections.sort(list, comparing(Legislation::getLawNumber));
            }

        } catch (Exception e) {
            e.getMessage();
        }

        model.addAttribute("laws", list);

        return "years-o";
    }
}
