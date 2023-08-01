package com.diet.api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Id;
	String name;
	String address;
	String phoneNo;
	String pincode;
	String course;
	String email;
	public StudentRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentRegistration(int id, String name, String address, String phoneNo, String pincode, String course,
			String email) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.pincode = pincode;
		this.course = course;
		this.email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
