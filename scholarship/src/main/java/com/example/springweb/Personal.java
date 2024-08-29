package com.example.springweb;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Personal {

	@Id
	private String email;
	private String name;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String dob;
	private String address;
	private String course;
	private String current_institution;
	private String gender;
	private int gpa;
	private String phone;
	private String year_of_study;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCurrent_institution() {
		return current_institution;
	}
	public void setCurrent_institution(String current_institution) {
		this.current_institution = current_institution;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getYear_of_study() {
		return year_of_study;
	}
	public void setYear_of_study(String year_of_study) {
		this.year_of_study = year_of_study;
	}
	
}
