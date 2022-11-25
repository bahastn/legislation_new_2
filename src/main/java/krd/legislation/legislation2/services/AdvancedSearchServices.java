package krd.legislation.legislation2.services;


import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.services
 * @date 8/10/2021
 * @Time 3:31 PM
 */
@Service
public class AdvancedSearchServices implements AdvancedSearchInt{
    private LegislationRepository legislationRepository;

    public AdvancedSearchServices(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    @Override
    public Page<Legislation> singleFieldSearch(String language, String keyWord, int pageNumber) {
//        Pageable pageable = PageRequest.of(pageNumber, 1000);
//        if(language.equals("en")) {
//            return legislationRepository.fullTextSearch("3", keyWord, pageable);
//        }
//       else if(language.equals("ar")) {
//            return legislationRepository.fullTextSearch("2", keyWord, pageable);
//        }
//       else{
//            return legislationRepository.fullTextSearch("1", keyWord, pageable);
//        }
        return  null;

    }
}
