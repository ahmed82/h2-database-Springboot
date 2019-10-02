package com.tro.tutorial.H2datase.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

		private List<Employee> employees = Arrays.asList(
				new Employee("as", "Ahmed", "Sr JEE"),
				new Employee("os", "Omar", "Toddler"),
				new Employee("ts", "Tiba", "Kid")
				);
	
	public List<Employee> getAllEmployees(){
		return this.employees;
	}

	public Employee getEmployee(String id) {
		return employees.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
