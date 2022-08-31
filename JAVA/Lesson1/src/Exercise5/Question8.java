package Exercise5;

import java.util.Scanner;

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
		while (true) {
			System.out.println("Mời bạn nhập chức năng: chọn 1 hoặc 2: ");
			int x = sc.nextInt();
			if (x == 1) {
					System.out.println("Nhập 1 thì sẽ thực hiện tạo account");
					Question5.taoAcc();
					return;
			} if(x==2) {
					System.out.println("2 thì sẽ thực hiện chức năng tạo department");
					Question6.taoDepartment();
					return;
			} else {
				System.out.println("Nhập lai:");
			}
		}
	}
}
