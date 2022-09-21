package com.vti.entity.exercise1.question8;

public class HinhHocException extends Exception{
	public HinhHocException() {
		super("Số hình đã tạo vượt quá số lượng cho phép: "+ Configs.SO_LUONG_HINH_TOI_DA + " Hãy kiểm tra lại");
	}
}
