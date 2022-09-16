package com.vti.entity.exercise2.ques5;

public class DienThoaiThongMinh extends DienThoaiDiDong{

	@Override
	public void tanCongKeXau() {
		// TODO Auto-generated method stub
		super.tanCongKeXau();
	}

	@Override
	public void nghe() {
		super.nghe();
		System.out.println("Điện thoại thông Minh nghe VideoCall");
	}

	@Override
	public void goi() {
		System.out.println("Điện thoại thông Minh gọi VideoCall");
	}

	@Override
	public void guiTin() {
		// TODO Auto-generated method stub
		super.guiTin();
	}

	@Override
	public void nhanTin() {
		// TODO Auto-generated method stub
		super.nhanTin();
	}

	public void sudung3g() {
		System.out.println("Sủ dụng 3g");
	}
	public void chupAnh() {
		System.out.println("Chụp Ảnh");
	}
}
