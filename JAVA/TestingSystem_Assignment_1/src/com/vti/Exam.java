package com.vti;

import java.time.LocalDate;

public class Exam {
	public int id;
	public String code;
	public String title;
	public CategoryQuestion[] category;
	public int duration;
	public Account creator;
	public LocalDate createDate;
	public Question[] question;
	
	
}
