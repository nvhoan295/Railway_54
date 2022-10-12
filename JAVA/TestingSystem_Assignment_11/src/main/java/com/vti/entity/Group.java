package com.vti.entity;

public class Group {
	private int id;
	private String name;

	public Group(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Group() {
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + "]";
	}
	

}
