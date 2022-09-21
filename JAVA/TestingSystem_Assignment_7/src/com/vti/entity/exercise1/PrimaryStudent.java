package com.vti.entity.exercise1;

public class PrimaryStudent extends Student {
	public static int countPrimary;

	public PrimaryStudent(int id, String name) {
		super(id, name);
		countPrimary++;
	}

}
