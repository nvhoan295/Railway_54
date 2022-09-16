package com.vti.entity.exercise1;

import java.util.Scanner;
import com.vti.frontend.exercise1.*;

public class ThiSinh {
	protected int soBaoDanh;
	protected String hoTen;
	protected String diaChi;
	protected int mucUuTien;
	protected KhoiThi khoiThi;

	public enum KhoiThi {
		A, B, C
	}

	public int getSoBaoDanh() {
		return soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public KhoiThi getKhoiThi() {
		return khoiThi;
	}

	public void setKhoiThi(KhoiThi khoiThi) {
		this.khoiThi = khoiThi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public int getMucUuTien() {
		return mucUuTien;
	}

	public void setSoBaoDanh(int soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}


	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thêm Thông tin Thí sinh");
		System.out.println("Nhập Số Báo Danh: ");
		soBaoDanh = scanner.nextInt();
		System.out.println("Nhập Họ Tên: ");
		hoTen = scanner.next();
		System.out.println("Nhập Địa chỉ: ");
		diaChi = scanner.next();
	
		System.out.println("Nhập Khối Thi (1. A, 2. B, 3. C)");
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			khoiThi = KhoiThi.A;
			break;
		case 2:
			khoiThi = KhoiThi.B;
			break;
		case 3:
			khoiThi = KhoiThi.C;
			break;
		default:
			System.out.println("Nhập lại.....");
			break;
		}
		System.out.println("Nhập Mức Ưu Tiên: ");
		mucUuTien = scanner.nextInt();
		
	}

	@Override
	public String toString() {
		return "ThiSinh [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + ", khoiThi=" + khoiThi + "]";
	}

}
