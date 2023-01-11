package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Department;
import com.vti.repository.IDepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {
	
	@Autowired
	private IDepartmentRepository repository;

	@Override
	public List<Department> getAllDepartments() {
		return repository.getAllDepartments();
	}

	@Override
	public Department getDepartmentByID(int id) {
		return repository.getDepartmentByID(id);
	}

	@Override
	public Department getDepartmentByName(String name) {
		return repository.getDepartmentByName(name);
	}

	@Override
	public void createDepartment(Department department) {
		repository.createDepartment(department);
	}

	@Override
	public void updateDepartment(int id, String newName) {
		repository.updateDepartment(id, newName);
	}

	@Override
	public void updateDepartment(Department department) {
		repository.updateDepartment(department);
	}

	@Override
	public void deleteDepartment(int id) {
		repository.deleteDepartment(id);
	}

	@Override
	public boolean isDepartmentExistsByID(int id) {
		return repository.isDepartmentExistsByID(id);
	}

	@Override
	public boolean isDepartmentExistsByName(String name) {
		return repository.isDepartmentExistsByName(name);
	}

	
}
