package com.vti.frontend;

import com.vti.backend.Collection.Generic;
import com.vti.entity.Exercise3.Student;

public class GenericProgram {
	public static void main(String[] args) {
		Generic generic = new Generic();
		
		generic.question1();
		
		generic.question2("Nguyễn Văn Hoàn");
		generic.question2(new Student<Integer>(1, "Hoàn"));
		generic.question2(4.0f);
		generic.question2(4.0d);
		
		generic.question4();
		
		generic.question5();
		generic.question6();
		
		
		
		
		
		
		
		
	}
}
