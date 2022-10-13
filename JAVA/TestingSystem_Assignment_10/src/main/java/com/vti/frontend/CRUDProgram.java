package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.DepartmentDao;
import com.vti.entity.Department;

public class CRUDProgram {
	public static void main(String[] args) throws Exception {
//		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
		question7();
	}

	public static void question1() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		List<Department> departments = new ArrayList<Department>();
		departments = new DepartmentDao().getDepartments();
		for (Department department : departments) {
			System.out.println(department);
		}
	}

	public static void question2()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		Department department = new DepartmentDao().getDepartmentById(5);
		System.out.println(department);
	}

	public static void question3()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		Department department = new DepartmentDao().question3();
		System.out.println(department);
	}

	public static void question4() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		System.out.println("Nhập DepartmentName: ");
		String name = ScannerUtils.inputName();
		boolean result = new DepartmentDao().checkDepartmentNameExists(name);
		System.out.println("Result: " + result);

	}

	public static void question5()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		System.out.println("Nhập Deparment Name: ");
		String name = ScannerUtils.inputName();
		new DepartmentDao().createDepartment(name);
		System.out.println("Create Success");

	}
	
	public static void question6() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException, Exception {
		System.out.println("Nhập Department Id: ");
		int id = ScannerUtils.inputInt();
		System.out.println("Nhập Deparment Name: ");
		String newName = ScannerUtils.inputName();
		new DepartmentDao().updateDepartmentName(id, newName);
		System.out.println("Update Success");
	}
	public static void question7() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException, Exception {
		System.out.println("Nhập Department ID: ");
		int id = ScannerUtils.inputInt();
		new DepartmentDao().deleteDepartmentByID(id);
		System.out.println("Delete Success");
	}
	
}
