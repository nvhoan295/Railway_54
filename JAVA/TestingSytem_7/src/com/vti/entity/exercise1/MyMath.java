package com.vti.entity.exercise1;

public class MyMath {
	private int a;
	private int b;

	public MyMath(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static int min(int a, int b) {
		if(a > b) {
			return b;
		} else {
			return a;
		}
	}

}
