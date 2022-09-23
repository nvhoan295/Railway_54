package com.vti.Demo;

import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.IOManager;
import com.vti.Utils.ScannerUtils;

public class PrgramQuestion2 {
	public static void main(String[] args) throws Exception {
		// Tạo file Exception.ser
//		FileManager.createNewFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/Exception.ser");
		
		List<Student> students = new ArrayList<>();
		System.out.println("Nhập số Sinh viên muốn thêm: ");
		int n = ScannerUtils.inputInt();
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			student.input();
			students.add(student);
		}
	
		
		
		IOManager.writeObject(students, "/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/Exception.ser");
		
		IOManager.readObject("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/Exception.ser");
		
		
		
		
	}
}
