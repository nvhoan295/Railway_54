package com.vti.backend.exercise3;

import org.w3c.dom.ls.LSOutput;

import com.vti.entity.Exercise3.Employee;
import com.vti.entity.Exercise3.MyMap;
import com.vti.entity.Exercise3.Phone;
import com.vti.entity.Exercise3.Staff;
import com.vti.entity.Exercise3.Student;

public class Generic {
//	Question 1: T generic (class)
//	Tạo class student có property id, name (trong đó id của student có thể
//	là int, long, float)
//	a) Tạo đối tượng student có id là int
//	b) Tạo đối tượng student có id là float
//	c) Tạo đối tượng student có id là double

	public void question1() {
		Student<Integer> st1 = new Student<Integer>(1, "Hoan");
		Student<Float> st2 = new Student<Float>(2f, "Thảo");
		Student<Double> st3 = new Student<Double>(2d, "Lisa");

//	Question 2: T generic (method)
//	Tạo method để in ra thông tin nhập vào (parameter)
//	(parameter có thể là họ và tên, hoặc student, hoặc int)
//	Gợi ý: tạo method print(T a) và cài đặt system out (a) ra
//	Demo chương trình với print(student), print(4), print(4.0)
		print(st1);
		print(4);
		print(4.0);

	}

	public <T> void print(T a) {
		System.out.println(a);
	}

//	Question 4: E generic
//	Tạo 1 array int, 1 array float, 1 array long, 1 array double
//	Tạo 1 method có parameter là array và in ra các số trong array đó
	public void question4() {
		Integer[] arr = { 1, 2, 3, 4 };
		Float[] arr2 = { 1f, 2f, 3f };
		Long[] arr3 = { 1l, 3l, 5l };
		Double[] arr4 = { 3d, 4d, 8d };

		printArray(arr);
		printArray(arr2);
		printArray(arr3);
		printArray(arr4);

	}

	public <T> void printArray(T[] arr) {
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
		Integer[] salariesIntegers = { 100, 200, 300 };
		Employee<Integer> employee1 = new Employee<>(1, "Hoàn", salariesIntegers);
		print(employee1);
		System.out.println("Tháng lương cuối cùng: " + salariesIntegers[salariesIntegers.length - 1]);

		Float[] salariesFloat = { 200f, 300f, 400f };

		Employee<Float> employee2 = new Employee<>(2, "Thảo", salariesFloat);

		System.out.println(employee2);
		System.out.println("Tháng lương cuối cùng: " + salariesFloat[salariesFloat.length - 1]);

		Double[] salariesDoubles = { 300d, 400d, 500d };

		Employee<Double> employee3 = new Employee<>(3, "Lisa", salariesDoubles);
		System.out.println(employee3);
		System.out.println("Tháng lương cuối cùng: " + salariesDoubles[salariesDoubles.length - 1]);

	}

//	Question 6: K & V generic
//	Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
//	Tạo các method
//	a) GetValue()
//	b) getKey ()
//	Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên
//	và value là tên của sinh viên đó
	public void question6() {
		MyMap<Integer, String> student = new MyMap<Integer, String>(1, "Nguyễn Văn Hoàn");

		System.out.println(student.getValue());
		System.out.println(student.getKey());

	}

//	Question 7: K & V generic
//	Tạo 1 class có tên là Phone, lưu dữ liệu theo dạng key, value (extends
//	MyMap)
//	Với key là email hoặc là số thứ tự hoặc là tên người sử dụng
//	Với value là số điện thoại
//	Tạo các method
//	a) GetPhoneNumber()
//	b) getKey ()
//	Viết chương trình demo với
//	a) key là email
//	b) key là số thứ tự
//	c) key là tên của người sử dụng

	public void question7() {
//	Với key là email, Value là số điện thoại
		Phone<String, String> email = new Phone<String, String>("nvhoan295@gmail.com", "0982708939");
		System.out.println("Email: " + email.getKey() + " Phone: " + email.getValue());

// Key là ID, Value là số điện thoại
		Phone<Integer, String> id = new Phone<Integer, String>(1, "0799244668");
		System.out.println("ID: " + id.getKey() + " Phone: " + id.getValue());

// Name, Phone
		Phone<String, String> name = new Phone<String, String>("Hoan", "0988668668");
		System.out.println("Name: " + name.getKey() + " Phone: " + name.getValue());

	}

//	Question 8: K & V generic
//	Tạo 1 class có tên là Staff, lưu dữ liệu theo dạng key, value (extends
//	MyMap)
//	Với key là id của Staff (ID có thể là int, long)
//	Với value là tên của Staff
//	Tạo các method
//	a) GetId ()
//	b) getName ()
//	Viết chương trình demo
	public void question8() {
		// Integer
		Staff<Integer> staff1 = new Staff<Integer>(1, "Nguyễn Văn Hoàn");
		System.out.println("ID: " + staff1.getKey() + " Name: " + staff1.getValue());

		// Float
		Staff<Float> staff2 = new Staff<Float>(2f, "Phương Thảo");
		System.out.println("ID: " + staff2.getKey() + " Name: " + staff2.getValue());

	}

}
