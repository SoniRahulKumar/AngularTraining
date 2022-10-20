package com.yash.springmvc.dao;

import java.util.List;

import com.yash.springmvc.entity.Employee;

public interface EmployeeDao {

	int deletedetails(int i);

	List<Employee> getAllDetails();

}
