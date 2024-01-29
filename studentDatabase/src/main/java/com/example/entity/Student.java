package com.example.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotNull(message= "please enter name of the student")
	private String name;
	@NotNull(message="age should be not null")
	@Min(5)
	@Max(25)
	private int age;
	@NotNull(message="enter the city")
	private String city;
	@Email
	private String email;
	@Pattern(regexp="^[6-9]\\d{9}$",message="invalid phone number")
	private String ph;
	@Min(35)
	@Max(100)
	private double marks;
	@Embedded
	private Xclassdetails xclassdetails;
	@Embedded
	private IntermediateDetails interdetails;
	@Embedded
	private GraduationDetails gdetails;
	public GraduationDetails getGdetails() {
		return gdetails;
	}
	public void setGdetails(GraduationDetails gdetails) {
		this.gdetails = gdetails;
	}
	public IntermediateDetails getInterdetails() {
		return interdetails;
	}
	public void setInterdetails(IntermediateDetails interdetails) {
		this.interdetails = interdetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public Xclassdetails getXclassdetails() {
		return xclassdetails;
	}
	public void setXclassdetails(Xclassdetails xclassdetails) {
		this.xclassdetails = xclassdetails;
	}
	
	

}
