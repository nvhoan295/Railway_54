package com.vti.backend;

import java.util.Random;
import java.util.Scanner;

import com.vti.Utils.ScannerUtils;

public class XoSo {
	static String userName = "Nguyễn Văn Hoàn";
	static int taiKhoan = 1000;
	static Random random = new Random();
	static int[] giai7 = new int[4];
	static int[] giai6 = new int[3];
	static int[] giai5 = new int[6];
	static int[] giai4 = new int[4];
	static int[] giai3 = new int[6];
	static int[] giai2 = new int[2];
	static int giaiNhat;
	static int giaiDacBiet;
	static boolean result;
	static int soDe;
	static int soTienDanhDe;
	static int tiGiaDanhDe = 70;

	public static void Menufull() {
		System.out.println("Xin chào " + userName);
		while (true) {
			System.out.println("=============================");
			System.out.println("Tài khoản bạn có: " + taiKhoan);
			System.out.println("Mời bạn nhập vào phím chức năng \n" + "	1. Đánh đề \n" + "	2. Đánh lô \n"
					+ "	3. Cắm sổ đỏ \n" + "	4. Thoát");
			System.out.println("Nhập: ");
			int choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				danhDe();
				break;
			case 2:
				System.out.println("Đánh Lô");
				break;
			case 3:
				System.out.println("Cắm Sổ Đỏ");
				break;
			case 4:
				System.out.println("Hẹn gặp bạn lần sau");
				return;
			default:
				System.out.println("Bạn đã nhập sai, Mời bạn nhập lại");
				break;
			}
		}
	}

	public static void danhDe() {
		System.out.println("Mời bạn chọn số đề: ");
		soDe = ScannerUtils.inputInt();

		System.out.println("Nhập số tiền muốn đánh: ");
		soTienDanhDe = ScannerUtils.inputInt();

		System.out.println("Đã tới 6h, Kết quả là: ");

		randomGiai();
		printGiai();
		checkDe();
		if (result) {
			int soTienTrungDe = soDe * tiGiaDanhDe;
			taiKhoan += soTienTrungDe;
			System.out.println("Bạn vừa trúng !!!");
			System.out.println("Số tiền trúng là: " + soTienTrungDe);
			System.out.println("Tài khoản hiện tại: " + taiKhoan);
		} else {
			System.out.println("Bạn đã trượt");
			System.out.println("Số dư tài khoản còn: " + (taiKhoan -= soTienDanhDe));
		}
	}

	public static void randomGiai() {
		// random giải 7
		for (int i = 0; i < giai7.length; i++) {
			// random từ 00 --> 99
			giai7[i] = random.nextInt(100);
		}
		// random giải 6
		for (int i = 0; i < giai6.length; i++) {
			// random từ 00 --> 999
			giai6[i] = random.nextInt(1000);
		}
		// random giải 5
		for (int i = 0; i < giai5.length; i++) {
			// random từ 00 --> 999
			giai5[i] = random.nextInt(10000);
		}
		// random giải 4
		for (int i = 0; i < giai4.length; i++) {
			// random từ 00 --> 999
			giai4[i] = random.nextInt(10000);
		}
		// random giải 3
		for (int i = 0; i < giai3.length; i++) {
			// random từ 00 --> 9999
			giai3[i] = random.nextInt(100000);
		}
		// random giải 2
		for (int i = 0; i < giai2.length; i++) {
			// random từ 00 --> 9999
			giai2[i] = random.nextInt(100000);
		}

		// random giải nhât

		// random từ 00 --> 9999
		giaiNhat = random.nextInt(100000);

		// random giải nhât

		// random từ 00 --> 9999
		giaiDacBiet = random.nextInt(100000);

	}

	public static void printGiai() {
		System.out.printf("Giải Đặc Biệt %30S %n", String.format("%05d", giaiDacBiet));

		System.out.printf("Giải Nhất %34S %n", String.format("%05d", giaiNhat));

		System.out.printf("Giải 2 %24S", String.format("%05d", giai2[0]));
		System.out.printf("%30S%n", String.format("%05d", giai2[1]));

		System.out.printf("Giải 3 %18S ", String.format("%05d", giai3[0]));
		System.out.printf("%20S ", String.format("%05d", giai3[1]));
		System.out.printf("%20S%n", String.format("%05d", giai3[2]));
		System.out.printf("%25S ", String.format("%05d", giai3[3]));
		System.out.printf("%20S ", String.format("%05d", giai3[4]));
		System.out.printf("%20S %n", String.format("%05d", giai3[5]));

		System.out.printf("Giải 4 %26S", String.format("%04d", giai4[0]));
		System.out.printf("%24S %n", String.format("%04d", giai4[1]));
		System.out.printf("%33S", String.format("%04d", giai4[1]));
		System.out.printf("%24S %n", String.format("%04d", giai4[1]));

		System.out.printf("Giải 5 %19S", String.format("%04d", giai5[0]));
		System.out.printf("%20S", String.format("%04d", giai5[1]));
		System.out.printf("%20S%n", String.format("%04d", giai5[2]));
		System.out.printf("%26S", String.format("%04d", giai5[3]));
		System.out.printf("%20S", String.format("%04d", giai5[4]));
		System.out.printf("%20S%n", String.format("%04d", giai5[5]));

		System.out.printf("Giải 6 %20S %20S %20S%n", String.format("%03d", giai6[0]), String.format("%03d", giai6[1]),
				String.format("%03d", giai6[2]));

		System.out.printf("Giải 7 %14S", String.format("%02d", giai7[0]));
		System.out.printf("%16S", String.format("%02d", giai7[1]));
		System.out.printf("%16S", String.format("%02d", giai7[2]));
		System.out.printf("%16S%n", String.format("%02d", giai7[3]));

	}

	public static void checkDe() {
		// Check Giải Đặc biệt
		// Tách 2 số giải Đặc biệt
		int haiSoCuoi = giaiDacBiet % 100;
		System.out.println("Đề về: " + haiSoCuoi);
		if (soDe == haiSoCuoi) {
			result = true;
		} else {
			result = false;
		}

	}
}
