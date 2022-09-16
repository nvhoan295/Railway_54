package com.vti.entity.exercise2;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;

	public Student(int id, String name, int group) {
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}

	@Override
	public void diemDanh() {
		System.out.println(name + " Điểm danh");
	}

	@Override
	public void hocBai() {
		System.out.println(name + " Học Bài");
	}

	@Override
	public void donVeSinh() {
		System.out.println(name + " dọn vệ sinh");
	}
	
	

}
