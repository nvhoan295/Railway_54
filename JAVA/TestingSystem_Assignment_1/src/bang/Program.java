package bang;

import java.time.LocalDate;

import bang.CategoryQuestion.CategoryName;
import bang.Position.PositionName;
import bang.TypeQuestion.TypeName;

public class Program {
	public static void main(String[] args) {
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(2, "Giam doc");
		Department dep3 = new Department(3, "Ky thuat");
		Department dep4 = new Department(4, "Tai chinh");

		Position pos1 = new Position(1, PositionName.DEV);
		Position pos2 = new Position(2, PositionName.TEST);
		Position pos3 = new Position(3, PositionName.SECRUM_MASTER);
		Position pos4 = new Position(4, PositionName.PM);

		Account acc1 = new Account(1, "admin@gmail.com", "Username1", "Fullname1", dep4, pos4,
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

		System.out.println("group4 có số Acc là: " + groupAccount4.account.length);
		for (int i = 0; i < groupAccount4.account.length; i++) {
			System.out.println("Thông tin các acc trong group4");
			System.out.println("ID: " + groupAccount4.account[i].getId());
			System.out.println("Email: " + groupAccount4.account[i].getEmail());
			System.out.println("FullName: " + groupAccount4.account[i].getFullName());
			System.out.println("Phòng ban: " + groupAccount4.account[i].getDepartment().getName());
			System.out.println("Chức vụ: " + groupAccount4.account[i].getPosition().getName());
			System.out.println("---------------");
		}
		System.out.println(groupAccount1.account.length);

	}
}
