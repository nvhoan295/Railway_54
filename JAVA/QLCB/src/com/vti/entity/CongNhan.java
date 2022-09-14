package com.vti.entity;

import java.util.Scanner;

public class CongNhan extends CanBo {
//	Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).

	private int bac;

	public int getBac() {
		return bac;
	}

	public CongNhan() {

	}

	public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập Bậc: ");
		bac = scanner.nextInt();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Bậc 			: " + bac);
	}

}
