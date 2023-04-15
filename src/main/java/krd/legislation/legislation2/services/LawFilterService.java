package krd.legislation.legislation2.services;


import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableCaching
public class LawFilterService implements lawFilterServicesInt {
    private LegislationRepository legislationRepository;

    public LawFilterService(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }


    // law range
    @Override

    public Page<Legislation> constLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawRange("1", language, pageable);
    }

    @Override

    public Page<Legislation> normalLaws(String language, int pageNumber) {

        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));

        return legislationRepository.findLawByLawRange("2", language, pageable);
    }

    @Override
    public Page<Legislation> orderLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawRange("3", language, pageable);
    }

    @Override
    public Page<Legislation> orderLegalLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawRange("4", language, pageable);
    }

    @Override
    public Page<Legislation> managementOrdersLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawRange("5", language, pageable);
    }

    @Override
//    @Cacheable("insruction")
    public Page<Legislation> instructions(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawRange("6", language, pageable);
    }



    // filter by types ----------------------------------------------------------------------


    @Override
    public Page<Legislation> naturalConstitutionLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("1", language, pageable);
    }


    @Override
    public Page<Legislation> civilLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("2", language, pageable);
    }

    @Override
    public Page<Legislation> crimeLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("3", language, pageable);
    }

    @Override
    public Page<Legislation> tradeLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("4", language, pageable);
    }

    @Override
    public Page<Legislation> industrialLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("5", language, pageable);
    }

    @Override
    public Page<Legislation> managementLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("6", language, pageable);
    }

    @Override
    public Page<Legislation> socialLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("7", language, pageable);
    }

    @Override
    public Page<Legislation> financialLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("8", language, pageable);
    }

    @Override
    public Page<Legislation> healthCareLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("9", language, pageable);
    }

    @Override
    public Page<Legislation> agricultureLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("10", language, pageable);
    }

    @Override
    public Page<Legislation> personalStatusLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("11", language, pageable);
    }

    @Override
    public Page<Legislation> educationLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("12", language, pageable);
    }

    @Override
    public Page<Legislation> naturalResourceLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("13", language, pageable);
    }

    @Override
    public Page<Legislation> federalLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("14", language, pageable);
    }

    @Override
    public Page<Legislation> governmentsLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("15", language, pageable);
    }

    @Override
    public Page<Legislation> organizationLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("16", language, pageable);
    }

    @Override
    public Page<Legislation> militaryLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("17", language, pageable);
    }

    @Override
    public Page<Legislation> transportationLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("18", language, pageable);
    }

    @Override
    public Page<Legislation> legalSystemLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("19", language, pageable);
    }

    @Override
    public Page<Legislation> cultureLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("20", language, pageable);    }

    @Override
    public Page<Legislation> jobLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("21", language, pageable);
    }

    @Override
    public Page<Legislation> federalPassedLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("22", language, pageable);
    }

    @Override
    public Page<Legislation> terminationFederalLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("23", language, pageable);
    }

    @Override
    public Page<Legislation> environmentalLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("24", language, pageable);
    }

    @Override
    public Page<Legislation> civilSocietyLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("25", language, pageable);
    }

    @Override
    public Page<Legislation> tourismLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("26", language, pageable);
    }

    @Override
    public Page<Legislation> investmentLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawType("27", language, pageable);
    }

    @Override
    public Page<Legislation> municipalitiesLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20);
        return legislationRepository.findLawByLawType("28", language, pageable);
    }
/*

    Find By years
    ------------------------------------------------------------
     */

    @Override
    public List<Integer> yearsGroup() {
        return legislationRepository.findByYear("1");
    }

    @Override
    public Page<Legislation> findByYears(Integer year, String language, int pageNumber) {
//        Pageable pageable = PageRequest.of(pageNumber, 40
//                , Sort.by("lawNumber").ascending()
//                        .and(Sort.by("issueDate").descending()));
//        return legislationRepository.findByYear( year, language, pageable);
        return null;

    }

    // Federal Law

    @Override
    public List<Legislation> findFederalLawBySelectedYear(String classification, String language, Integer yearStart, Integer yearEnd) {
        return legislationRepository.findFederalLawBySelectedYear(classification, language, yearStart, yearEnd);
    }


    //terminated laws

    @Override
    public List<Legislation> terminatedLaws(String language) {

        return legislationRepository.findTerminatedLaw("1", language, "0");
    }



    @Override
    public List<Legislation> searchForEdit(Integer  year, Integer  lawNumber, String language) {

//
//
//        if (year != null && lawNumber != null && !language.isEmpty()) {
//
//            return legislationRepository.searchForEditAllParam(year, lawNumber, language);
//
//        }
//        if (language.isEmpty() && year > 1900 && lawNumber > 0) {
//
//            return legislationRepository.searchForEditYearAndLawNumber(year, lawNumber);
//        }
//        if (lawNumber == null && lawNumber == null) {
//            return legislationRepository.searchForEditYear(year);
//        }
//        if (year == null && language.isEmpty()) {
//            return legislationRepository.searchForEditLawNumber(lawNumber);
//        }
        return legislationRepository.findAll();

    }

    @Override
    public List<Legislation> searchForProtocolAddRemove(Integer year, Integer lawNumber, String language, String range) {
//        return legislationRepository.searchForEditAllParameters(year,lawNumber,language,range);
        return null;
    }


}
