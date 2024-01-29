package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService ss;
	@PostMapping("/save")
	public ResponseEntity<Student> Create(@RequestBody Student student)
	{
		Student s=ss.createstudent(student);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	@GetMapping("/alldata")
	public ResponseEntity<List<Student>> retrive() {
		List<Student> l=ss.displayall();
		return new ResponseEntity<List<Student>>(l,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Student> find(@PathVariable int id)
	{
		Student st=ss.finddetails(id);
		return new ResponseEntity<Student>(st,HttpStatus.OK);
		
	}

}
