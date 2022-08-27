package Assignment1;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
//		Question 1:
//			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập x: ");
		int x, y, z;
		x = sc.nextInt();
		System.out.println("Nhập y: ");
		y = sc.nextInt();
		System.out.println("Nhập z: ");
		z = sc.nextInt();
		
		System.out.println("Bạn vừa nhập: " + "x: " + x + " y: "+ y + " z: "+ z);
		
//		Question 2:
//			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		/*
		System.out.println("Nhập a: ");
		float a = sc.nextFloat();
		System.out.println("Bạn vừa nhập: "+ a);
		System.out.println("Nhập b:");
		float b = sc.nextFloat();
		System.out.println("Bạn vừa nhập: "+ b);
		*/
//		Question 3:
//			Viết lệnh cho phép người dùng nhập họ và tên
		/*
		System.out.println("Nhập họ tên: ");
		String hoTen = sc.nextLine();
		System.out.println("Bạn vừa nhập: "+ hoTen);
		*/
//		Question 4:
//		Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
	/*
		System.out.println("Nhập vào ngày sinh nhật: ");
		int day, month, year;
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		LocalDate birthday = LocalDate.of(year, month, day);
		System.out.println("Ngày sinh của bạn: " + birthday);
		*/
//		Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 và vào
//			chương trình sẽ chuyển thành Position.Dev, Position.Test,
//			Position.ScrumMaster, Position.PM
		
		
	}
}
