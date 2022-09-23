package com.vti.entity.exercise1.question8;

import com.vti.Utils.ScannerUtils;

public class Question8 {
	public static void Test() throws HinhHocException {
		System.out.println("Tạo 4 hình chữ nhật: ");
		HinhChuNhat[] hinhChuNhats = new HinhChuNhat[4];

		for (int i = 0; i < hinhChuNhats.length; i++) {
			System.out.println("Hình " + (i + 1));
			System.out.println("Cạnh a: ");
			Float a = ScannerUtils.inputFloat();
			System.out.println("Cạnh b: ");
			Float b = ScannerUtils.inputFloat();
			HinhChuNhat hcn = new HinhChuNhat(a, b);
			hinhChuNhats[i] = hcn;
		}

		System.out.println("Tạo hình tròn số 1, nhập bán kính: ");
		float r1 = ScannerUtils.inputFloat();
		HinhTron hinhTron1 = new HinhTron(r1, r1);

		System.out.println("Tạo hình tròn số 2, nhập bán kính: ");
		float r2 = ScannerUtils.inputFloat();
		HinhTron hinhTron2 = new HinhTron(r2, r2);

	}
}
