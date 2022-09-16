package com.vti.frontend.exercise1;

import com.vti.entity.exercise2.ques2.Student;

public class Progaram_2_2 {
	public static void main(String[] args) {
		Student student = new Student("Hoan", "Nam", 1990, "Hanoi", "sv1", 9, "hoangmail");
		student.showInfo();
		student.hocBong();
		student.inputInfo();
	}
}
