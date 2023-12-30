package com.hp.employee.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.employee.model.Employee;
import com.hp.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
@Autowired
private EmployeeRepository employeeRepository;

public List<Employee> getAllEmployee(){
	 return employeeRepository.findAll();
}
	
	
		
	}

	

	

	
	
	

