package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.exercise5Inheritance.QLCB.*;
import com.vti.entity.exercise5Inheritance.QLCB.CanBo.GioiTinh;

public class QlcbBackend {

	private Scanner scanner;
	private List<CanBo> canBos;
	
	public QlcbBackend() {
		this.scanner = new Scanner(System.in);
		this.canBos = new ArrayList<>();
	}

	public void quanLyCanBo() {
		// Thêm dữ liệu
		CongNhan congNhan = new CongNhan("Hoan", 23, GioiTinh.NAM, "HaNoi", 6);
		KySu kySu = new KySu("Long", 25, GioiTinh.NAM, "BacNinh", "CNTT");
		NhanVien nhanVien = new NhanVien("Mai", 24, GioiTinh.NỮ, "HungYen", "KeToan");
		canBos.add(congNhan);
		canBos.add(nhanVien);
		canBos.add(kySu);
		
		while (true) {
			System.out.println("Mời bạn nhập theo MENU: ");
			int nhap = scanner.nextInt();
			switch (nhap) {
			case 1:
				addCanBo();
				System.out.println("Số thành viên của là: " + canBos.size());
				for (CanBo canBo : canBos) {
					System.out.println(canBo);
				}
				break;
			case 2:
				findCanBo();
				break;
			case 3:
				inforCanBo();
				break;
			case 4:
				deleteCanBo();
				break;
			case 5:
				System.out.println("Thoát.. Chào tạm biệt !!!!");
				return;
			default:
				System.out.println("Nhập Sai! Thoát.");
				break;
			}
		}
	}


	// a. Them mới cán bộ
	public void addCanBo() {
		CanBo canBo = new CanBo();
		System.out.println("Bạn muốn thêm cán bộ ( 1. Công nhân, 2. Kỹ sư, 3. Nhân Viên");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			canBo = new CongNhan();
			break;
		case 2:
			canBo = new KySu();
			break;
		case 3:
			canBo = new NhanVien();
			break;
		default:
			System.out.println("Nhập sai rồi!!!");
			break;
		}
		canBo.input();
		canBos.add(canBo);
	}

	public void findCanBo() {
		System.out.println("Tìm kiếm theo tên");
		System.out.println("Nhập tên: ");
		String tenCanTim = scanner.next();
		for (CanBo canBo : canBos) {
			if (canBo.getHoTen().equals(tenCanTim)) {
				System.out.println(canBo);
			}
		}


	}

	// c, Hiện thị thông tin về danh sách các cán bộ
	public void inforCanBo() {
		System.out.println("Thông tin danh sách Cán Bộ: ");
		for (CanBo canBo : canBos) {
			canBo.getInfor();
		}
	}

//		d, Nhập vào tên của cán bộ và delete cán bộ đó
	public void deleteCanBo() {
		System.out.println("Xoá cán bộ ");
		System.out.println("Nhập tên: ");
		String hoTen = scanner.next();
		canBos.removeIf(t -> t.getHoTen().equals(hoTen));
	}

}
