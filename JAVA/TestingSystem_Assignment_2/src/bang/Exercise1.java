package bang;

import java.time.LocalDate;

import bang.CategoryQuestion.CategoryName;
import bang.Position.PositionName;
import bang.TypeQuestion.TypeName;

public class Exercise1 {
	public static void main(String[] args) {
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(2, "Giam doc");
		Department dep3 = new Department(3, "Ky thuat");
		Department dep4 = new Department(4, "Tai chinh");

		Position pos1 = new Position(1, PositionName.DEV);
		Position pos2 = new Position(2, PositionName.TEST);
		Position pos3 = new Position(3, PositionName.SECRUM_MASTER);
		Position pos4 = new Position(4, PositionName.PM);

		Account acc1 = new Account(1, "admin@gmail.com", "Username1", "Fullname1", dep4, pos1,
				LocalDate.of(2020, 12, 23));
		Account acc2 = new Account(2, "Email2@gmail.com", "Username2", "Fullname2", dep1, pos4, LocalDate.now());
		Account acc3 = new Account(3, "Email3@gmail.com", "Username2", "Fullname3", dep2, pos3, LocalDate.now());
		Account acc4 = new Account(4, "Email4@gmail.com", "Username2", "Fullname4", dep3, pos1, LocalDate.now());

		Group group1 = new Group(1, "Testing System", acc4, LocalDate.now());
		Group group2 = new Group(2, "Development", acc1, LocalDate.now());
		Group group3 = new Group(3, "VTI Sale 01", acc2, LocalDate.now());
		Group group4 = new Group(4, "Management", acc4, LocalDate.now());

		GroupAccount groupAccount1 = new GroupAccount(group1, new Account[] { acc1, acc2 }, LocalDate.now());
		GroupAccount groupAccount2 = new GroupAccount(group2, new Account[] { acc1, acc2, acc3 }, LocalDate.now());
		GroupAccount groupAccount3 = new GroupAccount(group3, new Account[] { acc1, acc3 }, LocalDate.now());
		GroupAccount groupAccount4 = new GroupAccount(group4, new Account[] { acc1, acc2, acc3, acc4 },
				LocalDate.now());

		acc2.groups = new Group[] { group1, group2, group4 };

		TypeQuestion typeQuestion1 = new TypeQuestion(1, TypeName.ESSAY);
		TypeQuestion typeQuestion2 = new TypeQuestion(2, TypeName.MULTIPLE_CHOICE);

		CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, CategoryName.JAVA);
		CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, CategoryName.DOT_NET);
		CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, CategoryName.SQL);
		CategoryQuestion categoryQuestion4 = new CategoryQuestion(4, CategoryName.RUBY);
		CategoryQuestion categoryQuestion5 = new CategoryQuestion(5, CategoryName.POSTMAN);

		Question question1 = new Question(1, "Cau hoi ve Java", categoryQuestion1, typeQuestion2, acc4,
				LocalDate.now());
		Question question2 = new Question(2, "Cau hoi ve PHP", categoryQuestion2, typeQuestion2, acc1, LocalDate.now());
		Question question3 = new Question(3, "Cau hoi ve Ruby", categoryQuestion4, typeQuestion2, acc2,
				LocalDate.now());
		Question question4 = new Question(4, "Cau hoi ve .Net", categoryQuestion2, typeQuestion2, acc3,
				LocalDate.now());
		Question question5 = new Question(5, "Cau hoi ve PostMan", categoryQuestion5, typeQuestion2, acc4,
				LocalDate.now());

		Answer answer1 = new Answer(1, "Tra loi 01", question5, true);
		Answer answer2 = new Answer(2, "Tra loi 02", question3, true);
		Answer answer3 = new Answer(3, "Tra loi 03", question4, true);
		Answer answer4 = new Answer(4, "Tra loi 04", question2, true);
		Answer answer5 = new Answer(5, "Tra loi 05", question1, true);
		Answer answer6 = new Answer(6, "Tra loi 06", question1, true);
		Answer answer7 = new Answer(7, "Tra loi 07", question1, true);
		Answer answer8 = new Answer(8, "Tra loi 08", question5, true);

		Exam exam1 = new Exam(1, "VTIQ001", "Đề thi C#", categoryQuestion1, 60, acc4, LocalDate.now());
		Exam exam2 = new Exam(2, "VTIQ002", "Đề thi PHP", categoryQuestion2, 120, acc3, LocalDate.now());
		Exam exam3 = new Exam(3, "VTIQ003", "Đề thi .Net", categoryQuestion3, 90, acc2, LocalDate.now());
		Exam exam4 = new Exam(4, "VTIQ004", "Đề thi Java", categoryQuestion5, 60, acc1, LocalDate.now());
		Exam exam5 = new Exam(5, "VTIQ005", "Đề thi SQL", categoryQuestion4, 90, acc2, LocalDate.now());
		Exam exam6 = new Exam(6, "VTIQ006", "Đề thi C#", categoryQuestion3, 120, acc1, LocalDate.now());

		ExamQuestion examQuestion1 = new ExamQuestion(exam1, question4);
		ExamQuestion examQuestion2 = new ExamQuestion(exam2, question2);
		ExamQuestion examQuestion3 = new ExamQuestion(exam3, question3);
		ExamQuestion examQuestion4 = new ExamQuestion(exam4, question1);

//		Question 1:
//			Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//			"Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
		System.out.println("===== Question 1 =====");

		if (acc2.getDepartment() == null) {
			System.out.println("Không có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên là: " + acc2.getDepartment().getName());
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
		System.out.println("=== Question 2 ====");
		int x = acc2.groups.length;
		System.out.println("Nhân viên acc2 tham gia số group là: " + x);
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			if (x == 1 || x == 2) {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			}
			if (x == 3) {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			} else {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}

//		Question 3:
//			Sử dụng toán tử ternary để làm Question 1
		System.out.println("=== Question 3 ====");

		System.out.println(acc1.getDepartment() == null ? "Nhân viên chưa có phòng ban"
				: "Phòng ban của nhân viên là " + acc2.getDepartment().getName());

//		Question 4:
//			Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"

		System.out.println("=== Question 4 ===");
		System.out.println(acc1.getPosition().getName().toString() == "DEV" ? "Đây là Developer"
				: "Người này không phải là Developer");

//		Question 5:
//			Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên"
		System.out.println("------- Question 5 -----------");
		System.out.printf("GroupAccount1 có: ");
		switch (groupAccount1.account.length) {
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
		System.out.println("------- Question 6 -------------");
		System.out.println("Nhân viên acc2 tham gia số group là: " + acc2.groups.length);
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} 
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
			case 4:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			default:
				break;
			}
			
//			Question 8:
//				In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
			System.out.println("---- Question 8 ----------");
			Account[] accounts = {acc1, acc2, acc3,acc4};
			for (Account account : accounts) {
				System.out.println("Email: "+ account.getEmail());
				System.out.println("FullName: "+ account.getFullName());
				System.out.println("DepartmentName: "+ account.getDepartment().getName());
				System.out.println("-------------------");
			}
			
//			Question 9:
//				In ra thông tin các phòng ban bao gồm: id và name
			
			System.out.println("----- Question 9 -------");
			Department[] departments = {dep1, dep2, dep3, dep4};
			System.out.println("Thông tin các phòng ban");
			for (Department department : departments) {
				System.out.println("DepartmentID: "+ department.getId());
				System.out.println("DepartmentName: "+ department.getName());
				System.out.println("--------------------");
			}
			
			
//			Question 10:
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
//				Question 11:
//				In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//				Thông tin department thứ 1 là:
//				Id: 1
//				Name: Sale
//				Thông tin department thứ 2 là:
//				Id: 2
//				Name: Marketing
			System.out.println("----- Question 10 --------");
			
			for (int i = 0; i < accounts.length; i++) {
				System.out.println("Thông tin account thứ "+ (i+1)+" là: ");
				System.out.println("Email: "+ accounts[i].getEmail());
				System.out.println("FullName: "+ accounts[i].getFullName());
				System.out.println("DepartmentName: "+ accounts[i].getDepartment().getName());
				System.out.println("PositionName: "+ accounts[i].getPosition().getName());
				System.out.println("----------------------");
			}
			
//			Question 12:
//				Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
			System.out.println("---- Question 12 --------");
			System.out.println("Thông tin Department đầu tiền");
			for (int i = 0; i < accounts.length; i++) {
				if (i < 2) {
					System.out.println("Thông tin account thứ "+ (i+1)+" là: ");
					System.out.println("Email: "+ accounts[i].getEmail());
					System.out.println("FullName: "+ accounts[i].getFullName());
					System.out.println("DepartmentName: "+ accounts[i].getDepartment().getName());
					System.out.println("PositionName: "+ accounts[i].getPosition().getName());
					System.out.println("----------------------");
				}
			}
//			Question 13:
//				In ra thông tin tất cả các account ngoại trừ account thứ 2
			
			System.out.println("---- Question 13 -------");
			for (int i = 0; i < accounts.length; i++) {
				if (i != 1) {
					System.out.println("Thông tin account thứ "+ (i+1)+" là: ");
					System.out.println("Email: "+ accounts[i].getEmail());
					System.out.println("FullName: "+ accounts[i].getFullName());
					System.out.println("DepartmentName: "+ accounts[i].getDepartment().getName());
					System.out.println("PositionName: "+ accounts[i].getPosition().getName());
					System.out.println("----------------------");
				}
			}
			
//			Question 14:
//				In ra thông tin tất cả các account có id < 4
			System.out.println("---- Question 14 -------");
			for (int i = 0; i < accounts.length; i++) {
				if (i != 3) {
					System.out.println("Thông tin account thứ "+ (i+1)+" là: ");
					System.out.println("Email: "+ accounts[i].getEmail());
					System.out.println("FullName: "+ accounts[i].getFullName());
					System.out.println("DepartmentName: "+ accounts[i].getDepartment().getName());
					System.out.println("PositionName: "+ accounts[i].getPosition().getName());
					System.out.println("----------------------");
				}
			}
			
//			Question 15:
//				In ra các số chẵn nhỏ hơn hoặc bằng 20
			System.out.println("------ Question 15 -------");
			System.out.println("Các số chẵn nhỏ hơn hoặc bằng 20");
			for (int i = 0; i <= 20; i++) {
				if(i % 2 == 0) {
					System.out.printf("%d ", i);
				}
			}
			
//			WHILE
//			Question 16:
//			Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//			lệnh break, continue
	}
}
