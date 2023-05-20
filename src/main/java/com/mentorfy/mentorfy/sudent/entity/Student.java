package com.mentorfy.mentorfy.sudent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.EnumSet;

//TODO Написать триггер на увеличение возраста с каждым годом
@Entity
public class Student {

    @Id
    private Long id;
    @Column(name = "")
    private String name;
    @Column
    private String fullName;
    @Column
    private Byte age;
    @Column
    private String sex;
    @Column
    private Double developmentExperience;


    public Student(String name, String fullName, Byte age, String sex, Double developmentExperience) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.developmentExperience = developmentExperience;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getDevelopmentExperience() {
        return developmentExperience;
    }

    public void setDevelopmentExperience(Double developmentExperience) {
        this.developmentExperience = developmentExperience;
    }
}
