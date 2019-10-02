package com.tro.tutorial.H2datase.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> getCourcesByEmployee(String employeeid) ;
	
	public List<Course> findByName(String name) ; // start by find + By + <filter>
	public List<Course> findByDescriptioin(String descriptioin) ;
	
	public List<Course> findByEmployeeId(String employeeid) ; // to find Course by EmployeeID
}
