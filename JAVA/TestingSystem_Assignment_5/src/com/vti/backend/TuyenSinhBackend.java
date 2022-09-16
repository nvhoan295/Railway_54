package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.*;
import com.vti.entity.exercise1.ITuyenSinh;
import com.vti.entity.exercise1.ThiSinh;
import com.vti.entity.exercise1.ThiSinh.KhoiThi;
public class TuyenSinhBackend implements ITuyenSinh{
	private Scanner scanner;

	private List<ThiSinh> thiSinhs;

	public TuyenSinhBackend() {
		thiSinhs = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
//	static Scanner scanner = new Scanner(System.in);
//	static List<ThiSinh> thiSinhs = new ArrayList<>();
	public void question2() {
		while (true) {
			System.out.println("Nhập theo MENU: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				themThiSinh();
				break;
			case 2:
				thongTinThiSinh();
				break;
			case 3:
				timKiem();
				break;
			case 4:
				System.out.println("Thoát");
				return;
			default:
				System.out.println("Nhập lại");
				break;
			}
		}
	}

	@Override
	public void themThiSinh() {
		System.out.println("Số thí sinh muốn nhập: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			ThiSinh thiSinh = new ThiSinh();
			thiSinh.input();
			thiSinhs.add(thiSinh);
		}		
	}
	@Override
	public void thongTinThiSinh() {
		System.out.println("Thông tin thí sinh:");
		for (ThiSinh thiSinh2 : thiSinhs) {
			System.out.println(thiSinh2.toString());
		}
	}
	@Override
	public void timKiem() {
		System.out.println("Tim Kiếm theo số báo danh. Nhập: ");
		int sbd = scanner.nextInt();
		for (ThiSinh thiSinh2 : thiSinhs) {
			if (thiSinh2.getSoBaoDanh() == sbd) {
				System.out.println(thiSinh2);
			}
		}		
	}
}