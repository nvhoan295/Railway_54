package com.vti.entity.exercise4;

public class Salary<T extends Number> {

	private T salary;

	public Salary(T salary) {
		this.salary = salary;
	}

	public T getSalary() {
		return salary;
	}

	public void setSalary(T salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}
	
	
}
