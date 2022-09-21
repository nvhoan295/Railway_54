package com.vti.entity;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.InvalidAgeInputingException;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private int age;

	public Account() {
		input();
	}

	public void input() {
		System.out.print("Nhập ID: ");
		id = ScannerUtils.inputInt("Nhập sai. Nhập kiểu dữ liệu int");
		System.out.print("Nhập email: ");
		email = ScannerUtils.inputString("Nhập sai. Nhập kiểu dữ liệu String");
		System.out.print("Nhập userName: ");
		userName = ScannerUtils.inputString("Nhập sai. Nhập kiểu dữ liệu String");
		System.out.print("Nhập FullName: ");
		fullName = ScannerUtils.inputString("Nhập sai. Nhập kiểu dữ liệu String");
		System.out.print("Nhập Age: ");
		age = inputAccountAge();

	}

//	Question 11 (Optional): Custom Exception
//	Tạo custom Exception tên là: InvalidAgeInputingException.
//	Hãy viết method inputAge() ở class Account với yêu cầu như sau:
//	Khi người dùng nhập vào tuổi <= 0 thì throw ra Exception
//	InvalidAgeInputingException với message là: "The age must
//	be greater than 0"
	private int inputAge() throws InvalidAgeInputingException {
		int age = ScannerUtils.inputInt("Nhập lại kiểu dữ liệu int");
		if (age < 0) {
			throw new InvalidAgeInputingException("The age must be greater than 0");
		}
		return age;

	}
//	Question 12 (Optional): Tiếp tục Question 11
//	Trong class Account. Sử dụng method inputAge() từ ScannerUtils, hãy
//	viết method inputAccountAge() với yêu cầu như sau:
//	Khi hệ thống gặp exception InvalidAgeInputingException thì
//	sẽ in ra message.
//	Và khi người dùng nhập vào tuổi < 18 thì in ra text "Your age
//	must be greater than 18" và yêu cầu người dùng nhập lại tuổi
//	Sau đó sử dụng method inputAccountAge() để nhập tuổi ở trong
//	Constructor (sửa lại Constructor ở Question 10)

	private int inputAccountAge() {
		while (true) {
			try {
				int age = inputAge();
				if (age < 18) {
					System.out.println("Your age must be greater than 18");
				} else {
					return age;
				}
			} catch (InvalidAgeInputingException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + ", age="
				+ age + "]";
	}

}
