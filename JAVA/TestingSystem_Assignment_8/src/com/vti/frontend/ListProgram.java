package com.vti.frontend;

import com.vti.backend.Collection.ListQues1;

public class ListProgram {
	public static void main(String[] args) {
		ListQues1 list = new ListQues1();
		list.getAmountOfStudents();
		list.getIndex4ofStudens();
		list.printFirstAndLastStudents();
		list.addStudentIntoFirtStudents();
		list.addStudentIntoLastStudents();
		list.reverseStudens();
		System.out.println("Phần tử có id = 3: ");
		list.findStudentById(3);
		System.out.println("Phần tử có name = Thao");
		list.findStudentByName("Thao");
		list.findDuplicateStudents();
		list.deleteNameOfStudentID2();
		list.deleteStudentById5();
		list.addAllStudentsToStudentCopies();
		
	}
}
