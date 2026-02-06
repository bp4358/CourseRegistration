package com.college.CourseRegistrationApp.requestBody;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StudentRequest {
    private String name;
    private int usn;
    private List<Integer> courseId;
    
	public StudentRequest() {
		super();
	}
	public StudentRequest(String name, int usn, List<Integer> courseId) {
		super();
		this.name = name;
		this.usn = usn;
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public List<Integer> getCourseId() {
		return courseId;
	}
	public void setCourseId(List<Integer> courseId) {
		this.courseId = courseId;
	}
    
}
