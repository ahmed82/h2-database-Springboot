package com.tro.tutorial.H2datase.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository employeeRepository;

	
	public List<Course> getAllCourses(String employeeId){
		List<Course> courses = new ArrayList<>();
		employeeRepository.findByEmployeeId(employeeId)
				.forEach(courses::add);
		  return courses;
	}

	public Optional<Course> getCourse(String id) {
		return employeeRepository.findById(id);

	}

	public void addCourses(Course courses) {
		employeeRepository.save(courses);
		
	}

	public void updateCourses(Course courses) {
		employeeRepository.save(courses);
	}

	public void deleteCourses(String id) {
		employeeRepository.deleteById(id);
	}
}
