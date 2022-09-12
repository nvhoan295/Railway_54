package init;

import java.util.Scanner;

public class Exercise4 {
	static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		String s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		s1 = scanner.nextLine();
		String[] words = s1.split(" ");
		scanner.close();
		System.out.println("Số lượng từ trong chuỗi: " + words.length);

	}

	public static void question2() {
//		Question 2:
//			Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		System.out.println("Nhập chuỗi s1: ");
		String s1 = scanner.nextLine();
		System.out.println("Nhập chuỗi s2: ");
		String s2 = scanner.nextLine();
		System.out.println("Nối 2 chuỗi");
		System.out.println(s1 + " " + s2);
		scanner.close();

	}

	public static void question3() {
//		Question 3:
//			Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//			viết hoa chữ cái đầu thì viết hoa lên
		System.out.println("Nhập tên: ");
		String ten = scanner.nextLine();
		String firstCharacter = ten.substring(0, 1).toUpperCase();
		String leftCharacter = ten.substring(1);
		ten = firstCharacter + leftCharacter;
		System.out.println(ten);
		scanner.close();

	}

	public static void question4() {

//		Question 4:
//			Viết chương trình để người dùng nhập vào tên và in từng ký tự trong tên
//			của người dùng ra
//			VD:
//			Người dùng nhập vào "Nam", hệ thống sẽ in ra
//			"Ký tự thứ 1 là: N"
//			"Ký tự thứ 1 là: A"
//			"Ký tự thứ 1 là: M"
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		String[] kyTu = name.split("");
		for (int i = 0; i < kyTu.length; i++) {
			System.out.println("Ký tự thứ " + (i + 1) + " là: " + kyTu[i].toUpperCase());
		}
		scanner.close();

	}

	public static void question5() {
//		Question 5:
//			Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//			dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		System.out.println("Nhập họ: ");
		String firstName = scanner.nextLine();
		System.out.println("Nhập tên: ");
		String lastName = scanner.nextLine();
		System.out.println("Họ tên: " + firstName + " " + lastName);
		scanner.close();
	}

	public static void question6() {
//		Question 6:
//			Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//			sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//			VD:
//			Người dùng nhập vào "Nguyễn Văn Nam"
//			Hệ thống sẽ in ra
//			"Họ là: Nguyễn"
//			"Tên đệm là: Văn"
//			"Tên là: Nam"
		String ho, dem = "", ten, hoVaTen;
		System.out.println("Nhập họ tên đầy đủ: ");
		hoVaTen = scanner.nextLine();
		hoVaTen = hoVaTen.trim();
		String[] tach = hoVaTen.split(" ");
		ho = tach[0];
		ten = tach[tach.length - 1];

		for (int i = 1; i <= tach.length - 2; i++) {
			dem = dem + tach[i] + " ";
		}

		System.out.println("Họ: " + ho);
		System.out.println("Đệm: " + dem);
		System.out.println("Tên: " + ten);

	}

	public static void question7() {
//		Question 7:
//			Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//			chuẩn hóa họ và tên của họ như sau:
//			a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//			vào
//			VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//			chuẩn hóa thành "nguyễn văn nam"
//			b) Viết hoa chữ cái mỗi từ của người dùng
//			VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//			chuẩn hóa thành "Nguyễn Văn Nam"

		System.out.println("Nhập họ tên: ");
		String fullName = scanner.nextLine();
		fullName = fullName.trim();
		fullName = fullName.replaceAll("\\s+", " ");
		System.out.println("Test: " + fullName);
		// Lấy arrry các từ trong tên
		String[] words = fullName.split(" ");
		fullName = "";
		for (int i = 0; i < words.length; i++) {
			String firstCharacter = words[i].substring(0, 1).toUpperCase();
			String leftCharacter = words[i].substring(1);
			words[i] = firstCharacter + leftCharacter;
			fullName += words[i] + " ";
		}
		System.out.println(fullName);

	}

	public static void question8() {
//		Question 8:
//			In ra tất cả các group có chứa chữ "Java"
		String[] groups = { "Java là gì?", "Java có khó không ", "Python là ngôn ngữ bậc cao" };
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].contains("Java")) {
				System.out.println(groups[i]);
			}
		}

	}

	public static void question9() {
//		Question 9:
//			In ra tất cả các group "Java"
//		Giống câu 8
		String[] groups = { "Java", "C#", "Python" };
		for (int i = 0; i < groups.length; i++) {
			if (groups[i].contains("Java")) {
				System.out.println(groups[i]);
			}
		}
	}

	public static void question10() {
//		Question 10 (Optional):
//			Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//			Nếu có xuất ra “OK” ngược lại “KO”.
//			Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
		String s1 = "", s2 = "", s3 = "";
		System.out.println("Nhập s1: ");
		s1 = scanner.nextLine();
		System.out.println("Nhập s2: ");
		s2 = scanner.nextLine();
		for (int i = s1.length() - 1; i >= 0; i--) {
			s3 += s1.substring(i, i + 1);
		}
		if (s2.equals(s3)) {
			System.out.println("Đây là chuỗi ngược");
		} else {
			System.out.println("Không phải chuỗi ngược");
		}
		scanner.close();

	}

	public static void question11() {
//		Question 11 (Optional): Count special Character
//		Tìm số lần xuất hiện ký tự "a" trong chuỗi
		System.out.println("Nhập chuỗi: ");
		String s = scanner.nextLine();
		scanner.close();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Số lần xuất hiện: " + count);

	}

	public static void question12() {
//		Question 12 (Optional): Reverse String
//		Đảo ngược chuỗi sử dụng vòng lặp
		String s1, reverseS1 = "";
		System.out.println("Nhập chuỗi: ");
		s1 = scanner.nextLine();
		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseS1 += s1.charAt(i);
		}
		System.out.println(reverseS1);

	}

	public static void question13() {
//		Question 13 (Optional): String not contains digit
//		Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//		lại true.
//		Ví dụ:
//		"abc" => true
//		"1abc", "abc1", "123", "a1bc", null => false
		System.out.println("Nhập chuỗi: ");
		String string = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < string.length(); i++) {
			if (checkKeyNumber(string.charAt(i))) {
				System.out.println("False");
				return;
			}
		}
	}

	private static boolean checkKeyNumber(char ch) {
		if (ch >= 0 && ch < '9') {
			return true;
		}
		return false;
	}

	public static void question14() {
//		Question 14 (Optional): Replace character
//		Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//		cho trước.
//		Ví dụ:
//		"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		question13();

	}
}
