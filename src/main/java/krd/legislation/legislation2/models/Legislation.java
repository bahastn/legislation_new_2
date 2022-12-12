package krd.legislation.legislation2.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "LEGSLATION")
public class Legislation {
    private Long lawId;
    private String lawTitle;
    private String lawContent;
    private int lawNumber;
    private int lawModificationNumber;
    private LocalDate issueDate;
    private LocalDate modificationDate;
    private Language language;
    private int numberOfArticle;
    private String reasonForIssuing;
    private LocalDate effectiveDate;
    private LocalDate discontinueDate;
    private User addedBy;
    private LocalDateTime addedDate;
    private WordDocument wordDocument;
    private PDFDocument pdfDocument;
    private LawType lawType;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getLawId() {
        return lawId;
    }

    public void setLawId(Long lawId) {
        this.lawId = lawId;
    }

    @Column(name = "LOW_TITLE", length = 500)
    public String getLawTitle() {
        return lawTitle;
    }

    public void setLawTitle(String lawTitle) {
        this.lawTitle = lawTitle;
    }

    @Column(name = "LOW_CONTENT", length = 2500)
    public String getLawContent() {
        return lawContent;
    }

    public void setLawContent(String lawContent) {
        this.lawContent = lawContent;
    }

    @Column(name = "LOW_TYPE")
    public LawType getLawType() {
        return lawType;
    }

    public void setLawType(LawType lawType) {
        this.lawType = lawType;
    }

    public int getLawNumber() {
        return lawNumber;
    }

    public void setLawNumber(int lawNumber) {
        this.lawNumber = lawNumber;
    }

    public int getLawModificationNumber() {
        return lawModificationNumber;
    }

    public void setLawModificationNumber(int lawModificationNumber) {
        this.lawModificationNumber = lawModificationNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getNumberOfArticle() {
        return numberOfArticle;
    }

    public void setNumberOfArticle(int numberOfArticle) {
        this.numberOfArticle = numberOfArticle;
    }

    public String getReasonForIssuing() {
        return reasonForIssuing;
    }

    public void setReasonForIssuing(String reasonForIssuing) {
        this.reasonForIssuing = reasonForIssuing;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getDiscontinueDate() {
        return discontinueDate;
    }

    public void setDiscontinueDate(LocalDate discontinueDate) {
        this.discontinueDate = discontinueDate;
    }

    @ManyToOne
    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }

    @ManyToOne
    public WordDocument getWordDocument() {
        return wordDocument;
    }

    public void setWordDocument(WordDocument wordDocument) {
        this.wordDocument = wordDocument;
    }

    @ManyToOne
    public PDFDocument getPdfDocument() {
        return pdfDocument;
    }

    public void setPdfDocument(PDFDocument pdfDocument) {
        this.pdfDocument = pdfDocument;
    }
}
