package com.vti.entity;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien() {

	}

	public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		congViec = scanner.nextLine();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Công việc		 : " + congViec);
	}

}
