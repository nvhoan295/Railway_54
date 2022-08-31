package Exercise5;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
//		Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập ngày: ");
		int day = scanner.nextInt();
		System.out.println("Nhập tháng: ");
		int month = scanner.nextInt();
		System.out.println("Nhập năm: ");
		int year = scanner.nextInt();
		System.out.println("Ngày sinh nhật của bạn: "+ day+ "-"+month+ "-"+year);
		
		
		
		
	}
}
