package com.vti.entity.exercise2;

import com.vti.Utils.ScannerUtils;

public class Question1 {
	public static void main(String[] args) {
		System.out.println("Nhập a: ");
		int a = ScannerUtils.inputInt("Nhập kiểu int");
		System.out.println("Tổng của Pi và a là: " + MyMath.sum(a));

	}
}
