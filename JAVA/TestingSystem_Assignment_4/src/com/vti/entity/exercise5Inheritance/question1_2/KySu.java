package com.vti.entity.exercise5Inheritance.question1_2;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		nganhDaoTao = scanner.nextLine();

	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Ngành đào tạo : "+ nganhDaoTao);
	}

}
