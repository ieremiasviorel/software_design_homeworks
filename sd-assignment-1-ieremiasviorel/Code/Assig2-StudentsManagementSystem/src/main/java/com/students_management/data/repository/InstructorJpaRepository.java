package com.students_management.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students_management.data.entity.Instructor;

@Repository
public interface InstructorJpaRepository extends JpaRepository<Instructor, Long> {

}
