package Exercise5;

import java.util.Scanner;

import exercise.Department;

public class Question6 {
	public static void taoDepartment() {
		
		Department dep = new Department(0, null);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ID: ");
		dep.id = sc.nextInt();
		System.out.println("Nhập tên phòng: ");
		dep.name = sc.next();
		
		System.out.println("Thông tin phòng ban vừa nhập");
		System.out.println("ID: " + dep.id);
		System.out.println("Tên: "+ dep.name);
		
	}
	public static void main(String[] args) {
		taoDepartment();
	}
}
