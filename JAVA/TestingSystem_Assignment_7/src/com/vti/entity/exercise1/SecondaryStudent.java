package com.vti.entity.exercise1;

public class SecondaryStudent extends Student{
	public static int countSecondary;
	public SecondaryStudent(int id, String name) {
		super(id, name);
		countSecondary++;
	}

}
