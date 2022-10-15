package com.yash.springboot.SpringBootDemo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.springboot.SpringBootDemo.dao.StudentDao;
import com.yash.springboot.SpringBootDemo.entity.StudentEntity;
import com.yash.springboot.SpringBootDemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public StudentEntity saveStudent(StudentEntity studentEntity) {
		StudentEntity entity = new StudentEntity();
		entity = studentDao.save(studentEntity);
		return entity;
	}

	public List<StudentEntity> getAllStudent() {

		List<StudentEntity> listOfStudent = new ArrayList<StudentEntity>();

		try {
			listOfStudent = studentDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listOfStudent;
	}

	public String deleteStudentbyId(int id) {
		studentDao.deleteById(id);
		return "Succes";
	}

	public StudentEntity getStudentById(int id) {
		StudentEntity entity = new  StudentEntity();
		entity = studentDao.findById(id).get();
		return entity;
	}

	@Override
	public StudentEntity updateStudentById(StudentEntity studentEntity) {
		StudentEntity entity = new  StudentEntity();
		entity = studentDao.save(studentEntity);
		return entity;
	}

}
