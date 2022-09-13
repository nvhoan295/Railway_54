package com.vti.entity;

import java.util.Arrays;
import java.util.Date;

public class Group {
	private int id;
	private String name;
	private Account creator;
	private Account[] accounts;
	private Date createDate;

	public Group() {
	}
	
	public Group(String name, Account creator, Account[] accounts, Date createDate) {
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}
	
	
	public Group(int id, String name, Account creator, String[] userNames, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		
		Account[] accounts = new Account[userNames.length];
		for (int i = 0; i < userNames.length; i++) {
			accounts[i] = new Account(userNames[i]);
		}
		
		this.createDate = createDate;
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

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", accounts=" + Arrays.toString(accounts)
				+ ", createDate=" + createDate + "]";
	}

	

}
