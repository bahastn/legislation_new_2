package krd.legislation.legislation2.services;

import krd.legislation.legislation2.repositories.LegislationRepository;
import krd.legislation.legislation2.repositories.ProtocolsRepository;
import org.springframework.stereotype.Service;

@Service
public class AboutUsServices {
    private LegislationRepository legislationRepository;
    private ProtocolsRepository protocolsRepository;

    public AboutUsServices(LegislationRepository legislationRepository, ProtocolsRepository protocolsRepository) {
        this.legislationRepository = legislationRepository;
        this.protocolsRepository = protocolsRepository;
    }

    public Integer getTotalInsertedLaw(String language, String lawCategory) {
        return legislationRepository.getTotalLawByCategory(language,lawCategory);
    }
    public Integer getTotalProtocolBooks(){
        return protocolsRepository.countAll();
    }


}
