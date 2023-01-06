package com.maria.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maria.crud.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
