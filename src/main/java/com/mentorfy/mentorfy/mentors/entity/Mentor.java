package com.mentorfy.mentorfy.mentors.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Entity
@Component
public class Mentor {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "sex")
    private String sex;
    @Column(name = "age")
    private Byte age;
    @Column(name = "dev_experience")
    private Double developmentExperience;
    @Column(name = "mentor_experience")
    private Double mentorExperience;
    @Column(name = "about_myself")
    private String aboutMyself;

    @OneToMany
    @JoinColumn(name = "student_id")
    private Set<Student> students;

    public Mentor() {

    }

    public Mentor(Long id, String name, String lastName, String sex, Byte age, Double developmentExperience,
                  Double mentorExperience, String aboutMyself, Set<Student> students) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.developmentExperience = developmentExperience;
        this.mentorExperience = mentorExperience;
        this.aboutMyself = aboutMyself;
        this.students = students;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Double getDevelopmentExperience() {
        return developmentExperience;
    }

    public void setDevelopmentExperience(Double developmentExperience) {
        this.developmentExperience = developmentExperience;
    }

    public Double getMentorExperience() {
        return mentorExperience;
    }

    public void setMentorExperience(Double mentorExperience) {
        this.mentorExperience = mentorExperience;
    }

    public String getAboutMyself() {
        return aboutMyself;
    }

    public void setAboutMyself(String aboutMyself) {
        this.aboutMyself = aboutMyself;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
