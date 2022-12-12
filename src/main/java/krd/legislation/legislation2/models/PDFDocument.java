package krd.legislation.legislation2.models;

import javax.persistence.*;

@Entity
@Table(name = "PDFDOCUMENTS")
public class PDFDocument {
    private Long documentId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }
}
