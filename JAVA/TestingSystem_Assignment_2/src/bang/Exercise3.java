package bang;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import bang.CategoryQuestion.CategoryName;
import bang.Position.PositionName;
import bang.TypeQuestion.TypeName;

public class Exercise3 {
	public static void main(String[] args) {
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

		TypeQuestion typeQuestion1 = new TypeQuestion(1, TypeName.ESSAY);
		TypeQuestion typeQuestion2 = new TypeQuestion(2, TypeName.MULTIPLE_CHOICE);

		CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, CategoryName.JAVA);
		CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, CategoryName.DOT_NET);
		CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, CategoryName.SQL);
		CategoryQuestion categoryQuestion4 = new CategoryQuestion(4, CategoryName.RUBY);
		CategoryQuestion categoryQuestion5 = new CategoryQuestion(5, CategoryName.POSTMAN);

		Question question1 = new Question(1, "Cau hoi ve Java", categoryQuestion1, typeQuestion2, acc4, new Date());
		Question question2 = new Question(2, "Cau hoi ve PHP", categoryQuestion2, typeQuestion2, acc1, new Date());
		Question question3 = new Question(3, "Cau hoi ve Ruby", categoryQuestion4, typeQuestion2, acc2, new Date());
		Question question4 = new Question(4, "Cau hoi ve .Net", categoryQuestion2, typeQuestion2, acc3, new Date());
		Question question5 = new Question(5, "Cau hoi ve PostMan", categoryQuestion5, typeQuestion2, acc4, new Date());

		Answer answer1 = new Answer(1, "Tra loi 01", question5, true);
		Answer answer2 = new Answer(2, "Tra loi 02", question3, true);
		Answer answer3 = new Answer(3, "Tra loi 03", question4, true);
		Answer answer4 = new Answer(4, "Tra loi 04", question2, true);
		Answer answer5 = new Answer(5, "Tra loi 05", question1, true);
		Answer answer6 = new Answer(6, "Tra loi 06", question1, true);
		Answer answer7 = new Answer(7, "Tra loi 07", question1, true);
		Answer answer8 = new Answer(8, "Tra loi 08", question5, true);

		Exam exam1 = new Exam(1, "VTIQ001", "Đề thi C#", categoryQuestion1, 60, acc4, new Date());
		Exam exam2 = new Exam(2, "VTIQ002", "Đề thi PHP", categoryQuestion2, 120, acc3, new Date());
		Exam exam3 = new Exam(3, "VTIQ003", "Đề thi .Net", categoryQuestion3, 90, acc2, new Date(2022, 04, 15));
		Exam exam4 = new Exam(4, "VTIQ004", "Đề thi Java", categoryQuestion5, 60, acc1, new Date());
		Exam exam5 = new Exam(5, "VTIQ005", "Đề thi SQL", categoryQuestion4, 90, acc2, new Date());
		Exam exam6 = new Exam(6, "VTIQ006", "Đề thi C#", categoryQuestion3, 120, acc1, new Date());

		ExamQuestion examQuestion1 = new ExamQuestion(exam1, question4);
		ExamQuestion examQuestion2 = new ExamQuestion(exam2, question2);
		ExamQuestion examQuestion3 = new ExamQuestion(exam3, question3);
		ExamQuestion examQuestion4 = new ExamQuestion(exam4, question1);

//		Question 1:
//			In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//			dạng vietnamese

		System.out.println("----- Question 1 ---------");
		Locale locale = new Locale("vn", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(exam1.getCreateDate());
		System.out.println(date);

		String dinhDang = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dinhDang);
		String ngay = simpleDateFormat.format(exam1.getCreateDate());
		System.out.println(ngay);

//		Question 2:
//			In ra thông tin: Exam đã tạo ngày nào theo định dạng
//			Năm – tháng – ngày – giờ – phút – giây

		Exam[] exams = { exam1, exam2, exam3, exam4, exam5, exam6 };

		String dinhDang2 = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(dinhDang2);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat2.format(exams[i].getCreateDate()));
		}

//		Question 3:
//			Chỉ in ra năm của create date property trong Question 2
		System.out.println("----- Question 3 --------");
		String dinhDang3 = "yyyy";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(dinhDang3);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat3.format(exams[i].getCreateDate()));
		}

//		Question 4:
//			Chỉ in ra tháng và năm của create date property trong Question 2
		System.out.println("----- Question 4 --------");
		String dinhDang4 = "MM-yyyy";
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(dinhDang4);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat4.format(exams[i].getCreateDate()));
		}

//		Question 5:
//			Chỉ in ra "MM-DD" của create date trong Question 2

		System.out.println("----- Question 5 --------");
		String dinhDang5 = "MM-dd";
		SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(dinhDang5);
		for (int i = 0; i < exams.length; i++) {
			System.out.println(exams[i].getCode() + " : " + simpleDateFormat5.format(exams[i].getCreateDate()));
		}
		System.out.println("vidu");
		Date date2 = new Date(12/4/2022);
		System.out.println(date2.toString());
	}
}
