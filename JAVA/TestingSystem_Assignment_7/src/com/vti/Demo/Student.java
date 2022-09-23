package com.vti.Demo;

import java.io.Serializable;

import com.vti.Utils.ScannerUtils;

public class Student implements Serializable {
	private int id;
	private String name;
	
	public Student() {
	}

	public void input() {
		System.out.println("Nhập ID: ");
		id = ScannerUtils.inputInt();
		System.out.println("Nhập Name: ");
		name = ScannerUtils.inputString();
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
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
