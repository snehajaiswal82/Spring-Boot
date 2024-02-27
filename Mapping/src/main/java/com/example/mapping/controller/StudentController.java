package com.example.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mapping.dto.Course;
import com.example.mapping.dto.Student;
import com.example.mapping.service.CourseService;
import com.example.mapping.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/shtml")
	public String stdHtml()
	{
		return "student";
	}
	
	@PostMapping("/si")
	@ResponseBody
	public String insertStudent(@ModelAttribute Student student)
	{
		System.out.println(student);
		String cn=student.getCoursename();
		Course course=courseService.fetchCourse(cn);
		student.setCourse(course);
		System.out.println(student);
		
		return studentService.insertStudent(student);
	}
	
	@GetMapping("/fsid")
	public String fetchStudentById(@RequestParam int id,ModelMap map)
	{
		Student student=studentService.fetchStudentById(id);
		map.put("object", student);
		return "fetchid";
	}
	
	@GetMapping("/fall")
	public String fetchAllStudent(ModelMap map)
	{
		List<Student> list=studentService.fetchAllStudent();
		map.put("objects", list);
		return "fetchall";
	}
}