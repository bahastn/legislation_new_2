package krd.legislation.legislation2.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {
    private Long userId;
    private int privilageValue;
    private Timestamp createdDate;
    @NotBlank(message = "Enter Your password")
    @Size(min = 6, message = "Password must be at least 6 characters ")
    private String password;
    @Email
    @UniqueElements
    @NotBlank(message = "Enter valid Email address")
    private String userName;
    private boolean promptPasswordChange;
    @NotBlank(message = "Role Can't be blank")
    private String role;
    private int active;
    private String permission;
    @NotBlank(message = "First Name Can't be blank")
    private String firstName;
    private String middleName;
    @NotBlank(message = "Last Name Can't be blank")
    private String lastName;
    private String jobTitle;
    private String phoneNumber;

    public User() {
    }

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "PRIVILAGE_VALUE")
    public int getPrivilageValue() {
        return privilageValue;
    }

    public void setPrivilageValue(int privilageValue) {
        this.privilageValue = privilageValue;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    @CreationTimestamp
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PROMPT_PASSWORD_CHANGE")
    public boolean isPromptPasswordChange() {
        return promptPasswordChange;
    }

    public void setPromptPasswordChange(boolean promptPasswordChange) {
        this.promptPasswordChange = promptPasswordChange;
    }

    @Basic
    @Column(name = "ROLES")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "ACTIVE")
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Basic
    @Column(name = "PERMISSIONS")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "MIDDLE_NAME")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleNmae) {
        this.middleName = middleNmae;
    }

    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "JOB_TITLE")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "PHONE_NUMBER")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Transient
    public List<String> getListOfRoles() {
        if (this.role.length() > 0) {
            return Arrays.asList(this.role.split(","));
        }
        return new ArrayList<>();
    }

    @Transient
    public List<String> getListOfPermissions() {
        if (this.permission.length() > 0) {
            return Arrays.asList(this.permission.split(","));
        }
        return new ArrayList<>();
    }


}