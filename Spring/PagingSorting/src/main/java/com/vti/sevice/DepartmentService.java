package com.vti.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vti.entity.Department;
import com.vti.repository.IDepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {
	@Autowired
	private IDepartmentRepository repository;

	@Override
	public Page<Department> getAllDepartments(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Page<Department> getDepartmentByname(String name, Pageable pageable) {
		return repository.findByName(name, pageable);
	}

	@Override
	public Department getDepartmentById(int id) {
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
	public boolean isDepartmentExistsById(int id) {
		return repository.existsById(id);
	}

}
