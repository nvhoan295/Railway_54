package com.vti.sevice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.entity.Department;

public interface IDepartmentService {
	public Page<Department> getAllDepartments(Pageable pageable);

	public Page<Department> getDepartmentByname(String name, Pageable pageable);

	public Department getDepartmentById(int id);

	public void createDepartment(Department department);

	public void updateDepartment(Department department);

	public void deleteDepartment(int id);

	public boolean isDepartmentExistsById(int id);

}
