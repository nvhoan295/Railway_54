package Assignment1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Sale";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Kỹ thuật";

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Tổ chức";

		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;

		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.Test;

		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Secrum_Master;

		Position pos4 = new Position();
		pos4.id = 4;
		pos4.name = PositionName.PM;

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		group1.createDate = LocalDate.of(2021, 1, 1);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		group2.createDate = LocalDate.of(2020, 2, 1);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";
		group3.createDate = LocalDate.of(2019, 1, 3);

		Account ac1 = new Account();
		ac1.id = 1;
		ac1.email = "daonq1";
		ac1.userName = "daonq1";
		ac1.fullName = "Dao Nguyen 1";
		ac1.departmentId = dep1;
		ac1.positionId = pos1;
		ac1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		ac1.groups = groupAcc1;

		Account ac2 = new Account();
		ac2.id = 2;
		ac2.fullName = "Tran B";
		ac2.email = "TranB";
		ac2.userName = "TranB";
		ac2.positionId = pos2;
		ac2.departmentId = dep2;
		ac2.createDate = LocalDate.of(2011, 03, 17);
		ac2.groups = new Group[] { group3, group2 };

		Account ac3 = new Account();
		ac3.id = 3;
		ac3.email = "Nguyenacc3";
		ac3.userName = "NguyenAc3";
		ac3.fullName = "NguyenAc3";
		ac3.positionId = pos3;
		ac3.departmentId = dep3;
		ac3.createDate = LocalDate.now();

		group1.accounts = new Account[] { ac1 };
		group2.accounts = new Account[] { ac1, ac2 };
		group3.accounts = new Account[] { ac2 };

//		
//		Question 1:
//			Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//			"Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."

		if (ac2.departmentId == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + ac2.departmentId.name);
		}

		/*
		 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text c Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
		 * quan trọng, tham gia nhiều group" Nếu có mặt trong 4 group trở lên thì sẽ in
		 * ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
		 */
		System.out.println("--- Question2 ------");
		int countGroupAc2 = ac2.groups.length;
		if (ac2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (countGroupAc2 == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
//		Question 3:
//			Sử dụng toán tử ternary để làm Question 1
		System.out.println("--- Question3 ------");
		System.out.println(
				ac2.departmentId == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: ");

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println("--- Question4 ------");

		System.out.println(
				ac1.positionId.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"

		System.out.println("--- Question5 ------");

		int countAccInGroup = group1.accounts.length;

		switch (countAccInGroup) {
		case 1:
			System.out.println("Nhóm có 1 thành viên");
			break;
		case 2:
			System.out.println("Nhóm có 2 thành viên");
			break;
		case 3:
			System.out.println("Nhóm có 3 thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}

//		Question 6:
//			Sử dụng switch case để làm lại Question 2

		System.out.println("--- Question6 ------");

		int countGroupAcc2 = ac2.groups.length;
		if (ac2.groups == null) {
			System.out.println("Nhân viên không tham gia Group nào");
		} else {
			switch (countGroupAcc2) {
			case 1:
				System.out.println("Nhân viên này có group");
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này tham gia 3 group");
				break;
			default:
				System.out.println("Nhân viên này chuyên đi hóng chuyện");
				break;
			}
		}

//		Question 7:
//			Sử dụng switch case để làm lại Question 4
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"

		System.out.println("--- Question7 ------");

		String PositionNameacc1 = ac1.positionId.name.toString();

		switch (PositionNameacc1) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}

//		Question 8:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

		System.out.println("--- Question8 ------");

		Account[] accArray = { ac1, ac2, ac3 };
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName
					+ " TênPhòng: " + account.departmentId.name);
		}

//		Question 9:
//			In ra thông tin các phòng ban bao gồm: id và name

		Department[] arrPhongBan = { dep1, dep2, dep3 };
		for (Department phongBan : arrPhongBan) {
			System.out.println("ID Phòng: " + phongBan.id + " Tên Phòng: " + phongBan.name);
		}

		/*
		 * Question 10: In ra thông tin các account bao gồm: Email, FullName và tên
		 * phòng ban của họ theo định dạng như sau: Thông tin account thứ 1 là: Email:
		 * NguyenVanA@gmail.com Full name: Nguyễn Văn A Phòng ban: Sale
		 * 
		 * Thông tin account thứ 2 là: Email: NguyenVanB@gmail.com Full name: Nguyễn Văn
		 * B Phòng ban: Marketting
		 */

		System.out.println("==== Quesstion 10 =======");
		Account[] arr2Acc = { ac1, ac2 };
		for (int i = 0; i < arr2Acc.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + arr2Acc[i].email);
			System.out.println("Full Name: " + arr2Acc[i].fullName);
			System.out.println("Phòng ban: " + arr2Acc[i].departmentId.name);

//			Question 11:
//				In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//				Thông tin department thứ 1 là:
//				Id: 1
//				Name: Sale
//				Thông tin department thứ 2 là:
//				Id: 2
//				Name: Marketing
			System.out.println("=== Question 11 ====");
			Department[] departments = { dep1, dep2 };
			for (int j = 0; j < departments.length; j++) {
				System.out.println("Thông tin department thứ " + (j + 1) + " là: ");
				System.out.println("ID: " + departments[j].id);
				System.out.println("Name: " + departments[j].name);
			}

//			Question 12:
//				Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10

			System.out.println("=== Question 12 ====");
			Department[] departments12 = { dep1, dep2, dep3 };
			for (int j = 0; j < departments12.length; j++) {
				System.out.println("Thông tin department thứ " + (j + 1) + " là: ");
				System.out.println("ID: " + departments12[j].id);
				System.out.println("Name: " + departments12[j].name);
			}

//			Question 13:
//				In ra thông tin tất cả các account ngoại trừ account thứ 2

			System.out.println("==== Question 13 =====");
			Account[] arrAccounts = { ac1, ac2, ac3 };
			for (int j = 0; j < arrAccounts.length; j++) {
				if (j != 1) {
					System.out.println("Thông tin Account " + (j + 1) + " là: ");
					System.out.println("ID: " + arrAccounts[j].id);
					System.out.println("Email: " + arrAccounts[j].email);
					System.out.println("FullName: " + arrAccounts[j].fullName);
					System.out.println("PositionName: " + arrAccounts[j].positionId.name);
					System.out.println("DepartmentName: " + arrAccounts[j].departmentId.name);
					System.out.println("Ngày tạo: " + arrAccounts[j].createDate);
				}
			}

//			Question 14:
//				In ra thông tin tất cả các account có id < 4
			System.out.println("=== Question 14 ====");

			for (int j = 0; j < arrAccounts.length; j++) {
				if (j < 3) {
					System.out.println("Thông tin Account " + (j + 1) + " là: ");
					System.out.println("ID: " + arrAccounts[j].id);
					System.out.println("Email: " + arrAccounts[j].email);
					System.out.println("FullName: " + arrAccounts[j].fullName);
					System.out.println("PositionName: " + arrAccounts[j].positionId.name);
					System.out.println("DepartmentName: " + arrAccounts[j].departmentId.name);
					System.out.println("Ngày tạo: " + arrAccounts[j].createDate);
					System.out.println("========================");
				}
			}

//			Question 15:
//				In ra các số chẵn nhỏ hơn hoặc bằng 20

			System.out.println("==== Question 15 =====");
			for (int z = 0; z <= 20; z++) {
				if (z % 2 == 0) {
					System.out.println(z);
				}
			}

//			Question 16:
//				Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//				lệnh break, continue
//
//				In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//				họ theo định dạng như sau:
//				Thông tin account thứ 1 là:
//				Email: NguyenVanA@gmail.com
//				Full name: Nguyễn Văn A
//				Phòng ban: Sale
//				Thông tin account thứ 2 là:
//				Email: NguyenVanB@gmail.com
//				Full name: Nguyễn Văn B
//				Phòng ban: Marketting

			System.out.println("==== Question 16 =====");
			Account[] arryAcc16 = { ac1, ac2, ac3 };
			while (i < arryAcc16.length) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + arryAcc16[i].email);
				System.out.println("Full Name: " + arryAcc16[i].fullName);
				System.out.println("Phòng ban: " + arryAcc16[i].departmentId.name);
				System.out.println("==================");
				i++;
			}

//			Question 17:
//				Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//				lệnh break, continue

			System.out.println("======= Question 17 ======");
			Account[] arryAcc17 = { ac1, ac2, ac3 };
			int i1 = 0;
			do {
				System.out.println("Thông tin account thứ " + (i1 + 1) + " là: ");
				System.out.println("Email: " + arryAcc17[i1].email);
				System.out.println("Full Name: " + arryAcc17[i1].fullName);
				System.out.println("Phòng ban: " + arryAcc17[i1].departmentId.name);
				System.out.println("==================");
				i1++;
			} while (i1 < arryAcc17.length);
			
			System.out.println("******* Exercise 3 ********");
			
//			Question 1:
//				In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//				dạng vietnamese
			
			
			
			
		
			
			
			
			
			
			
			
			

		}

	}
}
