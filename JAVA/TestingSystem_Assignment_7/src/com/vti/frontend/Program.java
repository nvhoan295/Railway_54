package com.vti.frontend;

import com.vti.entity.exercise1.MyMath;
import com.vti.entity.exercise1.PrimaryStudent;
import com.vti.entity.exercise1.SecondaryStudent;
import com.vti.entity.exercise1.Student;

public class Program {
	public static void main(String[] args) {

		Student st1 = new Student(1, "Nguyễn Văn A");
		Student st2 = new Student(2, "Nguyễn Văn B");
		Student st3 = new Student(3, "Nguyễn Văn C");

		Student[] students = { st1, st2, st3 };

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		Student.college = "Đại học công nghệ";
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("Quỹ lớp mỗi bạn đóng 100k");
		System.out.println("Tổng quỹ lớp: "+ (Student.moneyGroup += 300));
		System.out.println("st1 lấy 50k mua bim bim");
		System.out.println("Tổng quỹ còn: "+ (Student.moneyGroup -= 50));
		System.out.println("st2 lấy 20k mua bánh mì");
		System.out.println("Tổng quỹ còn: "+ (Student.moneyGroup -= 20));
		System.out.println("st3 lấy 150k mua đồ dùng học tập");
		System.out.println("Tổng quỹ còn: "+ (Student.moneyGroup -= 150));
		System.out.println("Mỗi bạn đóng thêm 50k");
		System.out.println("Tổng quỹ còn: "+ (Student.moneyGroup += 150));
		
		
		System.out.println(MyMath.min(3, 6));
		System.out.println(MyMath.max(3, 6));
		System.out.println(MyMath.sum(3, 6));
		
		System.out.println("Số sinh viên được tạo: "+ Student.count);
		// question5
		PrimaryStudent primaryStudent1 = new PrimaryStudent(1, "PA");
		PrimaryStudent primaryStudent2 = new PrimaryStudent(2, "PB");
		System.out.println("Số lượng PrimaryStudent: "+ PrimaryStudent.countPrimary);
		
		SecondaryStudent secondaryStudent1 = new SecondaryStudent(1, "SA");
		SecondaryStudent secondaryStudent2 = new SecondaryStudent(2, "SB");
		SecondaryStudent secondaryStudent3 = new SecondaryStudent(3, "SC");
		SecondaryStudent secondaryStudent4 = new SecondaryStudent(4, "SD");
		
		System.out.println("Số Lượng SecondaryStudent: "+ SecondaryStudent.countSecondary);
		
		System.out.println("Tổng Số sinh viên được tạo: "+ Student.count);
		
		
		
		
		
		
		
		
		
		
		
	}
}
