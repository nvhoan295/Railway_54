package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;

public class AccountProgram {
	private static AccountController controller;

	public static void main(String[] args) throws Exception {
		controller = new AccountController();
		while (true) {
			Menu();
			int choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				getListAccount();
				break;
			case 2:
				getAccountById();
				break;
			case 3:
				createAccount();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			default:
				System.out.println("Thoát. Tạm Biệt");
				return;
			}
		}

	}

	public static void Menu() {
		System.out.println("============MENU===========");
		System.out.println("=|1. Get list account    |=");
		System.out.println("=|2. Get account by id   |=");
		System.out.println("=|3. Create account      |=");
		System.out.println("=|4. Update account      |=");
		System.out.println("=|5. Delete account      |=");
		System.out.println("=|6. Exit                |=");
		System.out.print("Mời bạn chọn: ");
	}

	public static void getListAccount() throws ClassNotFoundException, SQLException {
		List<Account> accounts = controller.getListAccounts();
		for (Account account : accounts) {
			System.out.println(account);
		}
	}

	public static void getAccountById() throws Exception {
		System.out.println("Nhập Id: ");
		int id = ScannerUtils.inputInt();
		Account account = controller.getAccountByID(id);
		System.out.println(account);
	}

	public static void createAccount() throws ClassNotFoundException, SQLException {
		System.out.println("Nhập email: ");
		String email = ScannerUtils.inputString("Nhập kiểu String");
		System.out.println("Nhập username: ");
		String userName = ScannerUtils.inputString("Nhập kiểu String");
		System.out.println("Nhập Full Name: ");
		String fullName = ScannerUtils.inputString("Nhập kiểu String");
		controller.createAccount(email, userName, fullName);
	}

	public static void update() throws ClassNotFoundException, SQLException {
		System.out.println("Nhập Id: ");
		int id = ScannerUtils.inputId();
		System.out.println("Nhập Tên Mới: ");
		String newName = ScannerUtils.inputName();
		controller.updateAccountByID(id, newName);
	}

	public static void delete() throws ClassNotFoundException, SQLException {
		System.out.println("Nhập Id muốn xoá: ");
		int id = ScannerUtils.inputId();
		controller.deleteAccount(id);
	}

}
