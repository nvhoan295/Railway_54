package com.vti.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.vti.Utils.ScannerUtils;

public class Group {
	private int id;
	private String name;
	private List<Account> accounts;
	private LocalDate createDate;

	public Group() {
		accounts = new ArrayList<>();
		input();
	}

	private void input() {
		System.out.println("Nhập ID:");
		id = ScannerUtils.inputInt("Nhập sai. Nhập ID kiểu int");
		System.out.println("Nhập Name: ");
		name = ScannerUtils.inputString("Nhập kiểu dữ liệu String. Mời nhập lại");
		confirmAddAccount();
	}

	private void confirmAddAccount() {
		System.out.println("Bạn có muốn add Account ko? 1. Có, 2. Không");
		int choose;
		while (true) {
			choose = ScannerUtils.inputInt("Nhập lại số int");
			switch (choose) {
			case 1:
				addAccount();
				return;
			case 2:
				return;
			default:
				System.out.println("chỉ nhập 1 hoặc 2. Mời nhập lại: ");
				break;
			}

		}

	}

	private void addAccount() {
		System.out.println("Nhập số lượng Account có trong group");
		int n = ScannerUtils.inputInt("Nhập 1 số kiểu int");

		for (int i = 0; i < n; i++) {
			accounts.add(new Account());
		}

	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", accounts=" + accounts + ", createDate=" + createDate + "]";
	}

}
