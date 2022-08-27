package Exercise5;
import java.util.Scanner;

import Assignment1.*;
public class Question6 {
	public static void main(String[] args) {
//		Question 6:
//			Viết lệnh cho phép người dùng tạo department (viết thành method)
		Scanner sc = new Scanner(System.in);
		Department dep1 = new Department();
		System.out.println("Nhập ID: ");
		dep1.id = sc.nextInt();
		System.out.println("Nhập tên phòng ban: ");
		dep1.name = sc.next();
		System.out.println("Thông tin phòng ban");
		System.out.println("ID: "+ dep1.id);
		System.out.println("Tên phòng: " + dep1.name);
	}
}
