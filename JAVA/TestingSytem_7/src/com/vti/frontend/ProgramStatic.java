package com.vti.frontend;

import com.vti.backend.Exercise1;

public class ProgramStatic {
	public static void main(String[] args) {
		Exercise1 exercise1 = new Exercise1();
		exercise1.question1();
		exercise1.question2();
		exercise1.question3();
		exercise1.question5();
		try {
			exercise1.question6();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		exercise1.question8();

	}

}
