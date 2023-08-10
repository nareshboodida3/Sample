package com.in10s.StudentService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in10s.StudentService.entity.Student;
import com.in10s.StudentService.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/StudentTest")
	public String test() {
		return "Hi I am working fine";
	}
	@GetMapping("/StudentList")
	public List<Student> findAllStudents(){
		return studentService.fetchAllStudentsList();
	}
	@PostMapping("/SaveStudent") 
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
}
