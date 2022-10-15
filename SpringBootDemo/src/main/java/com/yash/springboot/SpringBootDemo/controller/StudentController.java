package com.yash.springboot.SpringBootDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springboot.SpringBootDemo.entity.StudentEntity;
import com.yash.springboot.SpringBootDemo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService; 

	@PostMapping("/save")
	public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {
		
		StudentEntity entity =  studentService.saveStudent(studentEntity);
		return entity;
	}
	
	@GetMapping("/getAllStudent")
	public List<StudentEntity> getAllStudent() {
		
		List<StudentEntity> listOfStudent = new ArrayList<StudentEntity>();
		listOfStudent = studentService.getAllStudent();
		return listOfStudent;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		String i = studentService.deleteStudentbyId(id);
		return i;
	}

	@GetMapping("/getByID/{id}")
	public StudentEntity getStudentById(@PathVariable("id") int id) {
		
		StudentEntity entity = new StudentEntity();
		entity = studentService.getStudentById(id);
		
		return entity;
	}
	
	@PutMapping("/update")
	public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
		
		StudentEntity entity = new StudentEntity();
		entity = studentService.updateStudentById(studentEntity);
		
		return entity;
	}
	
	
}
