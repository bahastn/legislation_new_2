package krd.legislation.legislation2.models;

import javax.persistence.*;

@Entity
@Table(name = "LAW_TYPE")
public class LawType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lawTypeId;
    private String lawTypeName;

    public Long getLawTypeId() {
        return lawTypeId;
    }

    public void setLawTypeId(Long lawTypeId) {
        this.lawTypeId = lawTypeId;
    }

    @Basic
    @Column(name = "LAW_TYPE", unique = true)
    public String getLawTypeName() {
        return lawTypeName;
    }

    public void setLawTypeName(String lawTypeName) {
        this.lawTypeName = lawTypeName;
    }
}
