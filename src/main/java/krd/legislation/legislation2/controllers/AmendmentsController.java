package krd.legislation.legislation2.controllers;


import krd.legislation.legislation2.models.CollectedAmend;
import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.services.AmendmentLawServices;
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
 * @date 15-Nov-21
 * @Time 8:22 PM
 */
@Controller
public class AmendmentsController {
//
//    private CollectedAmendRepository collectedAmendRepository;
//
//    public AmendmentsController(CollectedAmendRepository collectedAmendRepository) {
//        this.collectedAmendRepository = collectedAmendRepository;
//    }
//
//    @GetMapping("/amendments")
//    public String viewAmendments(Model model){
//
//        List<Legislation> list = new ArrayList<>();
//        String title = "";
//        try {
//            String lang = LocaleContextHolder.getLocale().getLanguage();
//            if (lang.equals("ku")) {
//                list = getLegList(collectedAmendRepository.findAllCollectedAmend("1"));
//                title = "یاسا هەموارکراوە یەکخراوەکان";
//            } else if (lang.equals("ar")) {
//                list = getLegList(collectedAmendRepository.findAllCollectedAmend("2"));
//                title = "";
//            } else {
//                list = getLegList(collectedAmendRepository.findAllCollectedAmend("3"));
//                title = "";
//
//            }
//
//
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        model.addAttribute("laws", list);
//        model.addAttribute("title", title);
//
//
//        return "amendments";
//    }
//
//    @RequestMapping(value = "amends-detail", method = {RequestMethod.GET, RequestMethod.POST})
//    public String showAmendDetail(@RequestParam String name, Model model) {
//        try {
//            CollectedAmend amend = collectedAmendRepository.findByAmendTitle(name);
//
//            model.addAttribute("amend", amend);
//        }
//       catch (Exception err){
//            err.getCause().getMessage();
//           System.out.println("------------------------------");
//            throw new RuntimeException("can't find record");
//       }
//        return "amends-detail";
//    }
//
//    private List<Legislation> getLegList(List<CollectedAmend> amends){
//        List<Legislation> list = new ArrayList<>();
//        Collections.sort(amends, Comparator.comparingInt(CollectedAmend ::getIssueDate));
//
//        for (int i = 0; i < amends.size(); i++) {
//           Legislation leg = new Legislation();
//            leg.setLawTitle(amends.get(i).getAmendTitle());
//            leg.setLawContent(amends.get(i).getAmendContent());
//            leg.setPdfDocument(amends.get(i).getPdfDocument());
//            leg.setWordDocument(amends.get(i).getWordDocument());
//
//
//            list.add(leg);
//
//        }
//        return list;
//    }

    private AmendmentLawServices amendmentLawServices;

    public AmendmentsController(AmendmentLawServices amendmentLawServices) {
        this.amendmentLawServices = amendmentLawServices;
    }

    @RequestMapping(value = "/amendments", method = RequestMethod.GET)
    public String geAmendmentLaw(@RequestParam int pageNumber, Model model) {

        Page<CollectedAmend> list = null;
        String mapping = "/amendments";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = amendmentLawServices.amendLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = amendmentLawServices.amendLaws("2", pageNumber - 1);
                title = "";
            } else {
                list = amendmentLawServices.amendLaws("3", pageNumber - 1);
                title = "";
            }
            if (list.isEmpty()) {
                title = "";
            }


        } catch (Exception e) {
            e.getMessage();
            e.getMessage().getClass().getName();
            return "amendments";
        }

        return getStringPar(pageNumber, model, list, mapping, title);
    }

    private String getStringPar(@RequestParam int pageNumber, Model model, Page<CollectedAmend> list, String mapping, String title) {
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalPages", list.getTotalPages());
        model.addAttribute("totalItems", list.getTotalElements());
        model.addAttribute("mapping", mapping);
        model.addAttribute("title", title);
        model.addAttribute("laws", list);
        return "amendments";
    }

}
