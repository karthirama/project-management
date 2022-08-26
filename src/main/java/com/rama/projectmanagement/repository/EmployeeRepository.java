package com.rama.projectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rama.projectmanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	
}
