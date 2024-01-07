package com.hp.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employees")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private   Long  employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String title;
	
}






//first_name, last_name, employee_id, email, and title.

