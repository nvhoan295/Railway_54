package com.vti.backend;

import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.entity.exercise1.*;

public class Exercise1 {
	List<Student> students;

	public Exercise1() {
		this.students = new ArrayList<>();
		try {
			input();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void input() throws Exception {
		students.add(new Student("Nguyễn Văn A"));
		students.add(new Student("Nguyễn Văn B"));
		students.add(new Student("Nguyễn Văn C"));
	}

	public void printStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void question1() {
		printStudent();
		Student.setCollege("Đại học bách khoa");
		;
		printStudent();

	}

//	Question 2: tiếp tục question 1
//	Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ
//	lớp - dùng chung cho tất cả các student).
//	Hãy viết chương trình main() để mô tả các bước sau:
//	B1: Các Student sẽ nộp quỹ, mỗi Student 100k
//	B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
//	B3: Student thứ 2 lấy 20k đi mua bánh mì
//	B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
//	B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
//	In ra số tiền còn của nhóm tại mỗi bước
	public void question2() {
//		B1: Các Student sẽ nộp quỹ, mỗi Student 100k
		Student.setMoneyGroup(300);
		System.out.println("Sau khi đóng quỹ: " + Student.getMoneyGroup());
//		B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
		Student.setMoneyGroup(-50);
		System.out.println("Quỹ sau kh mua bim bim 50: " + Student.getMoneyGroup());
//		B3: Student thứ 2 lấy 20k đi mua bánh mì
		Student.setMoneyGroup(-20);
		System.out.println("Quỹ sau kh mua bim bim 20: " + Student.getMoneyGroup());
//		B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
		Student.setMoneyGroup(-150);
		System.out.println("Quỹ sau kh đồ dùng: " + Student.getMoneyGroup());
//		B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
		Student.setMoneyGroup(150);
		System.out.println("Quỹ sau đóng 150: " + Student.getMoneyGroup());

	}

	public void question3() {
		System.out.println("Nhỏ nhất: " + MyMath.min(3, 5));
		System.out.println("Lớn nhất: " + MyMath.max(3, 5));
	}

//	Question 5:
//		Hãy viết chương trình đếm số Student được sinh ra (tham khảo code
//		trên google)
	public void question5() {
		System.out.println("Số sinh viên được tạo là: " + Student.getCount());
	}

//	Question 6: tiếp tục Question 5
//	Tạo class PrimaryStudent, SecondaryStudent, hãy viết chương trình
//	đếm số lượng PrimaryStudent được sinh ra, SecondaryStudent được
//	sinh ra.
//	Viết chương trình demo.
//	Khởi tạo 6 Student, trong đó có 2 PrimaryStudent và 4
//	SecondaryStudent, sau đó in ra số lượng Student,
//	PrimaryStudent, SecondaryStudent được sinh ra.
	public void question6() throws Exception {
		students.add(new PrimaryStudent("Hoàn"));
		students.add(new PrimaryStudent("Thảo"));
		students.add(new SecondaryStudent("Điệp"));
		students.add(new SecondaryStudent("Cường"));
		students.add(new SecondaryStudent("Phát"));
		students.add(new SecondaryStudent("Long"));
		System.out.println("Số sinh viên được tạo là: " + Student.getCount());
		System.out.println("Số sinh viên primary được tạo là: " + PrimaryStudent.getCountPrim());
		System.out.println("Số sinh viên second được tạo là: " + SecondaryStudent.getCountSecon());
		try {
			students.add(new Student("Quá"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printStudent();
	}

	public void question8() {
		List<HinhHoc> hinhHocs = new ArrayList<>();
		System.out.println("Nhập 4 hình chữ nhật");
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Nhập hình" + (i + 1));
				System.out.print("Cạnh a:");
				int a = ScannerUtils.inputInt();
				System.out.print("Cạnh b: ");
				int b = ScannerUtils.inputInt();
				hinhHocs.add(new HinhChuNhat(a, b));
			}
			System.out.println("Thêm hình tròn: ");
			System.out.println("r1: ");
			int r1 = ScannerUtils.inputInt();
			hinhHocs.add(new HinhTron(r1));
			System.out.println("r2: ");
			int r2 = ScannerUtils.inputInt();
			hinhHocs.add(new HinhTron(r2));
		} catch (HinhHocException e) {
			System.out.println(e.getMessage());
		}
		for (HinhHoc hinhHoc : hinhHocs) {
			System.out.println(hinhHoc);
		}

	}

}
