package com.vti.Utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class is ScannerUtils
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Oct 14, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Oct 14, 2022
 */
public class ScannerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputId() {
		while (true) {
			int id = inputInt("Please input a id as int, please input again.");
			if (id > 0) {
				return id;
			}

			System.out.println("Please input a id as int which must be greater than > 0, please input again.");
		}
	}

	public static int inputInt() {
		return inputInt("Please input a number as int, please input again");
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputString() {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println("Nhập lại: ");
			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");

			if (age <= 0) {
				System.err.println("Wrong inputing! The age must be greater than 0, please input again.");

			} else {
				return age;
			}
		}
	}

	public static int inputAgeGreaterThan18() {
		while (true) {
			int age = inputAge();

			if (age >= 18) {
				return age;

			} else {
				System.out.println("Wrong inputing! The age must be greater than 18, please input again.");
			}
		}
	}

	public static LocalDate inputLocalDate() {
		System.out.println("Nhập theo định dạng yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			String localdate = scanner.next().trim();
			try {
				if (format.parse(localdate) != null) {
					LocalDate lc = LocalDate.parse(localdate);
					return lc;
				}
			} catch (Exception e) {
				System.err.println("Nhập lại:");
			}
		}
	}

	/**
	 * This method is inputEmail
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 15, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 15, 2022
	 * @return
	 */
	public static String inputEmail() {
		while (true) {

			String email = ScannerUtils.inputString();
			String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
			Pattern p = Pattern.compile(ePattern);
			Matcher m = p.matcher(email);
			boolean isEmail = m.matches();

			if (!isEmail) {
				System.out.print("Nhập lại: ");
			} else {
				return email;
			}
		}
	}

	/**
	 * This method is FullName
	 * 
	 * @Description: .
	 * @author: HoanNV
	 * @create_date: Oct 19, 2022
	 * @version: 1.0
	 * @modifer: HoanNV
	 * @modifer_date: Oct 19, 2022
	 * @return
	 */
	public static String inputFullName() {
		while (true) {

			String fullName = ScannerUtils.inputString();
			String ePattern = "^[a-zA-Z\\s]*$";
			Pattern p = Pattern.compile(ePattern);
			Matcher m = p.matcher(fullName);
			boolean isFullName = m.matches();
			if (!isFullName) {
				System.out.print("Nhập lại: ");
			} else {
				return fullName;
			}
		}
	}

	public static int inputFunction(int a, int b, String errorMessage) {
		while (true) {
			int number = ScannerUtils.inputInt();
			if (number >= a && number <= b) {
				return number;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputPassword() {
		while (true) {
			String password = ScannerUtils.inputString();
			if (password.length() < 6 || password.length() > 12) {
				System.out.print("Nhập lại: ");
				continue;
			}
			boolean hasAtLeast1Character = false;
			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i)) == true) {
					hasAtLeast1Character = true;
					break;
				}
			}
			if (hasAtLeast1Character == true) {
				return password;
			} else {
				System.out.print("Mời bạn nhập lại password: ");
			}
		}
	}

	public static String inputPhoneNumber() {
		while (true) {
			String number = ScannerUtils.inputString();

			if (number.length() > 12 || number.length() < 9) {
				continue;
			}
			if (number.charAt(0) != '0') {
				continue;
			}
			boolean isNumber = true;
			for (int i = 0; i < number.length(); i++) {
				if (Character.isDigit(number.charAt(i)) == false) {
					isNumber = false;
					break;
				}
			}
			if (isNumber == true) {
				return number;
			} else {
				System.out.print("Nhập lại: ");
			}
		}
	}
}
