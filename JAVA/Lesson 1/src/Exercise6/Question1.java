package Exercise6;

public class Question1 {
//		Question 1:
//			Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10

	public static void question1() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		question1();
	}

}
