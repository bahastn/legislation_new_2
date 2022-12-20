package krd.legislation.legislation2.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "legsilation")
public class Legislation {
    @Id
    @Column(name = "LAW_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lawId;
    @Column(name = "LAW_TITLE", length = 500)
    private String lawTitle;
    @Lob
    @Column(name = "LAW_CONTENT", length = 250000)
    private String lawContent;
    //    @Size(min = 1, max = 10000)
    private int lawNumber;
    private int lawModificationNumber;
    private int issueDate;
    private int modificationYear;
    @CreationTimestamp
    private Timestamp addedDate;
    private String language;
    private int numberOfArticle;
    private String classification;
    @Lob
    @Column(name = "LAW_ABSTRACT", length = 20000)
    private String lawAbstract;
    private String active;
    @ManyToOne
    private User addedBy;
    @ManyToOne
    private User modifiedBy;
    private LocalDateTime modifyDateTime;
    @ManyToOne
    private DocumentWord wordDocument;
    @ManyToOne
    private DocumentPDF pdfDocument;
    private String lawType;
    private String lawType2;
    private String lawType3;
    private String lawCategory;
    @OneToMany
    private List<Legislation> relatedLegislation;
    @ManyToOne
    private Protocols protocols;
    @ManyToMany
    private List<Legislation> listOfModification;
    private int approved;
    private LocalDateTime approvedTime;
    private String comment;


    public Long getLawId() {
        return lawId;
    }

    public void setLawId(Long lawId) {
        this.lawId = lawId;
    }


    public String getLawTitle() {
        return lawTitle;
    }

    public void setLawTitle(String lawTitle) {
        this.lawTitle = lawTitle;
    }


    public String getLawContent() {
        return lawContent;
    }

    public void setLawContent(String lawContent) {
        this.lawContent = lawContent;
    }

    @Column(name = "LAW_TYPE_1")
    public String getLawType() {
        return lawType;
    }

    public void setLawType(String lawType) {
        this.lawType = lawType;
    }

    @Basic
    @Column(name = "LAW_TYPE_2")
    public String getLawType2() {
        return lawType2;
    }

    public void setLawType2(String lawType2) {
        this.lawType2 = lawType2;
    }

    @Basic
    @Column(name = "LAW_TYPE_3")
    public String getLawType3() {
        return lawType3;
    }

    public void setLawType3(String lawType3) {
        this.lawType3 = lawType3;
    }

    @Column(name = "LAW_NUMBER")
    public int getLawNumber() {
        return lawNumber;
    }

    public void setLawNumber(int lawNumber) {
        this.lawNumber = lawNumber;
    }

    @Column(name = "LAW_MODIFICATION_NUMBER")
    public int getLawModificationNumber() {
        return lawModificationNumber;
    }

    public void setLawModificationNumber(int lawModificationNumber) {
        this.lawModificationNumber = lawModificationNumber;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    @Column(name = "MODIFICATION_YEAR")
    public int getModificationYear() {
        return modificationYear;
    }

    public void setModificationYear(int modificationDate) {
        this.modificationYear = modificationDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfArticle() {
        return numberOfArticle;
    }

    public void setNumberOfArticle(int numberOfArticle) {
        this.numberOfArticle = numberOfArticle;
    }

    public String getLawAbstract() {
        return lawAbstract;
    }

    public void setLawAbstract(String reasonForIssuing) {
        this.lawAbstract = reasonForIssuing;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLawCategory() {
        return lawCategory;
    }

    public void setLawCategory(String lawCategory) {
        this.lawCategory = lawCategory;
    }


    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public Timestamp getAddedDate() {

        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
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

    public User getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(User modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(LocalDateTime modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public List<Legislation> getRelatedLegislation() {
        return relatedLegislation;
    }

    public void setRelatedLegislation(List<Legislation> relatedLegislation) {
        this.relatedLegislation = relatedLegislation;
    }

    public List<Legislation> getListOfModification() {
        return listOfModification;
    }

    public void setListOfModification(List<Legislation> listOfModification) {
        this.listOfModification = listOfModification;
    }

    @Basic
    @Column(name = "APPROVED")
    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

    public LocalDateTime getApprovedTime() {
        return approvedTime;
    }

    @Basic
    @Column(name = "APPROVED_TIME")
    public void setApprovedTime(LocalDateTime approvedTime) {
        this.approvedTime = approvedTime;
    }

    @Basic
    @Column(name = "COMMENT", length = 2000)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Protocols getProtocols() {
        return protocols;
    }

    public void setProtocols(Protocols protocols) {
        this.protocols = protocols;
    }
}
