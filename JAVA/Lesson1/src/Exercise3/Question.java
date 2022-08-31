package Exercise3;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Locale;

import exercise.Exam;

public class Question {
	public static void main(String[] args) {
//		Question 1:
//			In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//			dạng vietnamese
		Exam exam1 = new Exam();
		exam1.code = "Java";
		exam1.createDate = LocalDate.of(2022, 12, 24);
		Locale locale = new Locale("vn", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,
		locale);
		String date = dateformat.format(exam1.createDate);
		System.out.println(exam1.code + ": " + date);
		
		
		
		
		
		
	}
}
