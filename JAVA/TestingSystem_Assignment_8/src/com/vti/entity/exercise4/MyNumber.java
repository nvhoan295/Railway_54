package com.vti.entity.exercise4;

public class MyNumber<N extends Number> {
	private N number;
	
	public MyNumber(N number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MyNumber [number=" + number + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
