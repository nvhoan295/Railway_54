package com.vti.entity.exercise1.question8;

public class HinhChuNhat extends HinhHoc{

	public HinhChuNhat(Float a, Float b) throws HinhHocException {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float tinhChuVi(Float a, Float b) {
		return 2*(a+b);
	}

	@Override
	public Float tinhDienTich(Float a, Float b) {
		return a * b;
	}

}
