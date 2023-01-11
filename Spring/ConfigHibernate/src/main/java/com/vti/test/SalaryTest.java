package com.vti.test;

import java.util.List;

import com.vti.entity.Salary;
import com.vti.repository.SalaryRepository;

public class SalaryTest {
	public static void main(String[] args) {
		SalaryRepository repository = new SalaryRepository();
		List<Salary> salaries = repository.getAllSalarys();
		
		for (Salary salary : salaries) {
			System.out.println(salary);
		}
	}
}
