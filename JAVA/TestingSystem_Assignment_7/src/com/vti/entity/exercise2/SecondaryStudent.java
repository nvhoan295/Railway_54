package com.vti.entity.exercise2;

public final class SecondaryStudent extends Student{
	public static int countSecondary;
	public SecondaryStudent(int id, String name) {
		super(id, name);
		countSecondary++;
	}

}
