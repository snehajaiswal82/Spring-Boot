package com.example.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.CourseDao;
import com.example.mapping.dto.Course;

@Service
public class CourseService 
{
	@Autowired
	CourseDao courseDao;
	
	public String insertCourse(Course course)
	{
		return courseDao.insertCourse(course);
	}

	public Course fetchCourse(String cn) 
	{
		return courseDao.fetchCourse(cn);
	}
}