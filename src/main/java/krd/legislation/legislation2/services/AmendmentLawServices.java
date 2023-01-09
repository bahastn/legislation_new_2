package krd.legislation.legislation2.services;

import krd.legislation.legislation2.models.CollectedAmend;
import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.repositories.CollectedAmendRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AmendmentLawServices {
    private CollectedAmendRepository collectedAmendRepository;

    public AmendmentLawServices(CollectedAmendRepository collectedAmendRepository) {
        this.collectedAmendRepository = collectedAmendRepository;
    }

    public Page<CollectedAmend> amendLaws(String language, Integer pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 20);
        return collectedAmendRepository.findAllAmends( language, pageable);

    }
    public CollectedAmend findAmendById(Long id ){
        return collectedAmendRepository.findByAmendId(id);
    }


}
