package com.vti.entity.exercise1;

public class PrimaryStudent extends Student{
	
	private static int countPrim = 0;
	public PrimaryStudent(String name) throws Exception {
		super(name);
		countPrim++;
	}
	public static int getCountPrim() {
		return countPrim;
	}
	public static void setCountPrim(int countPrim) {
		PrimaryStudent.countPrim = countPrim;
	}
	@Override
	public String toString() {
		return "PrimaryStudent [toString()=" + super.toString() + "]";
	}

	
	
	
}
