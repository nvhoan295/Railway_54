package com.vti.entity.exercise1;

public class SecondaryStudent extends Student{
	private static int countSecon = 0;
	
	public SecondaryStudent(String name) throws Exception {
		super(name);
		countSecon++;
	}

	public static int getCountSecon() {
		return countSecon;
	}

	public static void setCountSecon(int countSecon) {
		SecondaryStudent.countSecon = countSecon;
	}

	@Override
	public String toString() {
		return "SecondaryStudent [toString()=" + super.toString() + "]";
	}


	
}
