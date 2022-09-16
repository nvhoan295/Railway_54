package com.vti.entity;

public class Truck extends Car {
	protected double weight;

	public Truck() {
	}

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	public double getSalePrice(int weight) {
		return 0;
	}

	
	

	
}
