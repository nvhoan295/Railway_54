package com.vti.entity.exercise1;

public class HinhHocException extends Exception {
	public HinhHocException() {
		super("Số lượng hình tối đa là: "+ Configs.SO_LUONG_HINH_TOI_DA);
	}
}
