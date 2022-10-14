package com.vti.entity;

public class User {
	private int id;
	private String fullName;
	private String email;
	private String password;
	private String userType;
	private String proSkill;
	private int expInYear;


	public User() {
	}

	

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 14, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 14, 2022
	 * @param id
	 * @param fullName
	 * @param email
	 * @param password
	 * @param userType
	 * @param proSkill
	 * @param expInYear
	 */
	public User(int id, String fullName, String email, String password, String userType, String proSkill,
			int expInYear) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.proSkill = proSkill;
		this.expInYear = expInYear;
	}



	


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}



	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}



	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}



	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}



	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}



	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", userType=" + userType + ", proSkill=" + proSkill + ", expInYear=" + expInYear + "]";
	}

	

}
