package com.vti.entity.exercise1;

public class HinhChuNhat extends HinhHoc {
	private int a;
	private int b;
	
	public HinhChuNhat(int a, int b) throws HinhHocException {
		super();
		this.a = a;
		this.b = b;
	}


	@Override
	public void tinhChuVi() {
		System.out.println("Chu Vi hình chữ nhật là: "+ 2*(a+b));
	}


	@Override
	public void tinhDienTich() {
		System.out.println("Diện tích hình chữ nhật là: "+ a*b);
	}


	@Override
	public String toString() {
		return "HinhChuNhat [a=" + a + ", b=" + b + "]";
	}

	
}
