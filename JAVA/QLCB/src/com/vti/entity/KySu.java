package com.vti.entity;

import java.util.Scanner;

public class KySu extends CanBo{
//	Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
	private String nganhDaoTao;
	
	public KySu() {
	
}
	

	public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}


	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập Ngành Đào tạo của Kỹ sự: ");
		nganhDaoTao = scanner.nextLine();
	}

	@Override
	public void getInfor() {
		super.getInfor();
		System.out.println("Ngành Đào Tạo  : "+ nganhDaoTao);
	}

	
	
	
	
	
	
	
	
}
