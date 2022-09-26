package com.vti.entity;

import java.util.ArrayList;

import com.vti.Utils.ScanerUtils;

public class Group {
	private int id;
	private String name;
	private ArrayList<Account> accounts;

	public Group() {
		accounts = new ArrayList<>();
		input();
		
	}

	private void input() {
		System.out.println("Nhập id: ");
		id = ScanerUtils.inputInt();
		System.out.println("Nhập tên group: ");
		name = ScanerUtils.inputString();
		confirmAccount();
		
	}

	private void confirmAccount() {
		while (true) {
			System.out.println("Bạn muốn thêm account không? 1. Có, 2. Không");
			while (true) {
				System.out.println("Nhập: ");
				int choose = ScanerUtils.inputInt();
				switch (choose) {
				case 1:
					addAccount();
					return;
				case 2:
					return;
				default:
					System.out.println("Nhập lại: ");
					break;
				}
			}
		}

	}

	private void addAccount() {
		System.out.println("Bạn muốn thêm mấy account: ");
		int choose = ScanerUtils.inputInt();
		for (int i = 0; i < choose; i++) {
			accounts.add(new Account());
		}

	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", accounts=" + accounts + "]";
	}
	
	

}
