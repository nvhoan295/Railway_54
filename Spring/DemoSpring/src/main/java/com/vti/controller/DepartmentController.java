package com.vti.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Department;
import com.vti.service.IDepartmentService;

@RestController
@RequestMapping(value = "api/v1/departments")
public class DepartmentController {
	@Autowired
	private IDepartmentService service;

	@GetMapping()
	public Page<Department> getAllDepartments(Pageable pageable) {
		return service.getAllDepartments(pageable);
	}

	@GetMapping(value = "/{id}")
	public Department getDepartmentById(@PathVariable(name = "id") int id) {
		return service.getDepartmentById(id);
	}

	@GetMapping(value = "/name/{name}")
	public Department getDepartmentByName(@PathVariable(name = "name") String name) {
		return service.getDepartmentByName(name);
	}

	@GetMapping(value = "/totalMember/{id}")
	public Department getDepartmentByTotalMember(@PathVariable(name = "id") int id) {
		return service.getDepartmentByTotalMember(id);
	}

	@GetMapping(value = "/src")
	public List<Department> getDepartmentByNameOrTotalMember(@RequestParam(name = "name") String name,
			@RequestParam(name = "totalMember") int totalMember) {
		return service.getDepartmentByNameOrTotalMember(name, totalMember);
	}

	@GetMapping(value = "/search")
	public List<Department> getDepartmentByIdOrName(int id, String name) {
		return service.getDepartmentByIdOrName(id, name);
	}
	
	@PostMapping()
	public Department createDepartment(@RequestBody Department department) {
		return service.createDepartment(department);
	}

	@PutMapping(value = "/{id}")
	public Department updateDepartment(@PathVariable(name = "id") int id, @RequestBody Department department) {
		boolean isExitDepartmentById = service.isExitsById(id);
		if (isExitDepartmentById) {
			return service.updateDepartment(department);
		} else {
			return null;
		}
	}

	@DeleteMapping(value = "/{id}")
	public void deleteByID(@PathVariable(name = "id") int id) {
		service.deleteDepartmentById(id);
	}

}
