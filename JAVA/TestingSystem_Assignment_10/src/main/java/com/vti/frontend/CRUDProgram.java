package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.DepartmentDao;
import com.vti.entity.Department;

public class CRUDProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		question1();
		
	}
	
	
	public static void question1() throws ClassNotFoundException, SQLException {
		List<Department> departments = new DepartmentDao().getDepartments();
		for (Department department : departments) {
			System.out.println(department);
		}
	}
}
