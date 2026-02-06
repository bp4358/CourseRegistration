package com.college.CourseRegistrationRESTful.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.CourseRegistrationRESTful.Entity.Course;
import com.college.CourseRegistrationRESTful.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService service;
	
	@GetMapping("/courses")
	public Map<Integer,String> fetchAllCourses(){
		return service.fetchAllCourse();
	}

}
