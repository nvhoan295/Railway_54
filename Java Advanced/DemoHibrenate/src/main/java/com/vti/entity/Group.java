//
package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Nov 24, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Nov 24, 2022
 */
@Entity
@Table(name = "`Group`")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "name", length = 50, nullable = false, unique = true)
	private String name;

	/**
	 * Constructor for class Group.
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Nov 24, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Nov 24, 2022
	 */
	public Group() {
	}

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(short id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + "]";
	}

}
