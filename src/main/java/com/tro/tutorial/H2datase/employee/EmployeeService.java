package com.tro.tutorial.H2datase.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

		private List<Employee> employees = Arrays.asList(
				new Employee("01", "Ahmed", "Sr JEE"),
				new Employee("02", "Omar", "Toddler"),
				new Employee("03", "Tiba", "Kid")
				);
	
	public List<Employee> getAllEmployees(){
		return this.employees;
	}
}
