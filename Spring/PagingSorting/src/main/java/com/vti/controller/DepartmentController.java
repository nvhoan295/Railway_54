package com.vti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Department;
import com.vti.form.DepartmentForm;
import com.vti.sevice.IDepartmentService;

@RestController
@RequestMapping(value = "api/v1/departments")
public class DepartmentController {

	@Autowired
	private IDepartmentService service;

	@GetMapping()
	public Page<Department> getAllDepartments(Pageable pageable) {
		return service.getAllDepartments(pageable);
	}

	@GetMapping(value = "/name/{name}")
	public Page<Department> getDepartmentByname(@PathVariable(name = "name") String name, Pageable pageable) {
		return service.getDepartmentByname(name, pageable);
	}

	@GetMapping(value = "/{id}")
	public Department getDepartmentById(@PathVariable(name = "id") int id) {
		return service.getDepartmentById(id);
	}

	@PostMapping()
	public void createDepartment(@RequestBody DepartmentForm form) {
		service.createDepartment(form.toEntity());
	}

	@PutMapping(value = "/{id}")
	public void updateDepartment(@PathVariable(name = "id") int id, @RequestBody DepartmentForm form) {
		Department department = form.toEntity();
		department.setId(id);
		service.updateDepartment(department);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteDepartment(@PathVariable(name = "id") int id) {
		service.deleteDepartment(id);
	}

}
