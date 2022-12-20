package krd.legislation.legislation2.repositories;

import krd.legislation.legislation2.models.CollectedAmend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.repositories
 * @date 28-Nov-21
 * @Time 8:22 PM
 */
@Repository
public interface CollectedAmendRepository extends JpaRepository<CollectedAmend, Long> {

    @Query("SELECT c FROM CollectedAmend c where  c.language = ?1 order by c.amendTitle DESC ")
    List<CollectedAmend> findAllCollectedAmend(String language);

    @Query("SELECT c FROM CollectedAmend c where  c.amendTitle = ?1 ")
    CollectedAmend findByAmendTitle(String name);
}
