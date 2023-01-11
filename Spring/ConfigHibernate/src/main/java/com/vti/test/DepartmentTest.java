package com.vti.test;

import java.util.List;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

public class DepartmentTest {
	public static void main(String[] args) {
		DepartmentRepository repository = new DepartmentRepository();
		System.out.println("***********GET ALL DEPARTMENTS***********");

		List<Department> departments = repository.getAllDepartments();

		for (Department department : departments) {
			System.out.println(department);
		}

		System.out.println("\n\n***********GET DEPARTMENT BY ID***********");

		Department departmentById = repository.getDepartmentByID((short) 2);
		System.out.println(departmentById);
	}
}
