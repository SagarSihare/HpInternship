package com.hp.employee.service;

import java.util.ArrayList;
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
	List <Employee> employees = new ArrayList();
	  employeeRepository.findAll()
			 .forEach(employees::add);
	  return employees;
}

public void AddEmployee(Employee employees) {
	employeeRepository.save(employees);
	
}


	}

	

	

	
	
	

