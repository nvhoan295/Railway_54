package com.vti.Utils;

import java.util.Scanner;

public class ScanerUtils {
	private static Scanner scanner = new Scanner(System.in);

	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(scanner.next().trim());
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai. Nhập lại kiểu int: ");
			}
		}
	}

	public static Float inputFloat() {
		while (true) {
			try {
				return Float.parseFloat(scanner.next().trim());
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai. Nhập lại kiểu float");
			}
		}
	}

	public static Double inputDouble() {
		while (true) {
			try {
				return Double.parseDouble(scanner.next().trim());
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai. Nhập lại kiểu Double ");
			}
		}
	}

	public static String inputString() {

		while (true) {
			String input = scanner.next().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.out.println("Nhập lại:");
			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt();
			if (age >= 0) {
				return age;
			} else {
				System.out.println("Nhập sai. Nhập lại tuổi lớn hơn 0");
			}
		}
	}

}
