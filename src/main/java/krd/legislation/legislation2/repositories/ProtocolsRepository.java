package krd.legislation.legislation2.repositories;

import krd.legislation.legislation2.models.Legislation;
import krd.legislation.legislation2.models.ProtocolBooks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface ProtocolsRepository extends JpaRepository<ProtocolBooks, Long> {
    @Query("select COUNT(p) from ProtocolBooks p")
    Integer countAll();


    @Query("SELECT p FROM ProtocolBooks p")
    Page<ProtocolBooks> findAllProtocolBooks(Pageable pageable);
    @Query("SELECT p FROM ProtocolBooks p where p.protocolId = ?1")
    ProtocolBooks getProtocol(Long id);
}
