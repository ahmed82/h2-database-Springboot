package com.tro.tutorial.H2datase.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String id;
	private String name;
	private String descriptioin;
	
	public Employee() {
		super();
	}

	public Employee(String id, String name, String descriptioin) {
		super();
		this.id = id;
		this.name = name;
		this.descriptioin = descriptioin;
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
