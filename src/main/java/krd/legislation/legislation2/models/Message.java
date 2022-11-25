package krd.legislation.legislation2.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Bahast Saber
 * @Project legislation
 * @Package krd.parliament.legislation.models
 * @date 13-Nov-21
 * @Time 11:36 AM
 */
public class Message {
    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;

    @Email
    private String phoneNumber;

    @NotNull
    @Min(10)
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
