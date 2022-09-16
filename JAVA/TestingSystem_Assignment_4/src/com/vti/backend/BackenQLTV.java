package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vti.entity.exercise5Inheritance.QLTV.*;

public class BackenQLTV {

	private Scanner scanner;
	private List<TaiLieu> taiLieus;

	public BackenQLTV() {
		this.scanner = new Scanner(System.in);
		this.taiLieus = new ArrayList<>();
	}

	public void quanlyThuVien() {
		while (true) {
			System.out.print("Nhập theo MENU: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				addTaiLieu();
				for (TaiLieu taiLieu : taiLieus) {
					System.out.println(taiLieu);
				}
				break;
			case 2:
				delTaiLieu();
				break;
			case 3:
				thongTin();
				break;
			case 4:
				findTaiLieu();
				break;
			case 5:
				System.out.println("Thoát. Chào tạm biệt!!!!!");
				return;
			default:
				System.out.println("Sai rồi, Nhập lại");
				break;
			}
		}

	}

	public void addTaiLieu() {
		System.out.println("Thêm mới tài liêu: Sách, tạp chí, báo.");
		TaiLieu taiLieu = new TaiLieu();
		System.out.println("Bạn muốn thêm (1. Sách, 2. Tạp chí, 3. Báo");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			taiLieu = new Sach();
			break;
		case 2:
			taiLieu = new TapChi();
			break;
		case 3:
			taiLieu = new Bao();
			break;
		default:
			break;
		}
		taiLieu.input();
		taiLieus.add(taiLieu);

	}

	public void delTaiLieu() {
		System.out.println("Xoá tài liệu theo mã tài liệu");
		System.out.println("Nhập Id tài liệu muốn xoá: ");
		String idXoa = scanner.next();
		taiLieus.removeIf(t -> t.getId().equals(idXoa));
	}

	public void thongTin() {
		System.out.println("Hiện thị thông tin về tài liệu");
		for (TaiLieu taiLieu : taiLieus) {
			System.out.println(taiLieu);
		}

	}

	public void findTaiLieu() {
		System.out.println("Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");

	}
}
