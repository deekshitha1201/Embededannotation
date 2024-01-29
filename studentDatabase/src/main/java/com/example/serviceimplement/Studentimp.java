package com.example.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class Studentimp implements StudentService {
	@Autowired
	private StudentRepository sr;

	@Override
	public Student createstudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	@Override
	public List<Student> displayall() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Student finddetails(int id) {
		// TODO Auto-generated method stub
		return sr.getById(id);
	}

	

	

	

}
