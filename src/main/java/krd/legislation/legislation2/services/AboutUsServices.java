package krd.legislation.legislation2.services;

import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.stereotype.Service;

@Service
public class AboutUsServices {
    private LegislationRepository legislationRepository;

    public AboutUsServices(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public Integer getTotalInsertedLaw(String language, String lawCategory) {
        return legislationRepository.getTotalLawByCategory(language,lawCategory);
    }

}
