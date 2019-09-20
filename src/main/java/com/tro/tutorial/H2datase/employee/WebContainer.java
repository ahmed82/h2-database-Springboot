package com.tro.tutorial.H2datase.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebContainer {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return Arrays.asList(
				new Employee("01", "Ahmed", "Sr JEE"),
				new Employee("02", "Omar", "Toddler")
				); 
	}
	
	public Employee findEmployee(@RequestParam String id){
		
			return null;
	}

}
