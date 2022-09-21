package com.vti.frontend;

import com.vti.entity.exercise1.question8.HinhHocException;
import com.vti.entity.exercise1.question8.Question8;
public class ProgaramQuestion8 {
	public static void main(String[] args) {
		try {
			Question8.Test();
		} catch (HinhHocException e) {
			System.out.println(e.getMessage());
		}
	}
}
