package frontend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Bao;
import entity.Sach;
import entity.TaiLieu;
import entity.TapChi;

public class Program {
	static List<TaiLieu> taiLieus = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("----- MENU -------");
			System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo.\n" + "2. Xoá tài liệu theo mã tài liệu.\n"
					+ "3. Hiện thị thông tin về tài liệu.\n" + "4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.\n"
					+ "5. Thoát khỏi chương trình.");

			System.out.print("Nhập: ");
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

	public static void addTaiLieu() {
		System.out.println("add");
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

	public static void delTaiLieu() {
		System.out.println("Xoá");
	}

	public static void thongTin() {
		System.out.println("Hiện thị thông tin về tài liệu");
		for (TaiLieu taiLieu : taiLieus) {
			System.out.println(taiLieu);
		}

	}

	public static void findTaiLieu() {
		System.out.println("Tìm kiếm");
	}
}
