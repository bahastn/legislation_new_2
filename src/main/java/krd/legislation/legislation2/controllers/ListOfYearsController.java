package krd.legislation.legislation2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListOfYearsController {
    @GetMapping("/list-years")
    public String viewListOfYears(){
        return "list-years";
    }
}
