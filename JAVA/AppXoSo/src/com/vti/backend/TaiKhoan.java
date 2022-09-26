package com.vti.backend;

import java.util.ArrayList;

import com.vti.Utils.ScannerUtils;
import com.vti.entity.Account;

public class TaiKhoan {
	static ArrayList<Account> accounts = new ArrayList<>();

	public static void main(String[] args) {
		signIn();
	}

	public static void accCoSan() {
		accounts.add(new Account("hoan", "123456"));
		accounts.add(new Account("thao", "123456"));
		accounts.add(new Account("thang", "123456"));
		accounts.add(new Account("nam", "123456"));
		accounts.add(new Account("dat", "123456"));
	}
	
	public static void signIn() {
		accCoSan();
		System.out.println("---- Signin ----");
		System.out.println("Nhập userName: ");
		String userName = ScannerUtils.inputString();
		System.out.println("Nhập password: ");
		String passWord = ScannerUtils.inputString();

		
		try {
			for (Account account : accounts) {
				if (account.getUserName().equals(userName) && account.getPassword("abc").equals(passWord)) {
					System.out.println("--- Đăng nhập thành công ----");
					
					XoSo.Menufull();
				}
			}
		} finally {
			System.out.println("Sai rồi");
		}
	}
	
	
	
}
