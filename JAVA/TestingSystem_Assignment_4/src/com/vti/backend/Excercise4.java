package com.vti.backend;
import com.vti.entity.*;
public class Excercise4 {
	public static void question1() {
		Student student1 = new Student(1, "Hoàn", "Hà Nội");
		student1.plusScore(8.5);
		System.out.println(student1);
	}
	
	public static void question2() {
		Circle circle1 = new Circle(1.5, "Red");
		System.out.println("Thông tin: "+ circle1.toString());
		System.out.println("Diện tích hình tròn: "+ circle1.getArea());
		
		// Account2
		Account2 account2 = new Account2(1, "Thao", 15000);
		System.out.println("Thông tin: "+ account2);
		System.out.println("Số tiền sau khi được thêm 1000 là:  "+ account2.credit(1000));
		System.out.println("Số tiền Sau khi chi tiêu 3000 là:   "+ account2.debit(3000));
		// Date
		Date date1 = new Date(20, 3, 2020);
		System.out.println("Thông tin: "+ date1);
		System.out.println("Năm 2020 nhuận: "+ date1.isLeapYear());
	}
	
}
