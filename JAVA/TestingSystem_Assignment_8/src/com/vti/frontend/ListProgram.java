package com.vti.frontend;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.Collection.ListQues1;

public class ListProgram {
	public static void main(String[] args) {
		ListQues1 list = new ListQues1();
		System.out.println("---------- MENU -----------");
		System.out.println("1) In ra tổng số phần tử của students\n" + "2) Lấy phần tử thứ 4 của students\n"
				+ "3) In ra phần tử đầu và phần tử cuối của students\n"
				+ "4) Thêm 1 phần tử vào vị trí đầu của students\n" + "5) Thêm 1 phần tử vào vị trí cuối của students\n"
				+ "6) Đảo ngược vị trí của students\n" + "7) Tạo 1 method tìm kiếm student theo id\n"
				+ "8) Tạo 1 method tìm kiếm student theo name\n" + "9) Tạo 1 method để in ra các student có trùng tên\n"
				+ "10) Xóa name của student có id = 2;\n" + "11) Delete student có id = 5;\n"
				+ "12) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies");
		while (true) {
			System.out.println("Nhập theo Menu: ");
			int choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				list.getAmountOfStudents();
				break;
			case 2:
				list.getIndex4ofStudens();
				break;
			case 3:
				list.printFirstAndLastStudents();
				break;
			case 4:
				list.addStudentIntoFirtStudents();
				break;
			case 5:
				list.addStudentIntoLastStudents();
				break;
			case 6:
				list.reverseStudens();
				break;
			case 7:
				System.out.println("Nhập ID muốn tìm: ");
				int id = ScannerUtils.inputInt();
				list.findStudentById(id);
				break;
			case 8:
				System.out.println("Nhập Name muốn tìm: ");
				String name = ScannerUtils.inputString();
				list.findStudentByName(name);
				break;
			case 9:
				list.findDuplicateStudents();
				break;
			case 10:
				list.deleteNameOfStudentID2();
				break;
			case 11:
				list.deleteStudentById5();
				break;
			case 12:
				list.addAllStudentsToStudentCopies();
				break;
			case 13:
				System.out.println("Thoát");
				return;
			default:
				System.out.println("Nhập lại! ");
				break;
			}

		}

	}

}
