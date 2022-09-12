package com.vti.entity;

public class CongNhan extends CanBo{
	

	private int bac;

	public CongNhan(String hoTen, int tuoi, GioiTinh gioitinh, String diaChi, int bac) {
		super(hoTen, tuoi, gioitinh, diaChi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	
	@Override
	public String toString() {
		return "Công nhân: Tên: "+getHoTen() + ", Tuoi: " + getTuoi()+ ", Quê Quán: "+ getDiaChi()+ ", Giới Tính: "+ getGioitinh()+ ", Bậc: "+ getBac();
	}
	
	
	
	
	
}
