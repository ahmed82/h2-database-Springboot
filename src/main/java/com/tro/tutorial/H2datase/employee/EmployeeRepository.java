package com.tro.tutorial.H2datase.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	//getAllEmployees()

}
