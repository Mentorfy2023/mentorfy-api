package com.mentorfy.mentorfy.sudent.service;


import com.mentorfy.mentorfy.sudent.entity.Student;

public interface SearchStudentService {
    Student getByName(String name);
    Student getByFullName(String fullName);
}
