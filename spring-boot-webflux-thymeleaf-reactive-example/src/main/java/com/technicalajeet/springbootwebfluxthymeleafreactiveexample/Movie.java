package com.technicalajeet.springbootwebfluxthymeleafreactiveexample;

public class Movie {

    private String name;
    private Integer score;

    //getter, setter and constructor


    public Movie() {
    }

    public Movie(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
