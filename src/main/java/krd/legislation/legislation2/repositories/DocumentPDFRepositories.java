package krd.legislation.legislation2.repositories;



import krd.legislation.legislation2.models.DocumentPDF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentPDFRepositories extends JpaRepository<DocumentPDF, Long> {

    @Query("SELECT d FROM DocumentPDF d WHERE d.documentId =?1")
    DocumentPDF findByFileId(Long fileName);
}
