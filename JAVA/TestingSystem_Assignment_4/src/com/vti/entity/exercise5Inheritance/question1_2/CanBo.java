package com.vti.entity.exercise5Inheritance.question1_2;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private GioiTinh gioitinh;
	private String diaChi;
	
	public enum GioiTinh {
		NAM, NỮ , KHÁC
	}

	public CanBo() {
	}

	public String getHoTen() {
		return hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public GioiTinh getGioitinh() {
		return gioitinh;
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

	public void setGioitinh(int gioitinh) {
		if (gioitinh == 0) {
			this.gioitinh = GioiTinh.NAM;
		} else if (gioitinh == 1) {
			this.gioitinh = GioiTinh.NỮ;
		} else {
			this.gioitinh = GioiTinh.KHÁC;
		}
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập Họ Tên: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập tuổi: ");
		tuoi = scanner.nextInt();
		System.out.print("Nhập giới tính (0. Nam, 1. Nữ, Khác");
		setGioitinh(scanner.nextInt());
		System.out.print("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();
	}
	
	public void getInfor() {
		System.out.println("Họ tên     : "+ hoTen);
		System.out.println("Tuổi       : "+ tuoi);
		System.out.println("Giới Tính  : "+ gioitinh);
		System.out.println("Địa chỉ    : "+ diaChi);
	}

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", diaChi=" + diaChi + "]";
	}
	
	
}
