package krd.legislation.legislation2.models;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ATTACHEMENTS")
public class Attachments {

    private Long attachmentId;
    private String fileName;
    private String fileType;
    private byte[] file;
    private Timestamp addedDate;

    @Id
    @Column(name = "ATTACHEMENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Long attachementId) {
        this.attachmentId = attachementId;
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

    @Lob
    @JoinColumn(name = "FILE")
    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
