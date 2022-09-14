package com.vti.backend;


import com.vti.entity.exercise4Encapsulation.Student;
import com.vti.entity.exercise4Encapsulation.q2.Account;
import com.vti.entity.exercise4Encapsulation.q2.Circle;
import com.vti.entity.exercise4Encapsulation.q2.Date;

public class Exercise4Encapsulation {
	public static void question1() {
		Student student1 = new Student("Hoàn", "Hà Nội");
		Student	student2 = new Student("Thảo", "Hà Tây");
		
		student1.setScore(3);
		
		student1.plussScore(6);
		System.out.println(student1);
	}
	public static void question2() {
		Circle circle1 = new Circle(2.3);
		System.out.println(circle1);
		System.out.println("Diện tích hình tròn: "+circle1.getArea());
		
		Account account1 = new Account("a123", "Hoan", 1000);
		Account account2 = new Account("T1", "Thảo", 3000);
		System.out.println(account1);
		System.out.println("Thu nhập thêm: "+account1.credit(200));
		System.out.println("Sau khi chi tiêu: "+ account1.debit(300));
		
		account1.tranferTo(account2, 400);
		System.out.println("Tài khoản Acc1: "+account1.getBalance());
		System.out.println("Tài khoản Acc2: "+ account2.getBalance());
		
		Date date1 = new Date(12, 3, 2000);
		System.out.println(date1);
		System.out.println(date1.isLeapYear());
	}
	
}
