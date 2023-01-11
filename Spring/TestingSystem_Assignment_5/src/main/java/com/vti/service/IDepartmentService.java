package com.vti.service;

import java.util.List;

import com.vti.entity.Department;

public interface IDepartmentService {
	public List<Department> getAllDepartments();

	public Department getDepartmentByID(int id);

	public Department getDepartmentByName(String name);

	public void createDepartment(Department department);

	public void updateDepartment(int id, String newName);

	public void updateDepartment(Department department);

	public void deleteDepartment(int id);

	public boolean isDepartmentExistsByID(int id);

	public boolean isDepartmentExistsByName(String name);
}
