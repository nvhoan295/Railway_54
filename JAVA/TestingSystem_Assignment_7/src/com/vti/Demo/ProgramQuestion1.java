package com.vti.Demo;

import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.FileManager;
import com.vti.Utils.IOManager;

public class ProgramQuestion1 {
	public static void main(String[] args) throws Exception {
		List<Student> students = new ArrayList<>();
		System.out.println("Nhập thông tin Student: ");
		for (int i = 0; i < 3; i++) {
			Student student = new Student();
			student.input();
			students.add(student);
		}

//		FileManager.createNewFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/StudentInformation.txt");

		IOManager.writeFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/StudentInformation.txt", "", false);
		for (int i = 0; i < students.size(); i++) {
			IOManager.writeFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/StudentInformation.txt", "Student " + (i + 1) + "\n", true);
			IOManager.writeFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/StudentInformation.txt",
					"	ID: " + students.get(i).getId() + "\n", true);
			IOManager.writeFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/StudentInformation.txt","	Họ và tên: " + students.get(i).getName() + "\n", true);
		}

		// Đoc File
		IOManager.readFile("/Users/nguyenhoan/Desktop/Railway_54/JAVA/TestingSystem_Assignment_7/src/com/vti/LogUtils/StudentInformation.txt");

	}
}
