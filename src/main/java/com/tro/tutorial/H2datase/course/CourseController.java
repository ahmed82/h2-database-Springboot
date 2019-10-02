package com.tro.tutorial.H2datase.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tro.tutorial.H2datase.employee.Employee;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courcesService;
	
	
	@GetMapping("/employees/{id}/cources")
	public List<Course> getAllCourses(@PathVariable String id){
		return courcesService.getAllCourses(id);
	}
	 // findEmployee(@PathVariable("foo") String id){
	@RequestMapping("/employees/{employeeId}/cources/{id}")
	public Optional<Course> getCourse(@PathVariable String id){
			return courcesService.getCourse(id);
	}
	
	//@RequestMapping(value="/employees",method=RequestMethod.POST )
	@PostMapping("/employees/{employeeId}/cources")
	public void addCourse(@RequestBody Course cource, @PathVariable String employeeId){
		cource.setEmployee(new Employee(employeeId, "", ""));
		courcesService.addCourses(cource);
	}
	
	@RequestMapping(value="/employees/{emploueeId}/cources/{id}",method=RequestMethod.PUT)
	public void updateCourse(@RequestBody Course cource, @PathVariable String id, @PathVariable String employeeId){
		cource.setEmployee(new Employee(employeeId, "", ""));
		courcesService.updateCourses(cource);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{emploueeId}/cources/{id}")
	public void deleteEmployee(@PathVariable String id){
			 courcesService.deleteCourses(id);
	}

}
