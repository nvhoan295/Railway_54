package com.vti.entity.exercise2.ques2;

import java.util.Scanner;

public class Student extends Person {
	private String maSv;
	private double diemTrungBinh;
	private String email;

	public Student(String ten, String gioiTinh, int ngaySinh, String diaChi, String maSv, double diemTrungBinh,
			String email) {
		super(ten, gioiTinh, ngaySinh, diaChi);
		this.maSv = maSv;
		this.diemTrungBinh = diemTrungBinh;
		this.email = email;
	}

	@Override
	public void inputInfo() {
		super.inputInfo();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập maSv");
		maSv = input.next();
		diemTrungBinh = input.nextDouble();
		email = input.next();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Mã SV: " + maSv);
		System.out.println("Điểm trung bình : " + diemTrungBinh);
		System.out.println("Email : " + email);
	}

//	c) Viết phương thức xét xem Student có được học bổng không?
//	Điểm trung bình từ 8.0 trở lên là được học bổng

	public void hocBong() {
		if (diemTrungBinh > 8) {
			System.out.println("Sinh viên: " + getTen() + " được học bổng");
		} else {
			System.out.println("Không được học bổng");
		}
	}

}
