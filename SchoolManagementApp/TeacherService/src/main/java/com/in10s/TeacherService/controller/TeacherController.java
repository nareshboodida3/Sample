package com.in10s.TeacherService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in10s.TeacherService.entity.Teacher;
import com.in10s.TeacherService.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService tservice;

	@GetMapping("/testTeacherService")
	public String testTeacherService() {
		return "Teacher service is working :) ";
	}

	@GetMapping(path = "/findAllTeachersList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Teacher> fetchAllTeachers() {

		return tservice.getAllTeachersList();
	}

	@PostMapping(path = "/addTeacher", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		System.out.println(teacher);
		if (teacher.getName() == null) {
			System.out.println("Invalid data");
			return teacher;
		}
		return tservice.addTeacher(teacher);
	}
}
