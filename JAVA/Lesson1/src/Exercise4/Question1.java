package Exercise4;

import java.time.LocalDate;
import java.util.Random;

public class Question1 {
	public static void main(String[] args) {
//		Question 1:
//			In ngẫu nhiên ra 1 số nguyên
		Random random = new Random();
		int x = random.nextInt();
		System.out.println("Số ngẫu nhiên: "+ x);
//		Question 2:
//			In ngẫu nhiên ra 1 số thực
		float f = random.nextFloat();
		System.out.println("Số thực ngẫu nhiên: " + f);
		
		String[] arrTen = { "Thảo", "Hoàn", "Lisa", "Bi", "Tí"};
		int i = random.nextInt(arrTen.length);
		System.out.println("Tên ngẫu nhiên: " + arrTen[i]);
		
//		Question 4:
//			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
//			1995
		
		System.out.println("--- Question 4 ---");
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		System.out.println("minDay: "+ minDay);
		System.out.println("maxDay: "+ maxDay);
		long randomInt =  minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.err.println(randomDay);
		
		
		
		
		
		
		
	}
}
