package com.example.mapping.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mapping.dto.Student;
import com.example.mapping.repository.StudentRepo;

@Component
public class StudentDao 
{
	@Autowired
	StudentRepo studentRepo;
	
	public String insertStudent(Student student)
	{
		studentRepo.save(student);
		return "Inserted";
	}
	
	public Optional<Student> fetchStudentById(int id) 
	{
		return studentRepo.findById(id);
	}
	
	public List<Student> fetchAllStudent() 
	{
		List<Student> list=studentRepo.findAll();
		return list;
	}
}