package com.vti.entity;

import com.vti.Utils.ScannerUtils;

public class Position {
	private int id;
	private String name;

	public Position() {
		input();
	}

	public Position(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void input() {
		System.out.println("Nhập id: ");
		id = ScannerUtils.inputInt("Nhập lại ID kiểu int");
		System.out.println("Nhập name: ");
		name = ScannerUtils.inputString("Nhập lại kiểu dữ liệu String");
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
	
	
}
