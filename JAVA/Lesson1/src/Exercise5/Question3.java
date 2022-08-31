package Exercise5;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
//		Question 3:
//			Viết lệnh cho phép người dùng nhập họ và tên
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String tenString = scanner.nextLine();
		System.out.println(tenString);
	}
}
