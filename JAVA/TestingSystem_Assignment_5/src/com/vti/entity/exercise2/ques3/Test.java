package com.vti.entity.exercise2.ques3;

public class Test {
	public static void main(String[] args) {
		HinhChuNhat[] hinhs = new HinhChuNhat[4];
		hinhs[0] = new HinhChuNhat(3, 4);
		hinhs[1] = new HinhChuNhat(5, 6);

		hinhs[2] = new HinhVuong(3, 3);
		hinhs[3] = new HinhVuong(5, 5);

		for (HinhChuNhat H : hinhs) {
			if (H instanceof HinhVuong) {
				((HinhVuong) H).tinhDienTich();
			}
		}
		
		for (HinhChuNhat hinhChuNhat : hinhs) {
			hinhChuNhat.tinhDienTich();
		}
		
		
		
		
		
		
		
		
	}

}
