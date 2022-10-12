package com.vti.entity;

public class Admin extends User {
	private int expInYear;

	public Admin(int id, String fullName, String email, String password, UserType userType, int expInYear) {
		super(id, fullName, email, password, userType);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Admin [expInYear=" + expInYear + ", getId()=" + getId() + ", getFullName()=" + getFullName()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + "]";
	}

	

}
