package com.vti.entity;

public class Account2 {
	private int id;
	private String name;
	private int balance;

	public Account2(int id, String name, int balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	
	@Override
	public String toString() {
		return "Account2 [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public int credit(int amount) {
		return this.balance += amount;
	}
	
	public int debit(int amount) {
		return this.balance -= amount;
	}
	
	public void tranferToAccount(Account2 acc, int amount) {
		this.balance -= amount;
		acc.balance += amount;
	}
	
}
