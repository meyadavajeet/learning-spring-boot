package com.technicalajeet.springbootformvalidation.entities;


import javax.validation.constraints.*;

public class LoginData {

    @NotBlank(message = "User Name can not be null !!")
    @Size(min = 3, max = 50, message = "User Name must be greater than 3 and less than 50 characters !!")
    private String userName;

    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Must Provide valid email !!")
    private String email;

    @AssertTrue(message = "Must agree terms and condition")
    private boolean agreed;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", agreed=" + agreed +
                '}';
    }
}
