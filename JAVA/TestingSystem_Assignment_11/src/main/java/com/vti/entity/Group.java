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
public class Group {
	private int id;
	private String name;

	/**
	 * Constructor for class Group.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 13, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 13, 2022
	 * @param id
	 * @param name
	 */
	public Group(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Group() {
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	/* 
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + "]";
	}
	

}
