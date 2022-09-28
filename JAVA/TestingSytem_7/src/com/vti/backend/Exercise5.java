package com.vti.backend;

import com.vti.Utils.ScannerUtils;
import com.vti.entity.exercise5.Student;

import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.*;

public class Exercise5 {
	public void question1() throws Exception {
		// Xoá file nếu file đã tồn tại
		try {
			FileManager.deleteFile("StudentInformation.txt");
		} catch (Exception e1) {
			e1.getMessage();
		}
		// Tạo file.
		try {
			FileManager.createNewFile("StudentInformation.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Tạo 3 instance
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhập id: ");
			int id = ScannerUtils.inputInt();
			System.out.println("Nhập name: ");
			String name = ScannerUtils.inputString();
			students.add(new Student(id, name));

		}
		
		// Ghi file
		for (int i = 0; i < students.size(); i++) {
			// Ghi file
			IOManager.writeFile("StudentInformation.txt", "Student " + (i + 1) + "\n", true);
			IOManager.writeFile("StudentInformation.txt", "	ID: " + students.get(i).getId() + "\n", true);
			IOManager.writeFile("StudentInformation.txt", "	Họ và tên: " + students.get(i).getName() + "\n", true);
		}

		// Đọc File
		IOManager.readFile("StudentInformation.txt");
	}
}
