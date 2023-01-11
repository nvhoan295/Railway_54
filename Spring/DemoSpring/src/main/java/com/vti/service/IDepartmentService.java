package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.entity.Department;

public interface IDepartmentService {
	Page<Department> getAllDepartments(Pageable pageable);
	Department getDepartmentById(int id);
	Department getDepartmentByName(String name);
	Department getDepartmentByTotalMember(int id);
	
	List<Department> getDepartmentByNameOrTotalMember(String name, int totalMember);
	
	List<Department> getDepartmentByIdOrName(int id, String name);
	Department createDepartment(Department department);
	Department updateDepartment(Department department);
	
	
	boolean isExitsById(int id);
	void deleteDepartmentById(int id);
	
	
}
