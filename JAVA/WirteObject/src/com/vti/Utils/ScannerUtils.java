package com.vti.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(scanner.next().trim());
			} catch (NumberFormatException e) {
				System.err.println("Nhập lại kiểu int: ");
			}
		}

	}

	public static float inputFloat() {
		while (true) {
			try {
				return Float.parseFloat(scanner.next().trim());
			} catch (NumberFormatException e) {
				System.err.println("Nhập lại kiểu float: ");
			}
		}
	}

	public static double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(scanner.next().trim());
			} catch (NumberFormatException e) {
				System.err.println("Nhập lại kiểu double: ");
			}
		}

	}

	public static String inputString() {
		while (true) {
			String input = scanner.next().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println("Nhập lại kiểu string: ");
			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt();
			if (age <= 0) {
				System.err.println("Nhập lại tuổi lớn hơn 0: ");
			} else {
				return age;
			}
		}
	}

	public static LocalDate inputLocalDate() {
		System.out.println("Nhập ngày theo định dạng yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			String localDate = scanner.nextLine().trim();
			try {
				if (format.parse(localDate) != null) {
					LocalDate lc = LocalDate.parse(localDate);
					return lc;
				}
			} catch (ParseException e) {
				System.err.println("Nhập lại: ");
			}

		}

	}

}
