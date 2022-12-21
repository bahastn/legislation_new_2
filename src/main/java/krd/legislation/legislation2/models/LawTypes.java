package krd.legislation.legislation2.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "LAWTYPES")
public class LawTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lawTypeId;
    private Integer lawTypeNumber;
    private String lawType;
    private String lawTypeAr;
    private String lawTypeEn;

    public Long getLawTypeId() {
        return lawTypeId;
    }

    public void setLawTypeId(Long lawTypeId) {
        this.lawTypeId = lawTypeId;
    }

    @Column(name = "LAW_TYPE_SEQUESNCE")
    public Integer getLawTypeNumber() {
        return lawTypeNumber;
    }

    public void setLawTypeNumber(Integer lawTypeNumber) {
        this.lawTypeNumber = lawTypeNumber;
    }

    public String getLawType() {
        return lawType;
    }

    public void setLawType(String lawType) {
        this.lawType = lawType;
    }

    public String getLawTypeAr() {
        return lawTypeAr;
    }

    public void setLawTypeAr(String lawTypeAr) {
        this.lawTypeAr = lawTypeAr;
    }

    public String getLawTypeEn() {
        return lawTypeEn;
    }

    public void setLawTypeEn(String lawTypeEn) {
        this.lawTypeEn = lawTypeEn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LawTypes)) return false;
        LawTypes lawTypes = (LawTypes) o;
        return Objects.equals(getLawTypeId(), lawTypes.getLawTypeId()) && Objects.equals(getLawTypeNumber(), lawTypes.getLawTypeNumber()) && Objects.equals(getLawType(), lawTypes.getLawType()) && Objects.equals(getLawTypeAr(), lawTypes.getLawTypeAr()) && Objects.equals(getLawTypeEn(), lawTypes.getLawTypeEn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLawTypeId(), getLawTypeNumber(), getLawType(), getLawTypeAr(), getLawTypeEn());
    }
}
