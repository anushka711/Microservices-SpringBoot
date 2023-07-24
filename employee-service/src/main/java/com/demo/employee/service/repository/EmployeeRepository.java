package com.demo.employee.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.employee.service.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{


}
