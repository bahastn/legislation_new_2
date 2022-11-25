package krd.legislation.legislation2.models;

import javax.persistence.*;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.models
 * @date 21-Nov-21
 * @Time 9:40 AM
 */
@Entity
@Table(name = "PROTOCALS")
public class Protocols {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long protocolId;
    private String protocolTitle;
    private Integer protocolNumber;
    private int protocolIssueYear;
    private int pageNumberFrom;
    private int getPageNumberTo;
    private String path;

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public String getProtocolTitle() {
        return protocolTitle;
    }

    public void setProtocolTitle(String protocolTitle) {
        this.protocolTitle = protocolTitle;
    }

    public Integer getProtocolNumber() {
        return protocolNumber;
    }

    public void setProtocolNumber(Integer protocolNumber) {
        this.protocolNumber = protocolNumber;
    }

    public int getProtocolIssueYear() {
        return protocolIssueYear;
    }

    public void setProtocolIssueYear(int protocolIssueYear) {
        this.protocolIssueYear = protocolIssueYear;
    }

    public int getPageNumberFrom() {
        return pageNumberFrom;
    }

    public void setPageNumberFrom(int pageNumberFrom) {
        this.pageNumberFrom = pageNumberFrom;
    }

    public int getGetPageNumberTo() {
        return getPageNumberTo;
    }

    public void setGetPageNumberTo(int getPageNumberTo) {
        this.getPageNumberTo = getPageNumberTo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
