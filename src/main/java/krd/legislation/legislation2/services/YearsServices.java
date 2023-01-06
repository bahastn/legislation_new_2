package krd.legislation.legislation2.services;

import krd.legislation.legislation2.repositories.LegislationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearsServices {
    private LegislationRepository legislationRepository;

    public YearsServices(LegislationRepository legislationRepository) {
        this.legislationRepository = legislationRepository;
    }

    public List<Integer> getLawListOfYears() {
        List<Integer> list = legislationRepository.findByYear("2");
        return list;
    }

    public  List<Integer> getOrderListOfYears() {
        List<Integer> list = legislationRepository.findByYear("3");
        return list;
    }
}
