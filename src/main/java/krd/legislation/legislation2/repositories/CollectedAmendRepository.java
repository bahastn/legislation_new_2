package krd.legislation.legislation2.repositories;

import krd.legislation.legislation2.models.CollectedAmend;
import krd.legislation.legislation2.models.Legislation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Query("SELECT c FROM CollectedAmend c where  c.amendId = ?1 ")
    CollectedAmend findByAmendId(Long id);
    @Query("SELECT c FROM CollectedAmend c where  c.language = ?1")
    Page<CollectedAmend> findAllAmends( String language, Pageable pageable);
}
