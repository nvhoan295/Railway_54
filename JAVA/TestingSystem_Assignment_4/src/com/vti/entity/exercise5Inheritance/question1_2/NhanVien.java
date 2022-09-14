package com.vti.entity.exercise5Inheritance.question1_2;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec;

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
		// TODO Auto-generated method stub
		super.getInfor();
		System.out.println("Công việc  :  "+ congViec);
	}

}
