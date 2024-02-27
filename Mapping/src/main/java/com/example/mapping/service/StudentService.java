package com.example.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.StudentDao;
import com.example.mapping.dto.Student;

@Service
public class StudentService 
{
	@Autowired
	StudentDao studentDao;

	public String insertStudent(Student student) 
	{
		return studentDao.insertStudent(student);
	}
	
	public Student fetchStudentById(int id)
	{
		Optional<Student> od=studentDao.fetchStudentById(id);
		if(od.isPresent())
			return od.get();
		else 
			return null;
	}
	
	public List<Student> fetchAllStudent()
	{
		List<Student> list=studentDao.fetchAllStudent();
		if(list.isEmpty())
			return null;
		else
			return list;
	}
}