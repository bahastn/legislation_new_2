package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.models.LawTypes;
import krd.legislation.legislation2.services.LawTypeServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LawTypeViewController {
private LawTypeServices lawTypeServices;

    public LawTypeViewController(LawTypeServices lawTypeServices) {
        this.lawTypeServices = lawTypeServices;
    }

    @GetMapping("/law-type")
    public String viewLawTypes(Model model){
        List<LawTypes> listOfLawTypes = lawTypeServices.listOfLawTypes();
        model.addAttribute("lawTypes", listOfLawTypes);
        return "law-type";
    }
}
