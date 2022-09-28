package com.vti.frontend;

import com.vti.backend.Exercise5;

public class ProgramExercise5 {
	public static void main(String[] args) {
		Exercise5 exercise5 = new Exercise5();
		try {
			exercise5.question1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
