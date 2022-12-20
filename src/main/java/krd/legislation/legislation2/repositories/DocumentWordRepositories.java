package krd.legislation.legislation2.repositories;


import krd.legislation.legislation2.models.DocumentWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentWordRepositories extends JpaRepository<DocumentWord, Long> {
    @Query("SELECT d FROM DocumentWord d WHERE d.documentId =?1")
    DocumentWord findByFileId(Long fileName);
}
