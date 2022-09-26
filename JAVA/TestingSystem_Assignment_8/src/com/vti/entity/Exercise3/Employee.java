package com.vti.entity.Exercise3;

import java.util.Arrays;

public class Employee<T> {
	private int id;
	private String name;
	private T[] salaries;

	public Employee(int id, String name, T[] salaries) {
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public T[] getSalaries() {
		return salaries;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalaries(T[] salaries) {
		this.salaries = salaries;
	}
	public T getSalaries1() {
		return salaries[salaries.length-1];
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaries=" + Arrays.toString(salaries) + "]";
	}
	

}
