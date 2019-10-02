package com.tro.tutorial.H2datase.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.tro.tutorial.H2datase.employee.Employee;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String descriptioin;
	
	@ManyToOne
	private Employee employee;
	
	public Course() {
		super();
	}

	public Course(String id, String name, String descriptioin, String employeeId) {
		super();
		this.id = id;
		this.name = name;
		this.descriptioin = descriptioin;
		this.employee = new Employee(employeeId, "", "");
	}
	
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptioin() {
		return descriptioin;
	}

	public void setDescriptioin(String descriptioin) {
		this.descriptioin = descriptioin;
	}
	
	

}
