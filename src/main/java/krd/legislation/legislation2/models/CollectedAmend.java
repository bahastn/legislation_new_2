package krd.legislation.legislation2.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.models
 * @date 28-Nov-21
 * @Time 2:22 PM
 */
@Entity
@Table(name = "COLLECTED_AMEND")
public class CollectedAmend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long amendId;
    private String amendTitle;
    @Column(name = "LAW_CONTENT", length = 250000)
    private String amendContent;
    //    @Size(min = 1, max = 10000)
    private int issueDate;
    @CreationTimestamp
    private Timestamp addedDate;
    private String language;
    @ManyToOne
    private User addedBy;
    @ManyToOne
    private DocumentWord wordDocument;
    @ManyToOne
    private DocumentPDF pdfDocument;

    public Long getAmendId() {
        return amendId;
    }

    public void setAmendId(Long amendId) {
        this.amendId = amendId;
    }

    public String getAmendTitle() {
        return amendTitle;
    }

    public void setAmendTitle(String amendTitle) {
        this.amendTitle = amendTitle;
    }

    public String getAmendContent() {
        return amendContent;
    }

    public void setAmendContent(String amendContent) {
        this.amendContent = amendContent;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public DocumentWord getWordDocument() {
        return wordDocument;
    }

    public void setWordDocument(DocumentWord wordDocument) {
        this.wordDocument = wordDocument;
    }

    public DocumentPDF getPdfDocument() {
        return pdfDocument;
    }

    public void setPdfDocument(DocumentPDF pdfDocument) {
        this.pdfDocument = pdfDocument;
    }
}
