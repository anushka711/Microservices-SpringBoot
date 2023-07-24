package com.demo.employee.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long departmentId;
	String name;
	int age;
	String position;
	
	public Employee() {
		
	}
	
	public Employee(Long id, Long departmentId, String name, int age, String position) {
		super();
		this.id = id;
		this.departmentId = departmentId;
		this.name = name;
		this.age = age;
		this.position = position;
	}

	public Long getId() {
		return id;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}
	
}
