package com.vti.backend.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.vti.entity.Exercise1.*;

public class SetQues3 {

	Set<Student> students;

	public SetQues3() {
		this.students = new HashSet<>();
		inputStudent();

	}

	public void inputStudent() {
		students.add(new Student("Hoan"));
		students.add(new Student("Thao"));
		students.add(new Student("Lisa"));
		students.add(new Student("Tam"));
		students.add(new Student("Cuong"));
		students.add(new Student("Diep"));
		students.add(new Student("Thang"));
		students.add(new Student("Hoan"));
	}

	public void printStudens() {
		Iterator<Student> studentIterator = students.iterator();
		while (studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}

	}

//	a) In ra tổng số phần tử của students
	public void getAmountOfStudents() {
		System.out.println("Tổng số phần tử trong studens: " + students.size());
	}

//	b) Lấy phần tử thứ 4 của students
	public void getIndex4ofStudens() {
		Iterator<Student> studentIterator = students.iterator();
		for (int i = 0; i < 2; i++) {
			studentIterator.next();
		}
		System.out.println("Student thứ 4: ");
		System.out.println(studentIterator.next());
	}

	// c) In ra phần tử đầu và phần tử cuối của students
	public void printFisrtAndLastStudent() {
		Iterator<Student> studentIterator = students.iterator();
		System.out.println("Student đầu tiên: ");
		System.out.println(studentIterator.next());

		for (int i = 0; i < students.size() - 2; i++) {
			studentIterator.next();
		}
		System.out.println("Student Cuối cùng: ");
		System.out.println(studentIterator.next());

	}

}
