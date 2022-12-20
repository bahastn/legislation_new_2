package krd.legislation.legislation2.services;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminatedLawServices {
    private LegislationRepository legislationRepository;

    public TerminatedLawServices(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public List<Legislation> terminatedLaws(String language) {

        return legislationRepository.findTerminatedLaw("1", language, "0");

    }
}
