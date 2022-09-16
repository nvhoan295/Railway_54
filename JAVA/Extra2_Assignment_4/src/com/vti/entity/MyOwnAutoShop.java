package com.vti.entity;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan = new Sedan(200, 20000, "Red", 19);
		System.out.println("Giá sale Sedan: ");
		System.out.println(sedan.getSalePrice());
		
		Ford ford = new Ford(250, 25000, "black", 2020, 4000);
		System.out.println("Giá xe Ford");
		System.out.println(ford.getSalePrice());
		
		Struc struc = new Struc(150, 14000, "White", 2500);
		System.out.println("Giá xe Struc: ");
		System.out.println(struc.getSalePrice());
	}
}
