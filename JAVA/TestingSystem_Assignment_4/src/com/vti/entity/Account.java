package com.vti.entity;

import java.util.Arrays;
import java.util.Date;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private Date createDate;
	protected Group[] groups;
	
	

	public Account() {
		
	}
	
	public Account(int id, String email, String userName, String firstName,
	String lastName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
	}
	

	public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = new Date();
	}

	public Account(int id, String email, String userName, String firstName, String lastName, Position position, Date createDate) {
	
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate;
	}
	
	public Account(String fullName) {
		this.fullName = fullName;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}

	
	

}
