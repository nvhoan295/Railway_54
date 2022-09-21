package com.vti.entity;

import com.vti.Utils.ScannerUtils;

public class Department {
	private int id;
	private String name;

	public Department() {
		input();
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	private void input() {
		System.out.println("Nhập id: ");
		id = ScannerUtils.inputInt("Nhập ID kiểu int: ");
		System.out.println("Nhập tên phòng ban: ");
		name = ScannerUtils.inputString("Nhập tên phòng ban: ");
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
