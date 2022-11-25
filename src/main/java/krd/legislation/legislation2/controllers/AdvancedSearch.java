package krd.legislation.legislation2.controllers;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import krd.legislation.legislation2.services.AdvancedSearchServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdvancedSearch {

    private LegislationRepository legislationRepository;
    private AdvancedSearchServices advancedSearchServices;

    public AdvancedSearch(LegislationRepository legislationRepository,
                          AdvancedSearchServices advancedSearchServices) {
        this.legislationRepository = legislationRepository;
        this.advancedSearchServices = advancedSearchServices;
    }

    @GetMapping("search")
    public String advancedSearch() {
        return "search";
    }

    @PostMapping(value = "/search")
    public String search(@RequestParam(value = "keyword", required = false) String keyword, Model model){
        if(keyword.isEmpty()){
            return "index";
        }
//        ArrayList<Legislation> list = legislationRepository.fullTextSearch(keyword);
        List<Legislation> list = new ArrayList<>();
        Legislation l = new Legislation();
        l.setLawTitle("Test Law Title");
        list.add(l);
        model.addAttribute("laws", list );
        return "search";
    }

    @PostMapping(value = "/search1")
    public String getResult(@RequestParam(value = "keyword", required = false) String keyword,
                            @RequestParam(value = "year", required = false) Integer year,
                            @RequestParam(value = "lawNumber", required = false) Integer lawNumber,
                            @RequestParam(value = "category", required = false) String category,
                            @RequestParam(value = "classification", required = false) String classification,
                            @RequestParam(value = "active", required = false) String active,
                            Model model) {


        String keyWords = "";
        if(!keyword.isEmpty() && keyword.length() < 300) {
            String[] keyWordList = keyword.split(" ");
            String[] keyWordWithPipe = new String[keyWordList.length];
            for (int i = 0; i < keyWordList.length; i++) {
                if (i < keyWordList.length - 1) {
                    keyWordWithPipe[i] = keyWordList[i] + "|";
                } else {
                    keyWordWithPipe[i] = keyWordList[i];
                }
                keyWords = keyWords + keyWordWithPipe[i];
            }
            keyWords = " N'"+ keyWords+"'";

        }
        else{
            return "advanced-search";
        }
        Integer validLawNumber = -1;
        if(lawNumber != null){
            validLawNumber = lawNumber;
        }


        if(!keyWords.isEmpty() && year!= null  && validLawNumber > 0){
           List<Legislation> list = legislationRepository.findByLawTitleIsContaining(keyWords, year, validLawNumber, category, classification, active);
            model.addAttribute("laws", list );
        }
        if(!keyWords.isEmpty() && year == null && validLawNumber > 0){
            List<Legislation> list = legislationRepository.findByLawTitleIsContainingNoYear(keyWords, validLawNumber, category, classification, active);
            model.addAttribute("laws", list );

        }
         if(!keyWords.isEmpty() && year == null  && validLawNumber < 0){

             List<Legislation> list = legislationRepository.findByLawTitleIsContainingNoYearNoLawNumber(keyWords, category, classification, active);
             model.addAttribute("laws", list );

        }
         if(!keyWords.isEmpty() && year != null  && validLawNumber < 0 ){

             List<Legislation> list = legislationRepository.findByLawTitleIsContainingNoLawNumber(keyWords, year, category, classification, active);
             model.addAttribute("laws", list );

        }

        return "advanced-search";


    }
//    private boolean intValidation(String value) {
//        try {
//            Integer.parseInt(value);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
}
