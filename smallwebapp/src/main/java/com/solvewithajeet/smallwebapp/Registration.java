package com.solvewithajeet.smallwebapp;

import javax.persistence.*;
import java.util.Arrays;
@Entity
@Table(name = "tbl_reg")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UID;
    private String name;
    private String email;
    private String password;
    private Byte gender;
    private String[] hobby;

    /**
     * empty constructor
     */
    public Registration(){}

    public Long getUID() {
        return UID;
    }

    public void setUID(Long UID) {
        this.UID = UID;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Registration(Long UID, String name, String email, String password, byte gender, String[] hobby) {
        this.UID = UID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
