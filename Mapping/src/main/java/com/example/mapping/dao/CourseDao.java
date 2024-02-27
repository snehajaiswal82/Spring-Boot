package com.example.mapping.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mapping.dto.Course;
import com.example.mapping.repository.CourseRepo;

@Component
public class CourseDao 
{
	@Autowired
	CourseRepo courseRepo;
	
	public String insertCourse(Course course)
	{
		courseRepo.save(course);
		return "Inserted";
	}

	public Course fetchCourse(String cn) 
	{
		Optional<Course> co=courseRepo.findById(cn);
		return co.get();
	}
}