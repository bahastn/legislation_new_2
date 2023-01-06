package krd.legislation.legislation2.services;



import krd.legislation.legislation2.models.Legislation;
import org.springframework.data.domain.Page;

import java.util.List;

public interface lawFilterServicesInt {

    // law range filter

    Page<Legislation> constLaws(String language, int pageNumber);

    Page<Legislation> normalLaws(String language, int pageNumber);

    Page<Legislation> orderLaws(String language, int pageNumber);

    Page<Legislation> orderLegalLaws(String language, int pageNumber);

    Page<Legislation> managementOrdersLaws(String language, int pageNumber);

    Page<Legislation> instructions(String language, int pageNumber);


    // type law filter

    Page<Legislation> naturalConstitutionLaws(String language, int pageNumber);

    Page<Legislation> civilLaws(String language, int pageNumber);

    Page<Legislation> crimeLaws(String language, int pageNumber);

    Page<Legislation> tradeLaws(String language, int pageNumber);

    Page<Legislation> industrialLaws(String language, int pageNumber);

    Page<Legislation> managementLaws(String language, int pageNumber);

    Page<Legislation> socialLaws(String language, int pageNumber);

    Page<Legislation> financialLaws(String language, int pageNumber);

    Page<Legislation> healthCareLaws(String language, int pageNumber);

    Page<Legislation> agricultureLaws(String language, int pageNumber);

    Page<Legislation> personalStatusLaws(String language, int pageNumber);

    Page<Legislation> educationLaws(String language, int pageNumber);

    Page<Legislation> naturalResourceLaws(String language, int pageNumber);

    Page<Legislation> federalLaws(String language, int pageNumber);

    Page<Legislation> governmentsLaws(String language, int pageNumber);

    Page<Legislation> organizationLaws(String language, int pageNumber);

    Page<Legislation> militaryLaws(String language, int pageNumber);

    Page<Legislation> transportationLaws(String language, int pageNumber);

    Page<Legislation> legalSystemLaws(String language, int pageNumber);

    Page<Legislation> cultureLaws(String language, int pageNumber);
    Page<Legislation> jobLaws(String language, int pageNumber);
    Page<Legislation> federalPassedLaws(String language, int pageNumber);
    Page<Legislation> terminationFederalLaws(String language, int pageNumber);
    Page<Legislation>environmentalLaws(String language, int pageNumber);
    Page<Legislation> civilSocietyLaws(String language, int pageNumber);
    Page<Legislation> tourismLaws(String language, int pageNumber);
    Page<Legislation> investmentLaws(String language, int pageNumber);



    //grouping years

    List<Integer> yearsGroup();

    // find by years
    Page<Legislation> findByYears(Integer year, String language, int pageNumber);

    //federal law
    List<Legislation> findFederalLawBySelectedYear(String classification, String language, Integer yearStart, Integer yearEnd);


    //terminated law

    List<Legislation> terminatedLaws(String language);

    //Edit search
    List<Legislation> searchForEdit(Integer year, Integer lawNumber, String language);
    List<Legislation> searchForProtocolAddRemove(Integer year, Integer lawNumber, String language, String range);


}
