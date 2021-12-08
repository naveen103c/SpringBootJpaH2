package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.springBoot.model.*;
import com.springBoot.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();		
	}
	/*
	@GetMapping
	public Student getStudent(){
		return Student;
	}
	*/

}
