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
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
