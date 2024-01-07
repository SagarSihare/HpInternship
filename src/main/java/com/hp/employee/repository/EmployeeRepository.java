package com.hp.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hp.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {

	

}
