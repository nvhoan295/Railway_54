package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
