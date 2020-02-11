package com.tro.tutorial.H2datase.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@NotBlank
	private String firstname;
	private String lastname;
	private String description;
	
	public Employee() {
		super();
	}

	public Employee(
			@JsonProperty("id") 
			String id, 
			
			@JsonProperty("FirstName") 
			String firstname,
			
			@JsonProperty("LastName") 
			String lastname,
			
			@JsonProperty("description") 
			String description) {
		
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.description = description;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
 

	public String getDescriptioin() {
		return description;
	}

	public void setDescriptioin(String description) {
		this.description = description;
	}
	
	

}
