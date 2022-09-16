package com.vti.frontend;

import com.vti.backend.BackenQLTV;

public class ProgramQLTV {
	public static void main(String[] args) {
		System.out.println("------------- MENU -------------");
		System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo.\n" + "2. Xoá tài liệu theo mã tài liệu.\n"
				+ "3. Hiện thị thông tin về tài liệu.\n" + "4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.\n"
				+ "5. Thoát khỏi chương trình.");
		BackenQLTV qltv = new BackenQLTV();
		qltv.quanlyThuVien();
	}
}
