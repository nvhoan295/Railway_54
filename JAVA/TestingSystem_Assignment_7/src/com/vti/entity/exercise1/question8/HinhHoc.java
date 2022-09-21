package com.vti.entity.exercise1.question8;

public abstract class HinhHoc {
	private Float a;
	private Float b;
	public static int count = 0;
	
	public abstract Float tinhChuVi(Float a, Float b);
	
	public abstract Float tinhDienTich(Float a, Float b);

	public HinhHoc(Float a, Float b) throws HinhHocException {
		super();
		count++;
		if (count <= Configs.SO_LUONG_HINH_TOI_DA) {
			this.a = a;
			this.b = b;
		} else {
			throw new HinhHocException();
		}
		
	}
	
	
}
