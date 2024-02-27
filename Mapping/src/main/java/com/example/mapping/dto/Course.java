package com.example.mapping.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course 
{
	@Id
	private String name;
	private int fees;
	private String duration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", fees=" + fees + ", duration=" + duration + "]";
	}
}