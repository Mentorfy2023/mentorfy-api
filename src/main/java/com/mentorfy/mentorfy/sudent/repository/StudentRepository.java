package com.mentorfy.mentorfy.sudent.repository;

import com.mentorfy.mentorfy.sudent.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
