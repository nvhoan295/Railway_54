package Exercise5;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
//		Question 7:
//			Nhập số chẵn từ console

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập vào số chẵn: ");
			int x = sc.nextInt();
			if (x % 2 == 0) {
				System.out.println("Bạn vừa nhập: " + x);
				return;
			} else {
				System.out.println("Nhập sai rồi, Nhập lại");
			}

		}

	}
}
