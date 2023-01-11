package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vti.entity.enumerate.SalaryName;
import com.vti.entity.enumerate.SalaryNameConvert;

@Entity
@Table(name = "Salary")
public class Salary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "SalaryID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "SalaryName", nullable = false, unique = true)
	@Convert(converter = SalaryNameConvert.class)
	private SalaryName name;

	public Salary() {
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public SalaryName getName() {
		return name;
	}

	public void setName(SalaryName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", name=" + name + "]";
	}

}
