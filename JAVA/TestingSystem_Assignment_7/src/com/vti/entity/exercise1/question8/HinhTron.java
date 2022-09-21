package com.vti.entity.exercise1.question8;

public class HinhTron extends HinhHoc{

	public HinhTron(Float a, Float b) throws HinhHocException {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float tinhChuVi(Float a, Float b) {
		return 2*a*Configs.Pi;
	}

	@Override
	public Float tinhDienTich(Float a, Float b) {
		return (float) (Configs.Pi* Math.pow(a, 2));
	}
	
	

}
