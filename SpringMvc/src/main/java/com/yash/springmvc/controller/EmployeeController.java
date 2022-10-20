package com.yash.springmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.springmvc.entity.Employee;
import com.yash.springmvc.service.EmployeeService;
import com.yash.springmvc.serviceImpl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	private static EmployeeService employeeDao = new EmployeeServiceImpl();

	@RequestMapping("/employee")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Hello World!");

		List<Employee> employees = employeeDao.getAllDetails();
		for (Employee e1 : employees) {
			System.out.println(e1.toString());
		}

		return "employee";
	}
}
