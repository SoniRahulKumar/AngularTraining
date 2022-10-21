package com.yash.orm;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.orm.dao.EmployeeDao;
import com.yash.orm.entities.Employee;

public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/orm/config.xml");
		EmployeeDao empDao = context.getBean("employeeDao", EmployeeDao.class);
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Rahul Soni");
		emp.setEmail("soni.rahul@yash.com");
		// emp = new Employee("3","Soni","soni@yash.com");
		// Insert data of employee
		 empDao.insert(emp);
		// emp.setEmpId(3);
		// emp.setEmpName("Rahul");
		// emp.setEmail("rahul.soni@yash.com");
		// empDao.insert(emp);
		// Update data of employee
		// empDao.update(emp);
		// Delete data from database
		// empDao.delete(emp);
		// Get all employees detail
		//empDao.getAllEmployeeList();
		// Get employee detail from empId by database
		//empDao.getEmployeeById(emp.getEmpId());

	}

}
