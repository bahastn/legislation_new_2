package krd.legislation.legislation2.services;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class LawOrderServices {
    private LegislationRepository legislationRepository;

    public LawOrderServices(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public Page<Legislation> orderLaws(String language, Integer pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return legislationRepository.findLawByLawRange("3", language, pageable);


    }
}
