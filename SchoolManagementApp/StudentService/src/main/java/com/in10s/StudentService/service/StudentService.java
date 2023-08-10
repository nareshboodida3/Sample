package com.in10s.StudentService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.in10s.StudentService.dao.StudentRepo;
import com.in10s.StudentService.entity.Student;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
//	@Autowired
//	RestTemplate restTemplate;
	@Transactional
	public List<Student> fetchAllStudentsList() {
		
	//	ResponseEntity<String> respponse = restTemplate.getForEntity("http://nareshgoud:9991/findAllTeachersList", String.class);
		//System.out.println(respponse);
		List<Student> studentList = new ArrayList<>();
		studentRepo.findAll().forEach(sl -> studentList.add(sl));
		return studentList;
	}

	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}
}
