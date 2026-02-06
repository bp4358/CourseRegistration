package com.college.CourseRegistrationRESTful.service;


import com.college.CourseRegistrationRESTful.Entity.Student;
import com.college.CourseRegistrationRESTful.repository.CourseRepository;
import com.college.CourseRegistrationRESTful.repository.StudentRepository;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {
	@Autowired
    private   StudentRepository repo;
	@Autowired
	private CourseRepository courseRepo;

    public Student addStudent(Student student){ 
    	return repo.save(student); 
    	}

    public List<Student> listStudent(){ return repo.findAll(); }

    public Student fetchStudentById(int id){
        Optional<Student> student = repo.findById(id);
        return student.isEmpty() ? null : student.get();
    }

    public Student updateStudent(int id,Student student){
        Optional<Student> byId = repo.findById(id);
        if(byId.isEmpty()){ return null; }
        student.setId(id);
        return  repo.save(student);
    }

    public String deleteStudentById(int id){
        Optional<Student> byId = repo.findById(id);
        if(byId.isEmpty()){ return "Data Not Found"; }
        repo.delete(byId.get());
        return "Deleted Successfully";
    }
}
