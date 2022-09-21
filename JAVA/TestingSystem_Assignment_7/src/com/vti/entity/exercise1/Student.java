package com.vti.entity.exercise1;

public class Student {
	private int id;
	private String name;
	public static int count = 0;
	public static String college;
	public static double moneyGroup;

	public Student(int id, String name) {
		count++;
		if (count > 9) {
			System.err.println("Số lượng sinh viên đã vượt quá 9. Không thêm được nữa");
		} else {
			this.id = count;
			this.name = name;
			this.college = "Đại học Bách Khoa";
		}
		
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
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	

}
