package com.in10s.TeacherService.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in10s.TeacherService.dao.TeacherRepo;
import com.in10s.TeacherService.entity.Teacher;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepo tRepo;

	public List<Teacher> getAllTeachersList() {

		List<Teacher> tList = new ArrayList<>(); // tRepo.findAllTeachers();
		@SuppressWarnings("unchecked")
		Iterator<Teacher> t = (Iterator<Teacher>) tRepo.findAllTeachers();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		return tList;
	}

	public Teacher addTeacher(Teacher teacher) {
		return tRepo.save(teacher);
	}

}
