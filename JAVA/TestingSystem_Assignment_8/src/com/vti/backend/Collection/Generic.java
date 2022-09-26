package com.vti.backend.Collection;

import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import com.vti.entity.Exercise3.Employee;
import com.vti.entity.Exercise3.MyMap;
import com.vti.entity.Exercise3.Student;

public class Generic {
//	Question 1: T generic (class)
//	Tạo class student có property id, name (trong đó id của student có thể
//	là int, long, float)
//	a) Tạo đối tượng student có id là int
//	b) Tạo đối tượng student có id là float
//	c) Tạo đối tượng student có id là double
	public void question1() {
		Student<Integer> student = new Student<Integer>(1, "Hoàn");
		Student<Float> student2 = new Student<Float>(1f, "Thảo");
		Student<Double> student3 = new Student<Double>(1d, "Lisa");
	}

//	Question 2: T generic (method)
//	Tạo method để in ra thông tin nhập vào (parameter)
//	(parameter có thể là họ và tên, hoặc student, hoặc int)
//	Gợi ý: tạo method print(T a) và cài đặt system out (a) ra
//	Demo chương trình với print(student), print(4), print(4.0)
	public <T> void question2(T a) {
		System.out.println(a);
	}

//	Question 4: E generic
//	Tạo 1 array int, 1 array float, 1 array long, 1 array double
//	Tạo 1 method có parameter là array và in ra các số trong array đó

	public void question4() {
		Integer[] arr = { 1, 2, 3, 4 };
		Float[] arr2 = { 2f, 3f, 4f };
		Long[] arr3 = { 3l, 4l };

		printArray(arr);
		printArray(arr2);
		printArray(arr3);

	}

	private <T> void printArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
//	Question 5: E generic
//	Tạo 1 class Employee có property id, name, salaries với salaries là
//	lương các tháng của Employee đó và là 1 array có data type có thể là
//	int, long, float.
//	Viết method trong Employee để in ra thông tin của Employee bao gồm
//	id, name, salaris.
//	Viết method trong Employee để in ra thông tin tháng lương cuối cùng
//	của Employee
//	a) Hãy tạo chương trình demo với Employee có salaries là
//	datatype int
//	b) Hãy tạo chương trình demo với Employee có salaries là
//	datatype float
//	c) Hãy tạo chương trình demo với Employee có salaries là
//	datatype double

	public void question5() {
		Integer[] salariesEmp1 = { 100, 200, 300 };
		Employee<Integer> employee = new Employee<Integer>(1, "Hoan", salariesEmp1);

		Float[] salariesFloats = { 100f, 200f, 400f };
		Employee<Float> employee2 = new Employee<Float>(2, "Thao", salariesFloats);

		Double[] salariesDoubles = { 100d, 300d };
		Employee<Double> employee3 = new Employee<Double>(3, "lisa", salariesDoubles);

		System.out.println(employee.getSalaries1());
		System.out.println(employee2.getSalaries1());
		print(employee3);

	}

	public <T> void print(T a) {
		System.out.println(a);
	}

//	Question 6: K & V generic
//	Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
//	Tạo các method
//	a) GetValue()
//	b) getKey ()
//	Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên
//	và value là tên của sinh viên đó
	public void question6() {
		MyMap<Integer, String> student = new MyMap<Integer, String>(1, "Hoan");
		System.out.println(student.getValue());

	}
	
	

}
