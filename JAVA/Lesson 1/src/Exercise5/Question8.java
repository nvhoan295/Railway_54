package Exercise5;

import java.util.Scanner;
import Assignment1.*;
import Exercise5.Question5;
import Exercise5.Question6;

public class Question8 {
	public static void main(String[] args) {
//		Question 8:
//			Viết chương trình thực hiện theo flow sau:
//			Bước 1:
//			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//			dụng"
//			Bước 2:
//			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//			department
//			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//			lại" và quay trở lại bước 1

		Scanner sc = new Scanner(System.in);
		int a;
		while (true) {
			System.out.println("Nhập chức năng: 1. Tạo Account, 2. Tạo Department");
			a = sc.nextInt();
			if (a == 1 || a == 2) {
				switch (a) {
				case 1:
					Question5();
					break;
				case 2:
					Question6();
					break;
				default:
					break;
				}
				return;
			} else {
				System.out.println("Nhập lại: ");
			}

		}

	}
}
