package bang;

import java.util.Date;
import java.util.Scanner;

import bang.Position.PositionName;

public class Exercise5 {
	static Scanner scanner = new Scanner(System.in);

	public static void question1() {
//		Question 1:
//			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		System.out.println("----- Question 1 --------");
		System.out.println("Nhập x: ");
		int x = scanner.nextInt();
		System.out.println("Nhập y: ");
		int y = scanner.nextInt();
		System.out.println("Nhập z: ");
		int z = scanner.nextInt();
		System.out.println("Bạn vừa nhập: " + "x: " + x + ", y: " + y + ", z: " + z);
	}

	public static void question2() {
//		Question 2:
//			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		System.out.println("---- Question 2 ---------");
		System.out.println("Nhập số thực f: ");
		float f = scanner.nextFloat();
		System.out.println("Nhập số thưc g: ");
		float g = scanner.nextFloat();
		System.out.println("Bạn vừa nhập: " + "f: " + f + ", g: " + g);
	}

	public static void question3() {
		System.out.println("------ Question 3 --------");
		System.out.println("Nhập họ và tên:");
		String hoVaTen = scanner.nextLine();
		System.out.println("Họ tên bạn nhập: " + hoVaTen);
	}

	public static void question4() {
//		Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("------ Question 4 --------");
		System.out.println("Nhập ngày: ");
		int ngaySinh = scanner.nextInt();
		System.out.println("Nhập tháng: ");
		int thangSinh = scanner.nextInt();
		System.out.println("Nhập năm: ");
		int nam = scanner.nextInt();
		System.out.println("Ngày sinh nhật: ");
		System.out.println(ngaySinh + " - " + thangSinh + " - " + nam);
	}

	public static void question5() {
//		Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//			chương trình sẽ chuyển thành Position.Dev, Position.Test,
//			Position.ScrumMaster, Position.PM

		System.out.println("Chức năng Tạo Account: ");
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.setId(scanner.nextInt());
		System.out.println("Nhập email: ");
		acc.setEmail(scanner.next());
		System.out.println("Nhập fullName: ");
		acc.setFullName(scanner.next());
		System.out.println("Nhập Position: 1.Dev, 2.Test, 3.ScrumMaster, 4.PM");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			Position pos1 = new Position(1, PositionName.DEV);
			acc.setPosition(pos1);
			break;
		case 2:
			Position pos2 = new Position(2, PositionName.TEST);
			acc.setPosition(pos2);
			break;
		case 3:
			Position pos3 = new Position(3, PositionName.SECRUM_MASTER);
			acc.setPosition(pos3);
			break;
		case 4:
			Position pos4 = new Position(4, PositionName.PM);
			acc.setPosition(pos4);
			break;
		default:
			System.out.println("Nhập lại !!!!!!!");
			return;
		}
		System.out.println(acc.toString());

	}

	public static void question6() {
//		Question 6:
//			Viết lệnh cho phép người dùng tạo department (viết thành method)
		System.out.println("Tạo Department: ");
		Department dep = new Department();
		System.out.println("Nhập ID: ");
		dep.setId(scanner.nextInt());
		System.out.println("Nhập Name: ");
		dep.setName(scanner.next());
		System.out.println("Thông tin Deparment vừa nhập: ");
		System.out.println(dep.toString());

	}

	public static void question7() {
//		Question 7:
//			Nhập số chẵn từ console
		System.out.println("Nhập số chẵn từ console: ");
		while (true) {
			int chan = scanner.nextInt();
			if (chan % 2 == 0) {
				System.out.println("Bạn vừa nhập: " + chan);
				return;
			} else {
				System.out.println("Nhập lại số chẵn: ");
			}

		}

	}

	public static void question8() {
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
		while (true) {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
			System.out.println("Nhập 1 hoặc 2: ");
			int nhap = scanner.nextInt();
			switch (nhap) {
			case 1:
				question5();
				return;
			case 2:
				question6();
				return;
			default:
				System.out.println("Bạn nhập sai rồi. Nhập lại ...");
			}
		}
	}

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
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(2, "Giam doc");
		Department dep3 = new Department(3, "Ky thuat");
		Department dep4 = new Department(4, "Tai chinh");

		Position pos1 = new Position(1, PositionName.DEV);
		Position pos2 = new Position(2, PositionName.TEST);
		Position pos3 = new Position(3, PositionName.SECRUM_MASTER);
		Position pos4 = new Position(4, PositionName.PM);

		Account acc1 = new Account(1, "admin@gmail.com", "Username1", "Fullname1", dep4, pos4, new Date());
		Account acc2 = new Account(2, "Email2@gmail.com", "Username2", "Fullname2", dep1, pos4, new Date());
		Account acc3 = new Account(3, "Email3@gmail.com", "Username2", "Fullname3", dep2, pos3, new Date());
		Account acc4 = new Account(4, "Email4@gmail.com", "Username2", "Fullname4", dep3, pos1, new Date());

		Group group1 = new Group(1, "Testing System", acc4, new Date());
		Group group2 = new Group(2, "Development", acc1, new Date());
		Group group3 = new Group(3, "VTI Sale 01", acc2, new Date());
		Group group4 = new Group(4, "Management", acc4, new Date());

		GroupAccount groupAccount1 = new GroupAccount(group1, new Account[] { acc1, acc2 }, new Date());
		GroupAccount groupAccount2 = new GroupAccount(group2, new Account[] { acc1, acc2, acc3 }, new Date());
		GroupAccount groupAccount3 = new GroupAccount(group3, new Account[] { acc1, acc3 }, new Date());
		GroupAccount groupAccount4 = new GroupAccount(group4, new Account[] { acc1, acc2, acc3, acc4 }, new Date());

//		Bước 1: In ra tên các usernames của user cho người dùng xem
		Account[] arrAccounts = { acc1, acc2, acc3, acc4 };
		for (Account account : arrAccounts) {
			System.out.println(account.getUserName());
		}
//		Bước 2:
//			Yêu cầu người dùng nhập vào username của account
		System.out.println("Bạn nhập tên userName của Account: ");
		String userNameInput = scanner.next();
//		Bước 3:
//			In ra tên các group cho người dùng xem
		GroupAccount[] arrGroupAccounts = { groupAccount1, groupAccount2, groupAccount3, groupAccount4 };
		for (GroupAccount groupAccount : arrGroupAccounts) {
			System.out.println(groupAccount.getId().getName());
		}
//		Bước 4:
//			Yêu cầu người dùng nhập vào tên của group
		System.out.println("Nhập vào tên group: ");
		String groupAccountInput = scanner.next();
//		Bước 5:
//			Dựa vào username và tên của group người dùng vừa chọn, hãy
//			thêm account vào group đó .

	}

	public static void main(String[] args) {

		// Thêm các Methos vào đây để chạy:
		// Ví dụ:
		question8();

	}

}
