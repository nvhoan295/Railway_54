//
package com.vti.entity;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 21, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 21, 2022
 */
public class User {
	private int id;
	private String fullName;
	private String email;
	private String passWord;
	private String role;
	private int expInYear;
	private String proSkill;
	private int projectId;

	

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 21, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 21, 2022
	 * @param id
	 * @param fullName
	 * @param email
	 * @param passWord
	 * @param role
	 * @param expInYear
	 * @param proSkill
	 * @param projectId
	 */
	public User(int id, String fullName, String email, String passWord, String role, int expInYear, String proSkill,
			int projectId) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.passWord = passWord;
		this.role = role;
		this.expInYear = expInYear;
		this.proSkill = proSkill;
		this.projectId = projectId;
	}



	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 21, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 21, 2022
	 * @param email
	 * @param passWord
	 */
	public User(String email, String passWord) {
		this.email = email;
		this.passWord = passWord;
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
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}



	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}



	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}



	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}



	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
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
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}



	/**
	 * @param expInYear the expInYear to set
	 */
	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}



	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}



	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}



	
}