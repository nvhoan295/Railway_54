package init;

import java.util.Scanner;

public class Exercise4 {
	static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		String s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		s1 = scanner.nextLine();
		String[] words = s1.split(" ");
		scanner.close();
		System.out.println("Số lượng từ trong chuỗi: " + words.length);

	}

	public static void question2() {
//		Question 2:
//			Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		System.out.println("Nhập chuỗi s1: ");
		String s1 = scanner.nextLine();
		System.out.println("Nhập chuỗi s2: ");
		String s2 = scanner.nextLine();
		System.out.println("Nối 2 chuỗi");
		System.out.println(s1 + " " + s2);
		scanner.close();

	}

	public static void question3() {
//		Question 3:
//			Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//			viết hoa chữ cái đầu thì viết hoa lên
		System.out.println("Nhập tên: ");
		String ten = scanner.nextLine();
		String firstCharacter = ten.substring(0, 1).toUpperCase();
		String leftCharacter = ten.substring(1);
		ten = firstCharacter + leftCharacter;
		System.out.println(ten);
		scanner.close();

	}

	public static void question4() {
//		Question 4:
//			Viết chương trình để người dùng nhập vào tên và in từng ký tự trong tên
//			của người dùng ra
//			VD:
//			Người dùng nhập vào "Nam", hệ thống sẽ in ra
//			"Ký tự thứ 1 là: N"
//			"Ký tự thứ 1 là: A"
//			"Ký tự thứ 1 là: M"
		System.out.println("Nhập tên: ");
		String name = scanner.next();
		String[] kyTu = name.split("");
		for (int i = 0; i < kyTu.length; i++) {
			System.out.println("Ký tự thứ "+ (i+1)+ " là: " + kyTu[i].toUpperCase());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		question4();

	}
}
