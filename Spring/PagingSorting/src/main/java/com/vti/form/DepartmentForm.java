package com.vti.form;

import com.vti.entity.Department;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentForm {
	private String name;

	public DepartmentForm() {
	}


	public Department toEntity() {
		return new Department(name);
	}

}
