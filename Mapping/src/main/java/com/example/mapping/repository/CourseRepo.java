package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.dto.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, String>
{

}