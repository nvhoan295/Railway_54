//
package com.vti.entity;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 19, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 19, 2022
 */
public class User {
	private int id;
	private String fullName;
	private String email;
	private String password;
	private String position;
	private String proSkill;
	private int expInYear;

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 19, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 19, 2022
	 * @param id
	 * @param fullName
	 * @param email
	 * @param password
	 * @param position
	 * @param proSkill
	 * @param expInYear
	 */
	public User(int id, String fullName, String email, String password, String position, String proSkill,
			int expInYear) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.position = position;
		this.proSkill = proSkill;
		this.expInYear = expInYear;
	}

	
	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 19, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 19, 2022
	 * @param email
	 * @param password
	 * @param position
	 */
	public User(String email, String password, String position) {
		this.email = email;
		this.password = password;
		this.position = position;
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
	 * @return the position
	 */
	public String getPosition() {
		return position;
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
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
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
	
	

}
