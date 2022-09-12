package com.vti.entity;

public class Department {
	private int id;
	private String name;

	public Department() {
		
	}

	public Department(int id, String name) {
		
		this.id = 0;
		this.name = name;
	}
	
	public static void question1() {
		Department dep = new Department();
		Department dep1 = new Department(0, "Dep1");
	}
}
