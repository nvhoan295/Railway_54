package com.vti.entity.exercise2.ques5;

import java.util.Iterator;import com.vti.entity.exercise2.IStudent;

public class Test {
	public static void main(String[] args) {
		DienThoaiDiDong[] phones = new DienThoaiDiDong[2];
		phones[0] = new DienThoaiThongMinh();
		phones[1] = new DienThoaiCoDien();
		
		for (DienThoaiDiDong phone : phones) {
			phone.goi();
			phone.nghe();
		}
		
		for (DienThoaiDiDong phone : phones) {
			if (phone instanceof DienThoaiThongMinh) {
				((DienThoaiThongMinh) phone).sudung3g();
			}
		}
		
		for (DienThoaiDiDong phone : phones) {
			if (phone instanceof DienThoaiCoDien ) {
				((DienThoaiCoDien) phone).radio();
			}
		}
		
		
		
	}
}
