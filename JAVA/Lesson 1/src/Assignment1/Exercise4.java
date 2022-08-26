package Assignment1;

import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {
		
//		Question 1:
//			In ngẫu nhiên ra 1 số nguyên
		System.out.println("Question 1");
		Random random = new Random();
		int x = random.nextInt();
		System.out.println(x);
		
//		Question 2:
//			In ngẫu nhiên ra 1 số thực
		System.out.println("Question 2");
		
		float f = random.nextFloat();
		System.out.println(f);
		
//		Question 3:
//			Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//			ra tên của 1 bạn
		
		System.out.println("Question 3");
		String arrTen[] = {"Thảo", "Liên", "Trang", "Mai"};
		int i = random.nextInt(arrTen.length);
		System.out.println(arrTen[i]);
		
		
		
		
		
	}
}
