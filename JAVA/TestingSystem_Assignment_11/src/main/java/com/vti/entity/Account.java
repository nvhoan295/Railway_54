package com.vti.entity;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 13, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 13, 2022
 */
public class Account {
	private int id;
	private String email;
	private String username;
	private String fullName;

	/**
	 * Constructor for class Account.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 12, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 12, 2022
	 */
	public Account() {
	}

	/**
	 * Constructor for class Account.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param id
	 * @param email
	 * @param username
	 * @param fullName
	 */
	public Account(int id, String email, String username, String fullName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
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
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullName=" + fullName + "]";
	}

}
