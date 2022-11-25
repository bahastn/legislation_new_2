package krd.legislation.legislation2.models;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "DOCUMENT_PDF")
public class DocumentPDF {

    private Long documentId;
    private String fileName;
    private String fileType;
    private byte[] file;
    private int fileSize;
    private Timestamp addedDate;

    @Id
    @Column(name = "DOCUMENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    @Column(name = "ADDED_DATE")

    public Timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Timestamp addedDate) {
        this.addedDate = addedDate;
    }

    @JoinColumn(name = "FILE_NAME")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JoinColumn(name = "FILE_TYPE")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    @Column(name = "FILE_SIZE")
    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Lob
    @JoinColumn(name = "FILE")
    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
