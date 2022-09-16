package com.vti.frontend.exercise1;

import com.vti.backend.*;

public class TuyenSinhProgram {

	public static void main(String[] args) {
		System.out.println("------ MENU -------");
		System.out.println(
							  "1. Thêm mới thí sinh.\n" 
							+ "2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.\n"
							+ "3. Tìm kiếm theo số báo danh.\n" 
							+ "4. Thoát khỏi chương trình.");
		TuyenSinhBackend tuyenSinh = new TuyenSinhBackend();
				tuyenSinh.question2();
	}
}
