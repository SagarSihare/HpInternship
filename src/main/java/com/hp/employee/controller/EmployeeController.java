package com.hp.employee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hp.employee.model.Employee;
import com.hp.employee.service.EmployeeService;

@RestController

public class EmployeeController {
     
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping("/Employees")
	public List<Employee> getalltopics() {
		return employeeservice.getAllEmployee();
}
	
//	@RequestMapping("/Employees/{id}")
//	public Employee getEmployee(@PathVariable Long id) {
//		return employeeservice.getEmployee(id);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST ,value="/Employees")
//	public void addTopic(@RequestBody Employee employee) {
//		employeeservice.addEmployee(employee);
//		
//	}
//	
//	@RequestMapping(method=RequestMethod.PUT ,value="/Employees/{id}")
//	public void UpdateTopic(@RequestBody Employee employee ,@PathVariable Long id  ) {
//		employeeservice.UpdateEmployee( id ,employee);
//		
//	}
	
	
}
