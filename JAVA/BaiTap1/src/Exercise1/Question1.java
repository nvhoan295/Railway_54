package Exercise1;

import Bang.Account;
import Bang.Department;
import Bang.Group;
import Bang.Position;
import Bang.PositionName;

public class Question1 {
	public static void main(String[] args) {
		Department dep1 = new Department(1l, "Sale");
		Department dep2 = new Department(2l, "Kỹ thuât");
		Department dep3 = new Department(3l, "Tổ chức");

		Position pos1 = new Position(1l, PositionName.Dev);
		Position pos2 = new Position(2l, PositionName.Test);
		Position pos3 = new Position(3l, PositionName.Scrum_Master);
		Position pos4 = new Position(4l, PositionName.PM);

		Account acc1 = new Account(1l, "Hoan", null, null, dep3, pos4, null);
		Account acc2 = new Account(2l, "Nguyen", null, null, dep1, pos2, null);
		Account acc3 = new Account(3l, "Thao", null, null, dep1, pos3, null);

		Account[] arryAccounts = { acc1, acc2, acc3 };

		for (Account account : arryAccounts) {
			System.out.println("ID: " + account.id + "  Tên: " + account.name + "  Phòng ban: "
					+ account.departmentID.name + "   Vị trí: " + account.positionID.name);
		}

			Group g1 = new Group(1l, "Testing System", null, null);
			Group g2 = new Group(2l, "Development", null, null);
			Group g3 = new Group(3l, "Sale", null, null);
			
			g1.accounts = new Account[] {acc1, acc2};
			g2.accounts = new Account[] {acc1,acc2, acc3};
			g3.accounts = new Account[] {acc2, acc3};
			
//			Question 1:
//				Kiểm tra account thứ 2
//				Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//				"Nhân viên này chưa có phòng ban"
//				Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
			
			System.out.println("==== Question 1 =====");
			if (acc2.departmentID == null) {
				System.out.println("Không có ai");
			} else {
				System.out.println("Phòng ban của Account2 là: " + acc2.departmentID.name);
			}

	
//			Question 2:
//				Kiểm tra account thứ 2
//				Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//				Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//				này là Java Fresher, C# Fresher"
//				Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//				quan trọng, tham gia nhiều group"
//				Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//				người hóng chuyện, tham gia tất cả các group"
		

	}
}
