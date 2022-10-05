package com.vti.backend.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.vti.Utils.ScannerUtils;
import com.vti.entity.Exercise1.Student;

public class SetQues4 {
	Set<Student> students;
	
	public SetQues4() {
		students = new HashSet<>();
	}
	
//	Question 4 (Optional): Set
//	Tạo 1 danh sách có chứa name của các student không trùng nhau
//	In ra set đó
	public void question4() {
		System.out.println("Nhập số lượng Sinh viên: ");
		int num45 = ScannerUtils.inputInt();
		for (int i = 0; i < num45; i++) {
			System.out.println("Nhập vào ID: ");
			int id45 = ScannerUtils.inputInt();
			System.out.println("Nhập vào Name: ");
			String name45 = ScannerUtils.inputString();
			
			
		}
		
		
		
		
		
	}
}
