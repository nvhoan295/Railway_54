package com.vti.backend.Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.vti.entity.Exercise1.Student;

public class StackQueueQues2 {
//	Question 2 (Optional): Stack & Queue
//	Khai báo 1 danh sách lưu các tên học sinh tới tham dự phỏng vấn, thứ
//	tự tới của các học sinh như sau:
//	Nguyễn Văn Nam, Nguyễn Văn Huyên, Trần Văn Nam,
//	Nguyễn Văn A
//	a) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
//	muộn nhất tới sớm nhất (gợi ý dùng Stack)
//	b) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự
//	sớm nhất tới muộn nhất (gợi ý dùng Queue)

//	a) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
//	muộn nhất tới sớm nhất (gợi ý dùng Stack)
	public void question2() {
		System.out.println("Stack Vào trước ra sau");
		useStack();
		System.out.println("Queue Vao trước ra trước");
		useQueue();
	}

	public void useStack() {
		Stack<Student> students = new Stack<>();
		students.add(new Student("Nguyễn Văn Nam"));
		students.add(new Student("Nguyễn Văn Huyên"));
		students.add(new Student("Trần Văn Nam"));
		students.add(new Student("Nguyễn Văn A"));

		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());

	}

	public void useQueue() {
		Queue<Student> students = new LinkedList<>();
		students.add(new Student("Nguyễn Văn Nam"));
		students.add(new Student("Nguyễn Văn Huyên"));
		students.add(new Student("Trần Văn Nam"));
		students.add(new Student("Nguyễn Văn A"));

		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());

	}

}
