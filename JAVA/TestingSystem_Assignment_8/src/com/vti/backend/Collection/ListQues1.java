package com.vti.backend.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vti.entity.Exercise1.*;

public class ListQues1 {
	private List<Student> students;

	public ListQues1() {
		this.students = new ArrayList<>();
		inputStudent();
	}

	private void inputStudent() {
		students.add(new Student("Hoan"));
		students.add(new Student("Thao"));
		students.add(new Student("Lisa"));
		students.add(new Student("Tam"));
		students.add(new Student("Cuong"));
		students.add(new Student("Diep"));
		students.add(new Student("Thang"));
		students.add(new Student("Hoan"));
	}

	public void printStudent() {
		System.out.println("Danh sách Sinh Viên: ");
		for (Student student : students) {
			System.out.println(student);
		}
	}

//	a) In ra tổng số phần tử của students
	public void getAmountOfStudents() {
		System.out.println("Tổng số phần tử trong studens: " + students.size());
	}

//	b) Lấy phần tử thứ 4 của students
	public void getIndex4ofStudens() {
		System.out.println("Phần tử thứ 4: " + students.get(3));
	}

//	c) In ra phần tử đầu và phần tử cuối của students
	public void printFirstAndLastStudents() {
		System.out.println("Phần tử đầu: " + students.get(0));
		System.out.println("Phần tử cuối: " + students.get(students.size() - 1));
	}

//	d) Thêm 1 phần tử vào vị trí đầu của students

	public void addStudentIntoFirtStudents() {
		students.add(0, new Student("Đầu"));
		printStudent();
	}

//	e) Thêm 1 phần tử vào vị trí cuối của students
	public void addStudentIntoLastStudents() {
		students.add(students.size(), new Student("Cuoi"));
		printStudent();
	}

//	f) Đảo ngược vị trí của students
	public void reverseStudens() {
		Collections.reverse(students);
		printStudent();
	}

//	g) Tạo 1 method tìm kiếm student theo id
	public void findStudentById(int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				System.out.println(student);
			}
		}
	}

//	h) Tạo 1 method tìm kiếm student theo name
	public void findStudentByName(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				System.out.println(students.get(i));
			}
		}
	}

//	i) Tạo 1 method để in ra các student có trùng tên

	public void findDuplicateStudents() {
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println("Các student trùng tên: ");
					System.out.println(students.get(i));
					System.out.println(students.get(j));
				}
			}
		}
	}

//	j) Xóa name của student có id = 2;
	public void deleteNameOfStudentID2() {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == 2) {
				students.get(i).setName(null);
				System.out.println(students.get(i));
			}
		}
	}

//	k) Delete student có id = 5;
	public void deleteStudentById5() {
		students.removeIf(s -> s.getId() == 5);
		printStudent();
	}

//	l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies
	public void addAllStudentsToStudentCopies() {
		List<Student> studentCopies = new ArrayList<>();
		studentCopies.addAll(students);
		System.out.println("Danh sách studentCopies: ");
		for (Student copy : studentCopies) {
			System.out.println(copy);
		}

	}

}
