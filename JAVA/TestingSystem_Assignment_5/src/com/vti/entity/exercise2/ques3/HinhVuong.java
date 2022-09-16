package com.vti.entity.exercise2.ques3;

public class HinhVuong extends HinhChuNhat {

	public HinhVuong(double rong, double dai) {
		super(rong, dai);
	}

	@Override
	public void tinhDienTich() {
		System.out.println("Diện tích hình Vuông là: "+ (getDai() * getRong()));
	}

	@Override
	public void tinhChuVi() {
		System.out.println("Chu vi hình Vuông là: "+ (getDai()+ getRong())*2);
	}

	
	

}
