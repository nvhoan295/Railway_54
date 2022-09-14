package com.vti.entity.exercise5Inheritance.QLTV;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tacGia;
	private int soTrang;

	public Sach() {
		super();
	}

	public Sach(String id, String tenNXB, int soLuong, String tacGia, int soTrang) {
		super(id, tenNXB, soLuong);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}

	public String getTacGia() {
		return tacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên tác giả: ");
		tacGia = scanner.next();
		System.out.println("Nhập số trang sách: ");
		soTrang = scanner.nextInt();
	}

	@Override
	public String toString() {
		return "Sach [tacGia=" + tacGia + ", soTrang=" + soTrang + ", getId()=" + getId() + ", getTenNXB()="
				+ getTenNXB() + ", getSoLuong()=" + getSoLuong() + "]";
	}

}
