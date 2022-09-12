package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.CanBo.GioiTinh;
import com.vti.entity.CongNhan;

public class Exercise5 {
	static Scanner sc = new Scanner(System.in);
	static int input;
	public static void question2() {
		System.out.println("Menu Chương trình: ");
		System.out.println("1. Thêm mới can bộ \n" + "2. Tìm kiếm theo họ tên \n"
				+ "3. Hiện thị thông tin về danh sách các cán bộ \n"
				+ "4. Nhập vào tên của cán bộ và delete cán bộ đó \n" + "5. Thoát khỏi chương trình \n");
		while (true) {
			System.out.print("Mời bạn nhập: ");
			input = sc.nextInt();
			switch (input) {
			case 1:
				themMoi();
				break;
			case 2:
				timKiem();
				break;
			case 3:
				hienThongTin();
				break;
			case 4:
				xoaTen();
				break;
			case 5:
				System.out.println("Thoát. Hẹn gặp lại các bạn !!!!!!");
				return;
			default:
				System.out.println("Sai rồi. Mời bạn nhập lại.....");
				break;
			}
		}

	}

	public static void themMoi() {
		System.out.println("Thêm mới cán bộ \n"
				+ "MENU: ");
		System.out.println("1. Công nhân \n"
				+ "2. Kỹ sư \n"
				+ "3. Nhân viên \n");
		System.out.print("Nhập: ");
		int choose1 = sc.nextInt();
		switch (choose1) {
		case 1:
			System.out.println("Công nhân");
			CongNhan cn = new CongNhan(null, 0, null, null, 0);
			System.out.print("Nhập họ tên: ");
			cn.setHoTen(sc.next());
			System.out.print("Nhập tuổi: ");
			cn.setTuoi(sc.nextInt());
			System.out.print("Nhập Địa chỉ: ");
			cn.setDiaChi(sc.next());
			System.out.println("Nhập bâc: ");
			cn.setBac(sc.nextInt());
			System.out.println("Nhập Giới tính:"
					+ "1. Name, 2. Nữ ");
			int choose2 = sc.nextInt();
				switch (choose2) {
				case 1:
					cn.setGioitinh(GioiTinh.NAM);
					break;
				case 2:
					cn.setGioitinh(GioiTinh.NỮ);
					break;
				default:
					cn.setGioitinh(GioiTinh.KHÁC);
					break;
				}
				System.out.println(cn.toString());
			break;

		default:
			break;
		}
	}

	public static void timKiem() {
		System.out.println("2. Tìm kiếm theo họ tên ");
	}

	public static void hienThongTin() {
		System.out.println("3. Hiện thị thông tin về danh sách các cán bộ ");
	}

	public static void xoaTen() {
		System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó ");
	}

}
