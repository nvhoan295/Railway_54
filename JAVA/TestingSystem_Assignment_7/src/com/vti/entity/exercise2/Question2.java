package com.vti.entity.exercise2;

import com.vti.Utils.ScannerUtils;

public class Question2 {
	public static void main(String[] args) {
		System.out.println("Nhập ID: ");
		int id = ScannerUtils.inputInt("Nhập int");
		System.out.println("Nhập name: ");
		String name = ScannerUtils.inputString("Nhập kiểu string");
		Student student = new Student(id, name);
		System.out.println(student);
		
		
		PrimaryStudent primaryStudent = new PrimaryStudent(id, name);
		primaryStudent.study();
	}
}
