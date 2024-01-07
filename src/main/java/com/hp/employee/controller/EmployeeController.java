package com.hp.employee.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hp.employee.model.Employee;
import com.hp.employee.repository.EmployeeRepository;
import com.hp.employee.service.EmployeeService;

@RestController

public class EmployeeController {
     
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getalltopics() {
		return employeeService.getAllEmployee();
}
	
	
	
//	@RequestMapping("/Employees/{id}")
//	public Employee getEmployee(@PathVariable Long id) {
//		return employeeservice.getEmployee(id);
//	}
	
	@PostMapping("/employees")
	public void AddEmployee(@RequestBody Employee employee ) {
		
		System.out.println(employee.getEmployee_id());
		Random random = new Random();

        // Generate a random Long object
//        Long randomLongObject = random.nextLong();
//        employee.setEmployee_id(Long.valueOf(2));
		employeeRepository.save(employee);
	}
	
	
	//@RequestMapping(method=RequestMethod.POST ,value="/Employees")
	//public void addEmployee(@RequestBody Employee employee) {
	//	employeeservice.AddEmployee(employee);
	//}
	
	
//	
//	@RequestMapping(method=RequestMethod.PUT ,value="/Employees/{id}")
//	public void UpdateTopic(@RequestBody Employee employee ,@PathVariable Long id  ) {
//		employeeservice.UpdateEmployee( id ,employee);
//		
//	}
	
	
}
