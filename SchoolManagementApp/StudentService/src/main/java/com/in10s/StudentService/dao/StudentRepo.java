package com.in10s.StudentService.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.in10s.StudentService.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {

}
