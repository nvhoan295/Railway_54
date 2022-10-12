package com.vti.entity;

public class User {
	private int id;
	private String fullName;
	private String email;
	private String password;
	private UserType userType;

	public enum UserType {
		ADMIN, EMPLOYESS
	}

	public User() {
	}

	public User(int id, String fullName, String email, String password, UserType userType) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + "]";
	}

}
