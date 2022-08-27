package Exercise6;

import java.time.LocalDate;

import Assignment1.Account;

//Question 2:
//Tạo method để in thông tin các account
public class Question2 {
	public static void question2() {
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.fullName = "Nguyen Hoan";
		acc1.createDate = LocalDate.now();
		
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.fullName = "Thao Nguyen";
		acc2.createDate = LocalDate.of(2022, 12, 12);
		
		Account acc3 = new Account();
		acc3.id = 3;
		acc2.fullName = "Lisa";
		acc3.createDate = LocalDate.of(2022, 12, 9);
		printAccount(acc3);
		printAccount(acc1);
		printAccount(acc2);
	}
	
	public static void printAccount(Account account) {
		System.out.println("ID: " + account.id + " Name: "+ account.fullName + " CreateDate: "+ account.createDate);
	}
}
