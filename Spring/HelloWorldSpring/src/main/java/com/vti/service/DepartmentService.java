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
		return repository.findAll();
	}

	@Override
	public Department getDepartmentByID(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void createDepartment(Department department) {
		repository.save(department);
	}

	@Override
	public void updateDepartment(Department department) {
		repository.save(department);
	}

	@Override
	public void deleteDepartment(int id) {
		repository.deleteById(id);
	}

	@Override
	public boolean isDepartmentExistsByID(int id) {
		return repository.existsById(id);
	}

	
}
