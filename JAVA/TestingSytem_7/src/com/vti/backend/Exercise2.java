package com.vti.backend;

import com.vti.entity.exercise2.MyMath;
import com.vti.entity.exercise2.PrimaryStudent;
import com.vti.entity.exercise2.SecondaryStudent;
import com.vti.entity.exercise2.Student;

public class Exercise2 {
	public void question1() {
		MyMath math = new MyMath();
		math.sum(3);
	}

	public void question2() {
		Student student = new Student(1, "Hoàn");
		System.out.println(student);

	}

	public void question3() {
		PrimaryStudent primaryStudent = new PrimaryStudent(1, "Nguyễn Văn A");
		primaryStudent.study();
		SecondaryStudent secondaryStudent = new SecondaryStudent(2, "Nguyễn Văn B");
		secondaryStudent.study();

	}
}
