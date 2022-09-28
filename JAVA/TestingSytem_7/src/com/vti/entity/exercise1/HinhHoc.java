package com.vti.entity.exercise1;

public abstract class HinhHoc {
	private static int count = 0;
	
	public HinhHoc() throws HinhHocException {
		++count;
		if (count > Configs.SO_LUONG_HINH_TOI_DA) {
			throw new HinhHocException();
		}
	}
	
	public abstract void tinhChuVi();
	public abstract void tinhDienTich();
	
}
