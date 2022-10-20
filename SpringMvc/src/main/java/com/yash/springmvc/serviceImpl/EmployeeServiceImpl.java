package com.yash.springmvc.serviceImpl;

import java.util.List;

import com.yash.springmvc.dao.EmployeeDao;
import com.yash.springmvc.entity.Employee;
import com.yash.springmvc.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public int deletedetails(int i) {

		int result = employeeDao.deletedetails(i);

		return result;
	}

	public List<Employee> getAllDetails() {

		List<Employee> employeeList = employeeDao.getAllDetails();
		
		return employeeList;
	}

}
