package com.vti.backend.exercise4;

import com.vti.entity.exercise4.MyNumber;
import com.vti.entity.exercise4.Salary;

public class Wildcard {
//	Question 1:
//		Tạo 1 class Salary để đại diện cho datatype là các số
//		a) Hãy config class Salary như sau: Salary <N> với N phải được
//		extends từ Number.class
//		b) Tạo method để print ra salary hiện tại
	public void question1() {
		Salary<Integer> salary = new Salary<Integer>(7000000);
		System.out.println(salary);

	}
	
//	Question 2:
//		Tạo 1 class MyNumber để đại diện cho datatype là các số
//		Hãy config class MyNumber như sau: MyNumber<N> với N phải
//		được extends từ Number.class
	public void question2() {
		MyNumber<Double> number = new MyNumber<Double>(1999d);
		System.out.println(number);
	}
	
//		Question 3: T generic (method)
//		Tạo method tính max của 2 số (số nhập vào có thể là float, double, int,
//		long).
//		Demo chương trình
		
		
		
		
		
		
		
		
		
	

}
