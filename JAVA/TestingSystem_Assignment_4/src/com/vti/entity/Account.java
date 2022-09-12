package com.vti.entity;

import java.util.Date;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private Position position;
	protected Date createDate;

// Câu a
	public Account() {
	}

// Câu b
	public Account(int id, String email, String userName, String fullName) {

		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}

// Câu c
	public Account(int id, String email, String userName, String fullName, Position position) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = new Date();
	}

	public Account(int id, String email, String userName, String fullName, Position position, Date createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
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

	
}
