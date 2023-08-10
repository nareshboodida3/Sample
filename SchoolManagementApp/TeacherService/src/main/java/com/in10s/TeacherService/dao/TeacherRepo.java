package com.in10s.TeacherService.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.in10s.TeacherService.entity.Teacher;

public interface TeacherRepo extends CrudRepository<Teacher, Long>{

	@Query("SELECT id,name,qualification FROM Teacher" )
	public Iterator<Teacher> findAllTeachers();
	 
}
