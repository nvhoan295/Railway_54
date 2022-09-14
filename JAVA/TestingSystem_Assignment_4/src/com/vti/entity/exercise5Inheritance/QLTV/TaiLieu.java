package com.vti.entity.exercise5Inheritance.QLTV;

import java.util.Scanner;

public class TaiLieu {
	private String id;
	private String tenNXB;
	private int soLuong;

	public TaiLieu() {
		
	}
	public TaiLieu(String id, String tenNXB, int soLuong) {
		this.id = id;
		this.tenNXB = tenNXB;
		this.soLuong = soLuong;
	}
	public String getId() {
		return id;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập id: ");
		id = scanner.next();
		System.out.println("Nhập tên NXB: ");
		tenNXB = scanner.next();
		System.out.println("Nhập Số Lượng phát hành: ");
		soLuong = scanner.nextInt();
	}
	
	@Override
	public String toString() {
		return "TaiLieu [id=" + id + ", tenNXB=" + tenNXB + ", soLuong=" + soLuong + "]";
	}

}
