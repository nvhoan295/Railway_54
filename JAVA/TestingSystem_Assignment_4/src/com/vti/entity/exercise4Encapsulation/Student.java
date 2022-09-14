package com.vti.entity.exercise4Encapsulation;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private double score;

	public Student() {
		
	}

	public Student(String name, String hometown) {
		
		this.name = name;
		this.hometown = hometown;
		this.score = 0;
	}

	
	public void setScore(double score) {
		this.score = score;
	}
	
	public void plussScore(double score) {
		this.score += score;
	}

	@Override
	public String toString() {
		String xepLoai;
		if (score < 4) {
			xepLoai = "Yếu";
		} else if (score < 6) {
			xepLoai = "Trung Bình";
		} if (score < 8) {
			xepLoai = "Khá";
		} else {
			xepLoai = "Giỏi";
		}
		
		return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", score=" + score + " Xếp loại: "+ xepLoai + "]";
	}
	
//	Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
//	thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	
	
	
	
}
