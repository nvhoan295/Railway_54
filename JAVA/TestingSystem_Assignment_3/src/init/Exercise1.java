package init;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static void question1() {
//		Question 1:
//			Khai báo 2 số lương có kiểu dữ liệu là float.
//			Khởi tạo Lương của Account 1 là 5240.5 $
//			Khởi tạo Lương của Account 2 là 10970.055$
//			Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//			Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra

		float f1 = 4.5f;
		float f2 = 6.7f;
		float salaryAcc1 = 5240.5f;
		float salaryAcc2 = 10970.055f;

		int intAcc1, intAcc2;
		intAcc1 = (int) salaryAcc1;
		System.out.println("Lương Acc1 làm tròn: " + intAcc1);
		intAcc2 = (int) salaryAcc2;
		System.out.println("Lương Acc2 làm tròn: " + intAcc2);

	}

	public static void question2() {
//		Question 2:
//			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
		System.out.println("Số ngẫu nhiên có 5 chữ số: ");
		int x = random.nextInt(100000);
		System.out.println(String.format("%05d", x));

	}

	public static void question3() {
//		Question 3:
//			Lấy 2 số cuối của số ở Question 2 và in ra.
//			Gợi ý:
//			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//			Cách 2: chia lấy dư số đó cho 100

		System.out.println("Số ngẫu nhiên có 5 chữ số: ");
		int x = random.nextInt(100000);
		System.out.println(String.format("%05d", x));
		int y = x % 100;
		System.out.println("Hai số cuối: ");
		System.out.println(String.format("%02d", y));

	}

	public static void question4() {
//		Question 4:
//			Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		int a, b;
		System.out.println("Nhập vào 2 số nguyên: ");
		System.out.println("Nhập a: ");
		a = scanner.nextInt();
		do {
			System.out.println("Nhập b != 0:  ");
			b = scanner.nextInt();
		} while (b == 0);
		scanner.close();
		System.out.println("Thương: " + (float) a / (float) b);
	}
	
	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
	}
}
