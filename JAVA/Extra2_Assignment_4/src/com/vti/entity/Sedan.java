package com.vti.entity;

public class Sedan extends Car{
	private int lenght;

	public Sedan(int speed, double regularPrice, String color, int lenght) {
		super(speed, regularPrice, color);
		this.lenght = lenght;
	}

	@Override
	public double getSalePrice() {
		if (lenght > 20) {
			return 0.95 * getRegularPrice();
		} else {
			return 0.9 * getRegularPrice();
		}
	}
	
	
	
}
