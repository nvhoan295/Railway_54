package init;

import java.util.Date;

public class Exercise2 {

	public static void main(String[] args) {
//		Question 1:
//			Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//			tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//			 Email: "Email 1"
//			 Username: "User name 1"
//			 FullName: "Full name 1"
//			 CreateDate: now
		System.out.println("-------- Question 1 ----------");
		Account acc1 = new Account(1, "Email1", "username 1", "full name 1", new Date());
		Account acc2 = new Account(2, "Email2", "username 2", "full name 2", new Date());
		Account acc3 = new Account(3, "Email3", "username 3", "full name 3", new Date());
		Account acc4 = new Account(4, "Email4", "username 4", "full name 4", new Date());
		Account acc5 = new Account(5, "Email5", "username 5", "full name 5", new Date());
		Account[] accounts = { acc1, acc2, acc3, acc4, acc5 };
		for (Account account : accounts) {
			System.out.println("Email: " + account.getEmail());
			System.out.println("UserName: " + account.getUserName());
			System.out.println("FullName: " + account.getFullName());
			System.out.println("CreateDate: " + account.getCreateDate());
			System.out.println("----------------------");
		}

	}
}
