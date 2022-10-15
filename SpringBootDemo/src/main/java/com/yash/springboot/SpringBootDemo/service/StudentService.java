package com.yash.springboot.SpringBootDemo.service;

import java.util.List;

import com.yash.springboot.SpringBootDemo.entity.StudentEntity;

public interface StudentService {

	StudentEntity saveStudent(StudentEntity studentEntity);

	List<StudentEntity> getAllStudent();

	String deleteStudentbyId(int id);

	StudentEntity getStudentById(int id);

	StudentEntity updateStudentById(StudentEntity studentEntity);

}
