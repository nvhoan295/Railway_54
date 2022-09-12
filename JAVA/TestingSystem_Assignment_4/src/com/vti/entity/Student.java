package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private double score;

	public Student(int id, String name, String hometown) {

		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.score = 0;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void plusScore(double score) {
		this.score += score;
	}

//	e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
//	thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	@Override
	public String toString() {
		String rank = null;
		if (this.score < 4) {
			rank = "Yếu";
		} else if (this.score < 6) {
			rank = "Trung bình";
		} else if (this.score < 8) {
			rank = "Khá";
		} else {
			rank = "Giỏi";
		}

		return "Student [id: " + id + ", name: " + name + ", hometown: " + hometown + ", score: " + score + ", Xếp loại: "
				+ rank + "]";
	}

}
