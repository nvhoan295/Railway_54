package Exercise5;

import java.util.Iterator;
import java.util.Scanner;

import exercise.Account;
import exercise.Group;

public class Question9 {
	public static void question9() {
//		Question 9:
//			Viết method cho phép người dùng thêm group vào account theo flow sau:
//			Bước 1:
//			In ra tên các usernames của user cho người dùng xem
//			Bước 2:
//			Yêu cầu người dùng nhập vào username của account
//			Bước 3:
//			In ra tên các group cho người dùng xem
//			Bước 4:
//			Yêu cầu người dùng nhập vào tên của group
//			Bước 5:
//			Dựa vào username và tên của group người dùng vừa chọn, hãy
//			thêm account vào group đó .
		Scanner sc = new Scanner(System.in);
		Group group1 = new Group(1, "Testing system", null, null, null);
		Group group2 = new Group(2, "Development", null, null, null);
		Group group3 = new Group(3, "Sale", null, null, null);

		Account acc1 = new Account(1, "hoan@gamil.com", "NguyenHoan", null, null, null, null);
		Account acc2 = new Account(2, "thao@gmail", "Thao Nguyen", null, null, null, null);
		Account acc3 = new Account(3, "lisa@gmail", "lisa", null, null, null, null);

		Account[] arrAccounts = { acc1, acc2, acc3 };
		Group[] arrGroups = { group1, group2, group3 };
		System.out.println("Danh sách user đang có trên hệ thống:");
		for (int i = 0; i < arrAccounts.length; i++) {
			System.out.println(arrAccounts[i].userName);
		}

		System.out.println("Nhập vào UserName của account: ");
		String userName = sc.next();

		System.out.println("Danh sách Group đang có trên hệ thống:");
		for (Group group : arrGroups) {
			System.out.println(group.name);
		}

		System.out.println("Nhập vào Group cần thêm: ");
		String groupName = sc.next();

		int indexGroup = -1;
		for (int i = 0; i < arrGroups.length; i++) {
			if (arrGroups[i].name.equals(groupName)) {
				indexGroup = i;
			}
		}

		int indexAccount = -1;
		for (int j = 0; j < arrAccounts.length; j++) {
			if (arrAccounts[j].userName.equals(userName)) {
				indexAccount = j;
			}
		}

		if (indexAccount < 0 || indexGroup < 0) {
			System.out.println("Kiểm tra lại thông tin bạn nhập, không có Account hoặc Group này trên hệ thống");
		} else {
			for (int j = 0; j < arrAccounts.length; j++) {
				if (arrAccounts[j].userName.equals(userName)) {
					Group[] gqAdd = { arrGroups[indexGroup] };
					arrAccounts[j].groups = gqAdd;
					System.out.println("Bạn vừa add Group: " + arrAccounts[indexAccount].groups[0].name
							+ " cho Account: " + arrAccounts[indexAccount].userName);
				}

			}
		}

	}
}
