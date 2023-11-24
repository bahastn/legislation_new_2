package krd.legislation.legislation2.services;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.models.ProtocolBooks;
import krd.legislation.legislation2.repositories.ProtocolsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProtocolBooksServices {
    private ProtocolsRepository protocolsRepository;

    public ProtocolBooksServices(ProtocolsRepository protocolsRepository) {
        this.protocolsRepository = protocolsRepository;
    }
    public Page<ProtocolBooks> getProtocolBooks( int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 1000, Sort.by("protocolNumber").ascending());
        return protocolsRepository.findAllProtocolBooks(pageable);
    }
}
