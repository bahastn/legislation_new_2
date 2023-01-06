package krd.legislation.legislation2.controllers;


import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.services.LawFilterService;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.controllers
 * @date 2/25/2021
 * @Time 8:49 PM
 */
@Controller
public class FilterRangController {


    private LawFilterService lawFilterService;

    public FilterRangController(LawFilterService lawFilterService) {
        this.lawFilterService = lawFilterService;
    }


    @RequestMapping(value = "/cons-data", method = RequestMethod.GET)
    public String getConstitutionLaw(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/cons-data";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.constLaws("1", pageNumber - 1);
                title = " دەستور";

            } else if (lang.equals("ar")) {
                list = lawFilterService.constLaws("2", pageNumber - 1);
                title = "دەستور";
            } else {
                list = lawFilterService.constLaws("3", pageNumber - 1);
                title = "Constitution";
            }
            if (list.isEmpty()) {
                title = "";
            }


        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "krdlaw";
        }
        return getStringPar(pageNumber, model, list, mapping, title);
    }


    @RequestMapping(value = "/normal-law", method = RequestMethod.GET)
    public String getNormalLaw(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/normal-law";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.normalLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.normalLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.normalLaws("3", pageNumber - 1);
                title = "";
            }
            if (list.isEmpty()) {
                title = "";
            }


        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "krdlaw";
        }
        return getStringPar(pageNumber, model, list, mapping, title);
    }


//    @RequestMapping(value = "/orders-law", method = RequestMethod.GET)
//    public String getOrderLaw(@RequestParam int pageNumber, Model model) {
//
//        Page<Legislation> list = null;
//        String mapping = "/orders-law";
//        String title = "";
//
//        try {
//            String lang = LocaleContextHolder.getLocale().getLanguage();
//            if (lang.equals("ku")) {
//                list = lawFilterService.orderLaws("1", pageNumber - 1);
//                title = "لیستی بڕیارەکان";
//
//            } else if (lang.equals("ar")) {
//                list = lawFilterService.orderLaws("2", pageNumber - 1);
//                title = "القرارات التشريعية";
//            } else {
//                list = lawFilterService.orderLaws("3", pageNumber - 1);
//                title = "";
//            }
//            if (list.isEmpty()) {
//                title = "";
//            }
//
//
//        } catch (Exception e) {
//            e.getMessage();
//            e.getMessage().getClass().getName();
//            return "krdlaw";
//        }
//
//        return getStringPar(pageNumber, model, list, mapping, title);
//    }


    @RequestMapping(value = "/orderLegalLaws", method = RequestMethod.GET)
    public String getOrderLegalLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/orderLegalLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.orderLegalLaws("1", pageNumber - 1);
                title = "پەیڕەو";

            } else if (lang.equals("ar")) {
                list = lawFilterService.orderLegalLaws("2", pageNumber - 1);
                title = "الانظمة";
            } else {
                list = lawFilterService.orderLegalLaws("3", pageNumber - 1);
                title = "";
            }
            if (list.isEmpty()) {
                title = "";
            }

        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "krdlaw";
        }

        return getStringPar(pageNumber, model, list, mapping, title);
    }

    @RequestMapping(value = "/managementOrdersLaws", method = RequestMethod.GET)
    public String getManagementOrdersLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/managementOrdersLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.managementOrdersLaws("1", pageNumber - 1);
                title = "بڕیاری کارگێڕی";

            } else if (lang.equals("ar")) {
                list = lawFilterService.managementOrdersLaws("2", pageNumber - 1);
                title = "القرارات الادارية";
            } else {
                list = lawFilterService.managementOrdersLaws("3", pageNumber - 1);
                title = "";
            }

            if (list.isEmpty()) {
                title = "";
            }

        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "krdlaw";
        }

        return getStringPar(pageNumber, model, list, mapping, title);
    }

    @RequestMapping(value = "/instructions", method = RequestMethod.GET)
    public String getInstructions(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/instructions";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.instructions("1", pageNumber - 1);
                title = "رێنمایی";

            } else if (lang.equals("ar")) {
                list = lawFilterService.instructions("2", pageNumber - 1);
                title = "التعليمات";
            } else {
                list = lawFilterService.instructions("3", pageNumber - 1);
                title = "";
            }
            if (list.isEmpty()) {
                title = "";
            }

        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "krdlaw";
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
        return "krdlaw";
    }


}
