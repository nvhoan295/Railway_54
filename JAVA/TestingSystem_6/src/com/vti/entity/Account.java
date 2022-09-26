package com.vti.entity;

import com.vti.Utils.ScanerUtils;
import com.vti.backend.InvalidAgeInputingException;

public class Account {
	private int age;
	private String name;

	public Account() {
		input();
	}

	public void input() {
		System.out.println("Nhập name: ");
		name = ScanerUtils.inputString();
		System.out.println("Nhập age: ");
		age = ScanerUtils.inputAge();
	}
//	Question 11 (Optional): Custom Exception
//	Tạo custom Exception tên là: InvalidAgeInputingException.
//	Hãy viết method inputAge() ở class Account với yêu cầu như sau:
//	Khi người dùng nhập vào tuổi <= 0 thì throw ra Exception
//	InvalidAgeInputingException với message là: "The age must
//	be greater than 0"

	public int inputAge() throws InvalidAgeInputingException {
		int age = ScanerUtils.inputInt();
		if (age < 0) {
			throw new InvalidAgeInputingException("The age must be greater than 0");
		} else {
			return age;
		}
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
				age = inputAge();
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

	public int getId() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.age = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [id=" + age + ", name=" + name + "]";
	}

}
