package com.vti.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer>{
	Page<Department> findAll(Pageable pageable);
	Department findByName(String name);
	Department findByTotalMember(int id);
	List<Department> findByNameOrTotalMember(String name, int totalMember);
	List<Department> findByIdOrName(int id, String name);
}
