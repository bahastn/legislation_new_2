package krd.legislation.legislation2.models;

import org.springframework.scheduling.annotation.Scheduled;

public class MiniLegislation {
    private Long lawId;
    private String lawTitle;

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
}
