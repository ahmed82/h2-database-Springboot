package com.tro.tutorial.H2datase.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebContainer {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	 // findEmployee(@PathVariable("foo") String id){
	@RequestMapping("/employees/{id}")
	public Employee findEmployee(@PathVariable String id){
			return employeeService.getEmployee(id);
	}

}
