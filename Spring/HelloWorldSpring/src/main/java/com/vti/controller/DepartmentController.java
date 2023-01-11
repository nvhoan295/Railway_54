package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.vti.service.IDepartmentService;

@RestController
@RequestMapping(value = "api/v1/departments")
public class DepartmentController {

	@Autowired
	private IDepartmentService service;

	@GetMapping()
	public List<Department> getAllDepartments() {
		return service.getAllDepartments();
	}

	@GetMapping(value = "/{id}")
	public Department getDepartmentByID(@PathVariable(name = "id") int id) {
		return service.getDepartmentByID(id);
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
