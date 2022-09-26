package com.vti.entity;

import com.vti.Utils.ScanerUtils;

public class Position {
	private int id;
	private String name;

	public Position() {
		this.id = id;
		this.name = name;
	}

	public void input() {
		System.out.println("Nhập id:");
		id = ScanerUtils.inputInt();
		System.out.println("Nhập name: ");
		name = ScanerUtils.inputString();

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}

}
