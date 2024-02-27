package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.dto.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{

}