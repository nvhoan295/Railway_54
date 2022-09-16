package com.vti.entity.exercise2.ques2;

import java.util.Scanner;

public class Person {
	private String ten;
	private String gioiTinh;
	private int ngaySinh;
	private String diaChi;

	public Person() {
	}

	public Person(String ten, String gioiTinh, int ngaySinh, String diaChi) {
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public int getNgaySinh() {
		return ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public void setNgaySinh(int ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void inputInfo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập Tên: ");
		ten = input.nextLine();
		System.out.println("Nhập Giới Tính: ");
		gioiTinh = input.next();
		System.out.println("Nhập ngày sinh: ");
		ngaySinh = input.nextInt();
		System.out.println("Nhập địa chỉ: ");
		diaChi = input.nextLine();
	}
	
	public void showInfo() {
		System.out.println("--------------");
		System.out.println("Tên: "+ ten);
		System.out.println("Giới Tinh: "+ gioiTinh);
		System.out.println("Nam Sinh: "+ ngaySinh);
		System.out.println("Địa chỉ: "+ diaChi);
	}


}
