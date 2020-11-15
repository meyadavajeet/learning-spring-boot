package com.solvewithajeet.springbootrestapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int author_id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    private String language;

    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Author() {
    }

    public Author(int author_id, String firstname, String lastname, String language) {
        this.author_id = author_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Author [author_id=" + author_id + ", firstname=" + firstname + ", language=" + language + ", lastname="
                + lastname + "]";
    }

}
