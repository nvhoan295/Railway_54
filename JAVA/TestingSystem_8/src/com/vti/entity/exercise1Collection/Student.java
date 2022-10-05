package com.vti.entity.exercise1Collection;

public class Student {
	private int id;
	private String name;
	private static int count = 0;

	public Student(String name) {
		++count;
		this.id = count;
		this.name = name;
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
