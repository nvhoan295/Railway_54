package com.vti.entity.Exercise1;

import com.vti.Utils.ScannerUtils;

public class Student {
	private int id;
	private String name;
	public static int count = 1;

	
	public Student() {
	}

	public Student(String name) {
		
		this.id = count;
		this.name = name;
		count++;
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
	
	public void input() {
		id = count;
		System.out.println("Nhập name: ");
		name = ScannerUtils.inputString();
		count++;
	}

	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + "]";
	}

	
}
