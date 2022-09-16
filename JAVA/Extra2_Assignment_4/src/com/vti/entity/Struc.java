package com.vti.entity;

public class Struc extends Car {
	private int weight;

	public Struc(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		if (weight > 2000) {
			return 0.9 * getRegularPrice();
		} else {
			return 0.8 * getRegularPrice();
		}
	}

}
