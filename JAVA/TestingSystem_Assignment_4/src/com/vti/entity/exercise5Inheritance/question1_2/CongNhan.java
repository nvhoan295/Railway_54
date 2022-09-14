package com.vti.entity.exercise5Inheritance.question1_2;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;

	public int getBac() {
		return bac;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập bậc của công nhân: ");
		bac = scanner.nextInt();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Bậc     :" + bac);

	}

}
