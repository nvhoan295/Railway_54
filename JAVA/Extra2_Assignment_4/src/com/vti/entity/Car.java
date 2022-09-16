package com.vti.entity;

public abstract class Car {
	private int speed;
	protected double regularPrice;
	private String color;

	public Car() {

	}

	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}


	public abstract double getSalePrice(int weight);

}
