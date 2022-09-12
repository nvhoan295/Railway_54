package com.vti.entity;

public class KySu extends CanBo{
	private String nganhDaoTao;

	public KySu(String hoTen, int tuoi, GioiTinh gioitinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioitinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public String toString() {
		return "KySu [nganhDaoTao=" + nganhDaoTao + "]";
	}
	
	
	
}
