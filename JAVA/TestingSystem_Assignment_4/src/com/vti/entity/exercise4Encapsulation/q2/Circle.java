package com.vti.entity.exercise4Encapsulation.q2;

public class Circle {
	private double radius;
	private String color;
	
	final double Pi = 3.14;

	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Pi * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}
