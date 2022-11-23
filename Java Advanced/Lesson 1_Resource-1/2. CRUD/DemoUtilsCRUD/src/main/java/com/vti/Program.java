package com.vti;

import java.util.List;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

public class Program {
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

		System.out.println("\n\n***********GET DEPARTMENT BY NAME***********");

		Department departmentByName = repository.getDepartmentByName("Marketting");
		System.out.println(departmentByName);

		System.out.println("\n\n***********CREATE DEPARTMENT***********");

		Department departmentCreate = new Department();
		departmentCreate.setName("waiting");
		repository.createDepartment(departmentCreate);

		System.out.println("\n\n***********UPDATE DEPARTMENT 1***********");

		repository.updateDepartment((short) 3, "Security");

		System.out.println("\n\n***********UPDATE DEPARTMENT 2***********");

		Department departmentUpdate = new Department();
		departmentUpdate.setId((short) 2);
		departmentUpdate.setName("Security2");
		repository.updateDepartment(departmentUpdate);

		System.out.println("\n\n***********DELETE DEPARTMENTS***********");
		repository.deleteDepartment((short) 2);

		System.out.println("***********CHECK DEPARTMENT EXISTS BY ID***********");
		System.out.println(repository.isDepartmentExistsByID((short) 1));

		System.out.println("***********CHECK DEPARTMENT EXISTS BY NAME***********");
		System.out.println(repository.isDepartmentExistsByName("Security"));

	}
}
