package Exercise2;

import java.util.Locale;

public class Question {
	public static void main(String[] args) {
//		Question 1:
//			Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//			nguyên đó
		int x = 5;
		System.out.printf("%d%n", x);
		
//		Question 2:
//			Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//			ra số nguyên đó thành định dạng như sau: 100,000,000
		int y = 100000000;
		System.out.printf(Locale.UK, "%,d%n", y);
		
//		Question 3:
//			Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//			thực đó chỉ bao gồm 4 số đằng sau
		float z = 5.567098f;
		System.out.printf("%2.4f%n", z);
		
//		Question 4:
//			Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//			dạng như sau:
//			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		
		String s = "Nguyễn Văn A";
		System.out.printf("Tên tôi là \"" + s + "\" và tôi độc thân \n");
		
		
		
		
		
	}
}