package com.vti.backend;

import java.util.Scanner;

import com.vti.Utils.ScanerUtils;
import com.vti.entity.Department;
import com.vti.entity.Group;

public class Exercise2Exception {
	private Scanner scanner;
	private Department[] departments;

	public Exercise2Exception() {
		departments = new Department[3];
		scanner = new Scanner(System.in);
	}

	public float divide(int a, int b) {
		return a / b;
	}

	public void question1() {
// 		Question 1: Hãy xử lý exception cho VD trên, khi bị lỗi thì sẽ in ra text "cannot divide 0"
		try {
			divide(7, 0);
		} catch (Exception e) {
			System.out.println("Cannot divide 0");
		}
	}

	public void question2() {
//		Question 2: tiếp tục Question 1
//		Sau khi thực hiện xong method divide dù có lỗi hay không sẽ in ra text
//		"divide completed!"
		try {
			divide(7, 3);
		} catch (Exception e) {
			System.out.println("Cannot divide 0");
		} finally {
			System.out.println("divide completed!");
		}
	}

	public void question3() {
//		Question 3:
		int[] numbers = { 1, 2, 3 };
		try {
			System.out.println(numbers[10]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

//	Question 4:
//	Tạo 1 array departments gồm 3 phần tử
//	Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ
//	index trong array departments. Nếu index vượt quá length lấy ra thì sẽ
//	in ra text "Cannot find department."
	public void question4() {
		departments[0] = new Department(1, "Sale");
		departments[1] = new Department(2, "Giám Đốc");
		departments[2] = new Department(3, "Tổ chức");
		try {
			getIndex(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void getIndex(int a) {
		System.out.println(departments[a]);
	}

//	Question 5:
//		Tạo 1 method inputAge() và trả về 1 số int.
//		Trong method hãy cài đặt như sau:
//		B1: Sau đó dùng scanner để nhập vào 1 số
//		B2: Check exeption
//		Nếu người dùng nhập vào 1 số thì return về số đó
//		Nếu người dùng không nhập vào 1 số thì sẽ in ra dòng
//		text "wrong inputing! Please input an age as int, input
//		again."
//		Nếu người dùng không nhập vào 1 số < 0 thì sẽ in ra
//		dòng text "Wrong inputing! The age must be greater
//		than 0, please input again."
//		B3: hãy demo trong method main()
//		Gợi ý:
//		o Tại bước 1 & bước 2: Check exception, ta có thể yêu cầu người
//		dùng nhập vào String (scanner.nextLine()),
//		o Sau đó sử dụng casting datatype để convert String to int
//		o Nếu convert được thì suy ra người dùng nhập vào 1 số
//		int
//		o Nếu không convert được thì suy ra người dùng nhập sai,
//		khi người dùng nhập sai thì sẽ in ra text "wrong
//		inputing! Please input an age as int, input again."
	/*
	 * public int inputAge() { try { System.out.println("Nhập vào tuổi: "); return
	 * Integer.parseInt(scanner.next().trim()); } catch (NumberFormatException e) {
	 * System.out.println("Nhập lại kiểu int: "); } return 0;
	 * 
	 * }
	 */
//	Question 6: Tiếp tục Question 5
//	Sửa lại method inputAge() như sau:
//	Tại B2 của Question 5, Nếu người dùng không nhập vào 1 số thì sẽ in
//	ra dòng text "wrong inputing! Please input an age as int, input again.",
//	đồng thời yêu cầu người dùng nhập lại
//	Gợi ý: sử dụng while

	public Integer inputAge() {
		while (true) {
			try {
				System.out.println("Nhập tuổi: ");
				return Integer.parseInt(scanner.next().trim());
			} catch (NumberFormatException e) {
				System.err.println("Nhập sai. Nhập kiểu int ");
			}
		}
	}

//	Question 10: làm giống bài 9
//	Sử dụng ScannerUtils để nhập thông tin cho Group
//	Khi tạo các property array accounts thì hỏi người dùng xem, bạn có
//	muốn thêm accounts hay không, nếu người dùng đồng ý thì sẽ nhập
//	thông tin account
//	(với mỗi thông tin Account nhập vào ta sẽ tạo Object mới)
	public void question10() {
		System.out.println("Tạo Group: ");
		Group group = new Group();
		System.out.println(group);

	}

}
