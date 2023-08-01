package com.diet.api;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	int id;
	String name;
	String collegeName;
	String branch;
	int sem1;
	int sem2;
	int sem3;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String collegeName, String branch, int sem1, int sem2, int sem3) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.branch = branch;
		this.sem1 = sem1;
		this.sem2 = sem2;
		this.sem3 = sem3;
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
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSem1() {
		return sem1;
	}
	public void setSem1(int sem1) {
		this.sem1 = sem1;
	}
	public int getSem2() {
		return sem2;
	}
	public void setSem2(int sem2) {
		this.sem2 = sem2;
	}
	public int getSem3() {
		return sem3;
	}
	public void setSem3(int sem3) {
		this.sem3 = sem3;
	}
	
}
