package com.vti.backend;

import com.vti.entity.exercise2.*;

public class StudentBackend {
	static Student[] students = new Student[10];

	public static void Test() {

		students[0] = new Student(1, "Nguyễn Văn A", 1);
		students[1] = new Student(2, "Nguyễn Văn B", 1);
		students[2] = new Student(3, "Nguyễn Văn C", 1);
		students[3] = new Student(4, "Nguyễn Văn D", 3);
		students[4] = new Student(5, "Nguyễn Văn E", 3);
		students[5] = new Student(6, "Nguyễn Văn F", 2);
		students[6] = new Student(7, "Nguyễn Văn G", 2);
		students[7] = new Student(8, "Nguyễn Văn H", 3);
		students[8] = new Student(9, "Nguyễn Văn K", 2);
		students[9] = new Student(10, "Nguyễn Văn S", 2);
		
		
		
		
		
		
		

	}

	public static void diemDanh() {
		System.out.println("------- Điểm Danh ----------");
		for (Student student : students) {
			student.diemDanh();
		}
	}

	public static void hocBai() {
		System.out.println("------ Học Bài -----------");
		for (Student student : students) {
			if (student.getGroup() == 1) {
				student.hocBai();
				;
			}
		}
	}

	public static void donVeSinh() {
		System.out.println("------ Dọn Vệ Sinh -----------");
		for (Student student : students) {
			if (student.getGroup() == 2) {
				student.donVeSinh();
				;
			}
		}
	}

}
