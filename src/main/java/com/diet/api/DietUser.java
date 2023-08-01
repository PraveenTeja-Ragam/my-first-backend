package com.diet.api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DietUser {

	@Id
	String userName;
	String password;
	public DietUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DietUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
