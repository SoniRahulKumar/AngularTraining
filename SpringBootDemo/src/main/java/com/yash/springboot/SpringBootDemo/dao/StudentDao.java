package com.yash.springboot.SpringBootDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.springboot.SpringBootDemo.entity.StudentEntity;

@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Integer>{

}
