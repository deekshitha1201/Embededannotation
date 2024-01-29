package com.example.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class IntermediateDetails {
	private double imarks;
	private String icity;
	private String clgname;
	public double getImarks() {
		return imarks;
	}
	public void setImarks(double imarks) {
		this.imarks = imarks;
	}
	public String getIcity() {
		return icity;
	}
	public void setIcity(String icity) {
		this.icity = icity;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	

}
