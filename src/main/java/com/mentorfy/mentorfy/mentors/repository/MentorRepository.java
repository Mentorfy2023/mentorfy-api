package com.mentorfy.mentorfy.mentors.repository;

import com.mentorfy.mentorfy.mentors.entity.Mentor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Long> {

}
