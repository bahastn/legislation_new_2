package krd.legislation.legislation2.services;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.stereotype.Service;

@Service
public class LawDetailServices {
    private LegislationRepository legislationRepository;

    public LawDetailServices(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public Legislation getLawDetail(String lawTitle) {
        return legislationRepository.findByLawTitle(lawTitle);
    }
}
