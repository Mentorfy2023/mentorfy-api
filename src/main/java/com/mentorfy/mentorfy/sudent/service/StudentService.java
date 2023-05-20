package com.mentorfy.mentorfy.sudent.service;


import com.mentorfy.mentorfy.sudent.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();
    Student create(Student student);
    Student update(Student student);
    void delete(Student student);

}
