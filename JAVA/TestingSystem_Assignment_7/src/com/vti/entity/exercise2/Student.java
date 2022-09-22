package com.vti.entity.exercise2;

import com.vti.Utils.ScannerUtils;

public class Student {
//	Tạo class Student có property id, name hãy thiết kế class Student sao
//	cho khi đã khởi tạo Student thì id là không thể thay đổi trong suốt quá
//	trình chạy chương trình chương trình

	private final int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public final static void study() {
		System.out.println("Đang học bài ......");
	}
	
	

	
}
