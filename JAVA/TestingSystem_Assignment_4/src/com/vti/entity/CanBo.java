package com.vti.entity;

public class CanBo {
	private String hoTen;
	private int tuoi;
	private GioiTinh gioitinh;
	private String diaChi;
	
	public enum GioiTinh {
		NAM, NỮ, KHÁC
	}

	public CanBo(String hoTen, int tuoi, GioiTinh gioitinh, String diaChi) {
		
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diaChi = diaChi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public GioiTinh getGioitinh() {
		return gioitinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setGioitinh(GioiTinh gioitinh) {
		this.gioitinh = gioitinh;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", diaChi=" + diaChi + "]";
	}
	
	
}
