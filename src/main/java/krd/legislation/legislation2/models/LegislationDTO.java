package krd.legislation.legislation2.models;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.models
 * @date 15-Nov-21
 * @Time 8:29 PM
 */
public class LegislationDTO {
    private Long id;
    private String lawTitle;
    private Long documentId;
    private Long pdfId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLawTitle() {
        return lawTitle;
    }

    public void setLawTitle(String lawTitle) {
        this.lawTitle = lawTitle;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Long getPdfId() {
        return pdfId;
    }

    public void setPdfId(Long pdfId) {
        this.pdfId = pdfId;
    }

}
