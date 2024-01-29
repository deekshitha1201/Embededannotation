package com.example.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Xclassdetails {
	private double Xmarks;
	private String cityname;
	private String school;
	public double getXmarks() {
		return Xmarks;
	}
	public void setXmarks(int xmarks) {
		Xmarks = xmarks;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	

}
