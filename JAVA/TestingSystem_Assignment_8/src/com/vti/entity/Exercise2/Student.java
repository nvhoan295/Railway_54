package com.vti.entity.Exercise2;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	private static int counter = 0;
	private int id;
	private String name;
	private LocalDate birthday;
	private int score;

	public Student(String name, LocalDate birthday, int score) {
		this.id = ++counter;
		this.name = name;
		this.birthday = birthday;
		this.score = score;
	}

	public static int getCounter() {
		return counter;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public int getScore() {
		return score;
	}

	public static void setCounter(int counter) {
		Student.counter = counter;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student student) {
		if (name.compareTo(student.name) > 0) {
			return 1;
		}
		if (name.compareTo(student.name)< 0) {
			return -1;
		}
		return 0;
	}

}
