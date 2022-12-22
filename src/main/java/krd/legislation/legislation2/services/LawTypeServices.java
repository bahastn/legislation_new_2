package krd.legislation.legislation2.services;

import krd.legislation.legislation2.models.LawTypes;
import krd.legislation.legislation2.repositories.LawTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawTypeServices {
    private LawTypeRepository lawTypeRepository;

    public LawTypeServices(LawTypeRepository lawTypeRepository) {
        this.lawTypeRepository = lawTypeRepository;
    }


    public List<LawTypes> listOfLawTypes() {
        return lawTypeRepository.findAll();
    }
}
