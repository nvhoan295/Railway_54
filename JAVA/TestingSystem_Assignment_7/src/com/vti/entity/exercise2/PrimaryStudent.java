package com.vti.entity.exercise2;

public final class PrimaryStudent extends Student {
	public static int countPrimary;

	public PrimaryStudent(int id, String name) {
		super(id, name);
		countPrimary++;
	}

}
