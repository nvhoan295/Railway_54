package exercise;

import java.time.LocalDate;

public class Exam {
	public int id;
	public String code;
	public String title;
	public CategoryQuestion[] category;
	public int duration;
	public Account creatorID;
	public LocalDate createDate;
	public Question[] questions;

	
	public Exam() {
	}

	public Exam(int id, String code, String title, int duration, Account creatorID,
			LocalDate createDate) {
		this.id = id;
		this.code = code;
		this.title = title;
		this.duration = duration;
		this.creatorID = creatorID;
		this.createDate = createDate;
	}

}
