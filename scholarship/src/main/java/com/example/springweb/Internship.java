package com.example.springweb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Internship {

	@Id
	private String email;
	private String name;
	private String address;
	private int year;
	private String phone;
	private String college_location;
	private String degree;
	private String internship_duration;
	private String skills;
	private String University;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCollege_location() {
		return college_location;
	}
	public void setCollege_location(String college_location) {
		this.college_location = college_location;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getInternship_duration() {
		return internship_duration;
	}
	public void setInternship_duration(String internship_duration) {
		this.internship_duration = internship_duration;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String university) {
		University = university;
	}
	
	
}
