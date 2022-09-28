package com.vti.entity.exercise1;

public class Student {
	private int id;
	private String name;
	private static String college;
	private static int moneyGroup;
	private static int count = 0;

	public Student(String name) throws Exception {
		if (count >= 9) {
			throw new Exception("Không thể tạo quá 9 sinh viên");
		}
		this.id = ++ count;
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup += moneyGroup;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static String getCollege() {
		return college;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +  ", college=" + college + "]";
	}

}
