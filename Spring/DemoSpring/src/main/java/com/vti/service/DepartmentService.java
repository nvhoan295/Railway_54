package com.vti.service;

import java.util.List;
import java.util.Optional;

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
	public Department getDepartmentById(int id) {
		Optional<Department> departmentOptional = repository.findById(id);

		if (departmentOptional.isPresent()) {
			return departmentOptional.get();
		}
		return null;

	}

	@Override
	public Department createDepartment(Department department) {
		return repository.save(department);
	}

	@Override
	public void deleteDepartmentById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	public Department updateDepartment(Department department) {

		return repository.save(department);

	}

	@Override
	public boolean isExitsById(int id) {
		return repository.existsById(id);
	}

	@Override
	public Department getDepartmentByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public Department getDepartmentByTotalMember(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getDepartmentByNameOrTotalMember(String name, int totalMember) {
		// TODO Auto-generated method stub
		return repository.findByNameOrTotalMember(name, totalMember);
	}

	@Override
	public List<Department> getDepartmentByIdOrName(int id, String name) {
		return repository.findByIdOrName(id, name);
	}



	

	

}
