package com.vti.frontend;

import com.vti.backend.*;
public class ProgramQLCB {
	public static void main(String[] args) {
		System.out.println("------- Menu -------");
		System.out.println("1. Thêm mới cán bộ.\n" + "2. Tìm kiếm theo họ tên.\n"
				+ "3. Hiện thị thông tin về danh sách các cán bộ.\n"
				+ "4. Nhập vào tên của cán bộ và delete cán bộ đó\n" + "5. Thoát khỏi chương trình.");
		QlcbBackend qlcb = new QlcbBackend();
		qlcb.quanLyCanBo();
	}
}
