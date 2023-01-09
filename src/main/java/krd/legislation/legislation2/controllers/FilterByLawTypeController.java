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

@Controller
public class FilterByLawTypeController {

    private LawFilterService lawFilterService;

    public FilterByLawTypeController(LawFilterService lawFilterService) {
        this.lawFilterService = lawFilterService;
    }


    @RequestMapping(value = "/naturalConstitutionLaws", method = RequestMethod.GET)
    public String getNaturalConstitutionLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/naturalConstitutionLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.naturalConstitutionLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.naturalConstitutionLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.naturalConstitutionLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/civilLaws", method = RequestMethod.GET)
    public String getCivilLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/civilLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.civilLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.civilLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.civilLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/crimeLaws", method = RequestMethod.GET)
    public String getCrimeLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/crimeLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.crimeLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.crimeLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.crimeLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/tradeLaws", method = RequestMethod.GET)
    public String getTradeLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/tradeLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.tradeLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.tradeLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.tradeLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/industrialLaws", method = RequestMethod.GET)
    public String getIndustrialLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/industrialLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.industrialLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.industrialLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.industrialLaws("3", pageNumber - 1);
                title = "ACT  List";
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


    @RequestMapping(value = "/managementLaws", method = RequestMethod.GET)
    public String getManagementLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/managementLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.managementLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.managementLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.managementLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/socialLaws", method = RequestMethod.GET)
    public String getSocialLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/socialLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.socialLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.socialLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.socialLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/financialLaws", method = RequestMethod.GET)
    public String getFinancialLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/financialLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.financialLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.financialLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.financialLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/healthCareLaws", method = RequestMethod.GET)
    public String getHealthCareLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/healthCareLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.healthCareLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.healthCareLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.healthCareLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/agricultureLaws", method = RequestMethod.GET)
    public String getAgricultureLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/agricultureLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.agricultureLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.agricultureLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.agricultureLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/personalStatusLaws", method = RequestMethod.GET)
    public String getPersonalStatusLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/personalStatusLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.personalStatusLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.personalStatusLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.personalStatusLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/educationLaws", method = RequestMethod.GET)
    public String getEducationLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/educationLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.educationLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.educationLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.educationLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/naturalResourceLaws", method = RequestMethod.GET)
    public String getNaturalResourceLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/naturalResourceLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.naturalResourceLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.naturalResourceLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.naturalResourceLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/activeFederalLaws", method = RequestMethod.GET)
    public String getActiveFederalLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/activeFederalLaws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.federalLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.federalLaws("2", pageNumber - 1);
                title = "قائمة القرارات";
            } else {
                list = lawFilterService.federalLaws("3", pageNumber - 1);
                title = "لیستی بڕیارەکان";
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

    @RequestMapping(value = "/government-laws", method = RequestMethod.GET)
    public String getGovernmentLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/government-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.governmentsLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.governmentsLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.governmentsLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/organization-laws", method = RequestMethod.GET)
    public String getOrganizationLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/organization-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.organizationLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.organizationLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.organizationLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/military-laws", method = RequestMethod.GET)
    public String getMilitaryLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/military-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.militaryLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.militaryLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.militaryLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/transportation-laws", method = RequestMethod.GET)
    public String getTransportationLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/transportation-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.transportationLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.transportationLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.transportationLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/legal-laws", method = RequestMethod.GET)
    public String getLegalSystemLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/legal-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.legalSystemLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.legalSystemLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.legalSystemLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/culture-laws", method = RequestMethod.GET)
    public String getCultureLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/culture-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.cultureLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.cultureLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.cultureLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/job-laws", method = RequestMethod.GET)
    public String getJobLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/job-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.jobLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.jobLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.jobLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/federalpassed-laws", method = RequestMethod.GET)
    public String getFederalPassedLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/federalpassed-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.federalPassedLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.federalPassedLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.federalPassedLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/terminated-federal-laws", method = RequestMethod.GET)
    public String getTerminatedFederalLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/terminated-federal-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.terminationFederalLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.terminationFederalLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.terminationFederalLaws("3", pageNumber - 1);
                title = "ACT  List";
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
    @RequestMapping(value = "/environment-laws", method = RequestMethod.GET)
    public String getEnvironmentalFederalLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/environment-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.environmentalLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.environmentalLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.environmentalLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/civil-society-laws", method = RequestMethod.GET)
    public String getCivilSocietyLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/civil-society-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.civilSocietyLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.civilSocietyLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.civilSocietyLaws("3", pageNumber - 1);
                title = "ACT  List";
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


    @RequestMapping(value = "/tourism-laws", method = RequestMethod.GET)
    public String getTourismLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/tourism-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.tourismLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.tourismLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.tourismLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/investment-laws", method = RequestMethod.GET)
    public String getInverstmentLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/investment-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.investmentLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.investmentLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.investmentLaws("3", pageNumber - 1);
                title = "ACT  List";
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

    @RequestMapping(value = "/municipalities-laws", method = RequestMethod.GET)
    public String getMunicipalitiesLaws(@RequestParam int pageNumber, Model model) {

        Page<Legislation> list = null;
        String mapping = "/municipalities-laws";
        String title = "";

        try {
            String lang = LocaleContextHolder.getLocale().getLanguage();
            if (lang.equals("ku")) {
                list = lawFilterService.municipalitiesLaws("1", pageNumber - 1);
                title = "لیستی یاساکان";

            } else if (lang.equals("ar")) {
                list = lawFilterService.municipalitiesLaws("2", pageNumber - 1);
                title = "لائحة التشريعات";
            } else {
                list = lawFilterService.municipalitiesLaws("3", pageNumber - 1);
                title = "ACT  List";
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
