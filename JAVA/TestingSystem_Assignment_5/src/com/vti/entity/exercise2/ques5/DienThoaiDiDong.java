package com.vti.entity.exercise2.ques5;

public abstract class DienThoaiDiDong implements IDienThoai, IVuKhi {

	@Override
	public void tanCongKeXau() {
		System.out.println("Tấn Công kẻ xấu");
	}

	@Override
	public void nghe() {
		System.out.println("Nghe điện thoại");
	}

	@Override
	public void goi() {
		System.out.println("Gọi điện thoại");
	}

	@Override
	public void guiTin() {
		System.out.println("Gửi tin nhắn");
	}

	@Override
	public void nhanTin() {
		System.out.println("Nhận tin nhắn ");
	}

	
	
}
