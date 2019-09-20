package com.tro.tutorial.H2datase.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tro.tutorial.H2datase.model.Employee;

@RestController
public class WebContainer {
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return Arrays.asList(
				new Employee("01", "Ahmed", "Sr JEE"),
				new Employee("02", "Omar", "Toddler")
				); 
	}

}
