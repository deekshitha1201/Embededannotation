package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Student;

@Service
public interface StudentService {
	

	public Student createstudent(Student student);
	public List<Student> displayall();
	public Student finddetails(int id);

}
