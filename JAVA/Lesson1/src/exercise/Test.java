package exercise;

import java.time.LocalDate;

import exercise.Position.PositionName;

public class Test {
	public static void main(String[] args) {
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(2, "Kỹ thuật");
		Department dep3 = new Department(3, "Tổ chức");

		Position pos1 = new Position(1, PositionName.DEV);
		Position pos2 = new Position(2, PositionName.TEST);
		Position pos3 = new Position(3, PositionName.SCRUM_MASTER);
		Position pos4 = new Position(4, PositionName.PM);

		Group group1 = new Group(1, "Testing system", null, null, null);
		Group group2 = new Group(2, "Development", null, null, null);
		Group group3 = new Group(3, "Sale", null, null, null);

		Account acc1 = new Account(1, null, null, "Hoàn", dep1, pos1, LocalDate.now());
		Group[] groupAcc1 = { group1, group2 };
		acc1.groups = groupAcc1;

		Account acc2 = new Account(2, null, null, "Thảo", dep2, pos3, null);
		acc2.groups = new Group[] { group1, group3, group2 };

		Account acc3 = new Account(3, null, null, "Lisa", dep3, pos4, null);

		group1.accounts = new Account[] { acc1, acc2 };
		group2.accounts = new Account[] { acc1, acc2, acc3 };
		group3.accounts = new Account[] { acc2, acc3 };

		System.out.println("Thông tin Account 1");
		System.out.println("ID: " + acc1.id + " Name: " + acc1.fullName + " Phòng ban: " + acc1.departmentID.name
				+ " Vị trí: " + acc1.positionID.name + "Group: " + acc1.groups[0].name + " " + acc1.groups[1].name);

//		Question 1:
//			Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//			"Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."

		System.out.println("==== Question 1 ======");
		if (acc2.departmentID == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là ..." + acc2.departmentID.name);
		}

//		Question 2:
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//			này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//			quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//			người hóng chuyện, tham gia tất cả các group"

		System.out.println("===== Question 2 =======");

		int countGroup = acc2.groups.length;

		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			if (countGroup == 1 || countGroup == 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (countGroup == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			}
			if (countGroup == 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}

//		Question 3:
//			Sử dụng toán tử ternary để làm Question 1

		System.out.println("===== Question 3 ======");

		System.out.println(acc2.departmentID == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là ..." + acc2.departmentID.name);

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println("===== Question 4 =======");
		System.out.println(acc1.positionID.name.toString() == "DEV" ? "Đây là Developper" : "Người này không phải dev");

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
		System.out.println("==== Question 5 =====");

		int countGroup1 = group1.accounts.length;
		if (group1.accounts == null) {
			System.out.println("Không có ai");
		} else {
			switch (countGroup1) {
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
		}

//		Question 6
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//			này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//			quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//			người hóng chuyện, tham gia tất cả các group"

		System.out.println("==== Question 6 ");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			switch (acc2.groups.length) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
		}

//		Question 7
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println("======= Question 7 ======");

		switch (acc1.positionID.name.toString()) {
		case "DEV":
			System.out.println("Đây là Dev");
			break;
		default:
			System.out.println("Đây ko phải Dev");
			break;
		}

//		Question 8:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ

		System.out.println("====== Question 8 ==========");
		Account[] accounts = { acc1, acc2, acc3 };
		for (Account account : accounts) {
			System.out.println("ID: " + account.id + " Tên: " + account.fullName + " Phòng ban: "
					+ account.departmentID.name + " Vị trí: " + account.positionID.name);
		}

//		Question 9:
//			In ra thông tin các phòng ban bao gồm: id và name

		System.out.println("==== Question 9 =====");
		Department[] departments = { dep1, dep2, dep3 };
		for (Department department : departments) {
			System.out.println("Mã phòng ban: " + department.id + "  Tên phòng ban: " + department.name);
		}

//		Question 10:
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ theo định dạng như sau:
//			Thông tin account thứ 1 là:
//			Email: NguyenVanA@gmail.com
//			Full name: Nguyễn Văn A
//			Phòng ban: Sale
//			Thông tin account thứ 2 là:
//			Email: NguyenVanB@gmail.com
//			Full name: Nguyễn Văn B
//			Phòng ban: Marketting
		System.out.println("==== Question 10 ======");
		Account[] accounts1 = { acc1, acc2, acc3 };

		for (int i = 0; i < accounts1.length; i++) {
			System.out.println("Thông tin Account " + (i + 1) + " là:");
			System.out.println("FullName: " + accounts1[i].fullName);
			System.out.println("Phòng ban: " + accounts1[i].departmentID.name);
			System.out.println("Vị trí: " + accounts1[i].positionID.name);
			System.out.println("-----------------");
		}

//		Question 11:
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		System.out.println("===== Question 11 =====");
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin departmen " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			System.out.println("------------");
		}

//		Question 12:
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("====== Question 12 =======");
		for (int i = 0; i < 2; i++) {

			System.out.println("Thông tin departmen " + (i + 1) + " là: ");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			System.out.println("------------");

		}

//		Question 13:
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("=== Question 13 ===");
		for (int i = 0; i < accounts1.length; i++) {
			if (i != 1) {
				System.out.println("Thông tin Account " + (i + 1) + " là:");
				System.out.println("FullName: " + accounts1[i].fullName);
				System.out.println("Phòng ban: " + accounts1[i].departmentID.name);
				System.out.println("Vị trí: " + accounts1[i].positionID.name);
				System.out.println("-----------------");
			}
		}
		
//		Question 14:
//			In ra thông tin tất cả các account có id < 4
		System.out.println("=== Question 14 ===");
		for (int i = 0; i < accounts1.length; i++) {
			if (i < 4) {
				System.out.println("Thông tin Account " + (i + 1) + " là:");
				System.out.println("FullName: " + accounts1[i].fullName);
				System.out.println("Phòng ban: " + accounts1[i].departmentID.name);
				System.out.println("Vị trí: " + accounts1[i].positionID.name);
				System.out.println("-----------------");
			}
		}
//		Question 15:
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("=== Question 15 ====");
		for (int i = 0; i <= 20; i+=2) {
			System.out.println(i);
		}
		
//		Question 16
//		Dùng While
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//			họ theo định dạng như sau:
//			Thông tin account thứ 1 là:
//			Email: NguyenVanA@gmail.com
//			Full name: Nguyễn Văn A
//			Phòng ban: Sale
//			Thông tin account thứ 2 là:
//			Email: NguyenVanB@gmail.com
//			Full name: Nguyễn Văn B
//			Phòng ban: Marketting
		System.out.println(" **** Question 16 *********");
		Account[] arryAccounts = {acc1, acc2, acc3};
		int i = 0;
		while (i < arryAccounts.length) {
			System.out.println("Thông tin Account " + (i + 1) + " là:");
			System.out.println("FullName: " + arryAccounts[i].fullName);
			System.out.println("Phòng ban: " + arryAccounts[i].departmentID.name);
			System.out.println("Vị trí: " + arryAccounts[i].positionID.name);
			System.out.println("-----------------");
			i++;
		}
		
		System.out.println(" ****** Question 17 ******** Do While");
			int j = 0;
		do {
			System.out.println("Thông tin Account " + (j + 1) + " là:");
			System.out.println("FullName: " + arryAccounts[j].fullName);
			System.out.println("Phòng ban: " + arryAccounts[j].departmentID.name);
			System.out.println("Vị trí: " + arryAccounts[j].positionID.name);
			System.out.println("-----------------");
			j++;
		} while (j < arryAccounts.length);
		
		
		
		
		
		
		

	}
}
