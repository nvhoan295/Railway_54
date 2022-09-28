package com.vti.entity.exercise1;

public class HinhTron extends HinhHoc {
	private int r;

	public HinhTron(int r) throws HinhHocException {
		super();
		this.r = r;
	}

	@Override
	public void tinhChuVi() {
		System.out.println("Chu vi hình tròn: " + 2 * Math.PI * r);
	}

	@Override
	public void tinhDienTich() {
		System.out.println("Diện tích hình tròn: " + Math.PI * Math.pow(r, 2));
	}

	@Override
	public String toString() {
		return "HinhTron [r=" + r + "]";
	}

	
}
