package Assignment1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Exercise3 {
	public static void main(String[] args) {
//		Question 1:
//			In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//			dạng vietnamese
		Exam exam1 = new Exam();
		exam1.createDate = LocalDate.of(2020, 3, 13);
		System.out.println(exam1.createDate);
		
//		Locale locale = new Locale("vn", "VN");
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		String date = dateFormat.format(exam1.createDate);
//		
//		System.out.println(date);
		
		
		
		
	}
}
