package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mapping.dto.Course;
import com.example.mapping.service.CourseService;

@Controller
public class CourseController 
{
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/chtml")
	public String cHtml()
	{
		return "course";
	}
	
	@PostMapping("/ci")
	@ResponseBody
	public String insertCourse(@ModelAttribute Course course)
	{
//		System.out.println(course);
		return courseService.insertCourse(course);
	}
}