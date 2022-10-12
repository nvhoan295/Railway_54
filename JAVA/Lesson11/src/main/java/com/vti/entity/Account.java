package com.vti.entity;

public class Account {
	private int accountID;
	private String email;
	private String username;
	private String fullName;

	public Account(int accountID, String email, String username, String fullName) {
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
	}

	public int getAccountID() {
		return accountID;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", username=" + username + ", fullName="
				+ fullName + "]";
	}

}
