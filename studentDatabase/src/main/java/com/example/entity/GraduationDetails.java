package com.example.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class GraduationDetails {
	private int gmarks;
	private String gclg;
	private String stream;
	public int getGmarks() {
		return gmarks;
	}
	public void setGmarks(int gmarks) {
		this.gmarks = gmarks;
	}
	public String getGclg() {
		return gclg;
	}
	public void setGclg(String gclg) {
		this.gclg = gclg;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	

}
