package com.vti.form;

import com.vti.entity.Department;

public class DepartmentForm {

	private String name;

	public DepartmentForm() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Department toEntity() {
		return new Department(name);
	}
	
	
}
