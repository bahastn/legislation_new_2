package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.services.LawDetailServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class LawDetailController {
private LawDetailServices lawDetailServices;

    public LawDetailController(LawDetailServices lawDetailServices) {
        this.lawDetailServices = lawDetailServices;
    }


    @RequestMapping(value = "law-detail", method = RequestMethod.GET)
    public String law(@RequestParam Long id, Model model) {
        Legislation legislation = lawDetailServices.getLawDetail(id);
        List<Legislation> listOfAmends = legislation.getListOfModification();
        Collections.sort(listOfAmends, Comparator.comparing(Legislation :: getIssueDate));
        List<Legislation> listOfRelatedLaw = legislation.getRelatedLegislation();
        Collections.sort(listOfRelatedLaw, Comparator.comparing(Legislation :: getIssueDate));
        model.addAttribute("law", legislation);
        model.addAttribute("listOfAmends", listOfAmends);
        model.addAttribute("listOfRelatedLaw", listOfRelatedLaw);
        return "law-detail";
    }

}
