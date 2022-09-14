package com.vti.entity;

import java.util.Scanner;

public class CanBo {
//	Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
//	Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ,
//	khác), địa chỉ.
	private String hoTen;
	private int tuoi;
	private GioiTinh gioiTinh;
	private String diaChi;

	public enum GioiTinh {
		NAM, NỮ, KHÁC
	}
	
	
	
	public CanBo() {
		
	}
	
	public CanBo(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}


	public String getHoTen() {
		return hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public GioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setGioiTinh(int gioiTinh) {
		if (gioiTinh == 0) {
			this.gioiTinh = GioiTinh.NAM;
		} else if (gioiTinh == 1) {
			this.gioiTinh = GioiTinh.NỮ;
		} else {
			this.gioiTinh = GioiTinh.KHÁC;
		}
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		hoTen = scanner.next();
		System.out.println("Nhập Tuổi: ");
		tuoi = scanner.nextInt();
		System.out.println("Nhập Giới Tính (0. Nam , 1. Nữ, Khác ");
		setGioiTinh(scanner.nextInt());
		System.out.println("Nhập địa chỉ: ");
		diaChi = scanner.next();
	}

	public void getInfor() {
		System.out.println("Họ Tên   		: " + hoTen);
		System.out.println("Tuổi			: " + tuoi);
		System.out.println("Giới Tính		: " + gioiTinh);
		System.out.println("Địa chỉ			: " + diaChi);

	}

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}

	
}
