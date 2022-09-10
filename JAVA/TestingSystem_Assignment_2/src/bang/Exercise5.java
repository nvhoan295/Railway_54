package bang;

import java.util.Scanner;

public class Exercise5 {
	static Scanner scanner = new Scanner(System.in);
	public static void question1() {
//		Question 1:
//			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		System.out.println("----- Question 1 --------");
		System.out.println("Nhập x: ");
		int x = scanner.nextInt();
		System.out.println("Nhập y: ");
		int y = scanner.nextInt();
		System.out.println("Nhập z: ");
		int z = scanner.nextInt();
		System.out.println("Bạn vừa nhập: "+ "x: "+ x+ ", y: "+ y + ", z: " + z);
	}
	public static void question2() {
//		Question 2:
//			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		System.out.println("---- Question 2 ---------");
		System.out.println("Nhập số thực f: ");
		float f = scanner.nextFloat();
		System.out.println("Nhập số thưc g: ");
		float g = scanner.nextFloat();
		System.out.println("Bạn vừa nhập: "+ "f: "+ f+ ", g: "+ g);
	}
	public static void question3() {
		System.out.println("------ Question 3 --------");
		System.out.println("Nhập họ và tên:");
		String hoVaTen = scanner.nextLine();
		System.out.println("Họ tên bạn nhập: "+ hoVaTen);
	}
	public static void question4() {
//		Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("------ Question 4 --------");
		System.out.println("Nhập ngày: ");
		int ngaySinh = scanner.nextInt();
		System.out.println("Nhập tháng: ");
		int thangSinh = scanner.nextInt();
		System.out.println("Nhập năm: ");
		int nam = scanner.nextInt();
		System.out.println("Ngày sinh nhật: ");
		System.out.println(ngaySinh + " - " + thangSinh + " - " + nam);
	}
	public static void question5() {
//		Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//			chương trình sẽ chuyển thành Position.Dev, Position.Test,
//			Position.ScrumMaster, Position.PM
		System.out.println("----- Question 5 -------");
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.setId(scanner.nextInt());
		System.out.println("Nhập email: ");
		acc.setEmail(scanner.next());
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		question5();
	}
	
}
