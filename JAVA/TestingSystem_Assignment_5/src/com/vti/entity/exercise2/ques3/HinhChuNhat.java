package com.vti.entity.exercise2.ques3;

public class HinhChuNhat implements IHinhChuNhat {
	private double rong;
	private double dai;

	public HinhChuNhat(double rong, double dai) {
		this.rong = rong;
		this.dai = dai;
	}

	public double getRong() {
		return rong;
	}

	public double getDai() {
		return dai;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	@Override
	public void tinhDienTich() {
		System.out.println("Diện Tích HCN: "+dai * rong);
	}

	@Override
	public void tinhChuVi() {
		System.out.println("Chu Vi HCN: "+ (dai + rong) * 2);
	}

}
