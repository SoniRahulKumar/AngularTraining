package com.yash.springmvc.daoImpl;

import java.util.ArrayList;
import java.util.List;

import com.yash.springmvc.dao.EmployeeDao;
import com.yash.springmvc.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {


	public int deletedetails(int id) {

		return id;
	}

	public List<Employee> getAllDetails() {
		
		List<Employee> employees = getListOfEmp();
		
		return employees;
	}

	public List<Employee> getListOfEmp() {
		
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setName("Ram");
		employee1.setSalary(10000);
		
		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("Rama");
		employee2.setSalary(20000);
		
		employees.add(employee1);
		employees.add(employee2);
		
		return employees;
	}
}
