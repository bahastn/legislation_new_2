package krd.legislation.legislation2.models;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    private Long userId;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
