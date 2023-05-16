package krd.legislation.legislation2.services;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TerminatedLawServices {
    private LegislationRepository legislationRepository;

    public TerminatedLawServices(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public Page<Legislation> terminatedLaws(String language, int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20, Sort.by("issueDate").descending()
                .and(Sort.by("lawNumber").ascending()));
        return  legislationRepository.findTerminatedLaw("1", language, "0", pageable);

    }


}
