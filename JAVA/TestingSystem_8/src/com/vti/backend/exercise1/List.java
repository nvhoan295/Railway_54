package com.vti.backend.exercise1;

import java.util.ArrayList;

import com.vti.entity.exercise1Collection.Student;

public class List {
	private ArrayList<Student> students;

	public List() {
		students = new ArrayList<>();
		input();
	}

	public void input() {
		students.add(new Student("Hoan"));
		students.add(new Student("Thao"));
		students.add(new Student("Lisa"));
		students.add(new Student("Hoan"));
		students.add(new Student("Cuong"));
		students.add(new Student("Hoan"));
	}
	
	public void printStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
//	a) In ra tổng số phần tử của students
	public void getAmountOfStudent() {
		System.out.println(students.size());
	}
//	b) Lấy phần tử thứ 4 của students
	public void getIndex4ofStudent() {
		System.out.println(students.get(3));
	}
	
	
	
	
}
