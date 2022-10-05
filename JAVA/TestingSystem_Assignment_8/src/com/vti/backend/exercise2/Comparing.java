package com.vti.backend.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vti.entity.Exercise2.Student;

public class Comparing {
	private List<Student> students;

	public Comparing() {
		students = new ArrayList<>();
		inputStudent();
	}

	public void inputStudent() {
		students.add(new Student("Hoan", LocalDate.of(2010, 3, 25), 8));
		students.add(new Student("Thao", LocalDate.of(2011, 9, 15), 7));
		students.add(new Student("Diep", LocalDate.of(2012, 8, 5), 6));
		students.add(new Student("Cuong", LocalDate.of(2010, 7, 12), 9));
		students.add(new Student("Hoan", LocalDate.of(2010, 6, 21), 7));

	}

	public void printStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

//	Question 1: Comparable
//	In ra học sinh sắp xếp theo name
	public void question1() {
		Collections.sort(students);

		printStudent();

	}

}
