package com.vti.frontend.exercise1;

import java.util.Scanner;

import com.vti.backend.StudentBackend;

public class StudentProgram {
	public static void main(String[] args) {
		System.out.println("------ MENU ---------");
		System.out.println("1) Kêu gọi cả lớp điểm danh.\n" + "2) Gọi nhóm 1 đi học bài\n"
				+ "3) Gọi nhóm 2 đi dọn vệ sinh\n" + "4) Thoát");

		while (true) {
			StudentBackend.Test();
			System.out.println("Chọn chức năng: ");
			Scanner scanner = new Scanner(System.in);
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				StudentBackend.diemDanh();
				break;
			case 2:
				StudentBackend.hocBai();
				break;
			case 3:
				StudentBackend.donVeSinh();
				break;
			case 4:
				System.err.println("Thoát");
				return;
			default:
				System.err.println("Nhập lại");
				break;
			}

		}
	}
}
