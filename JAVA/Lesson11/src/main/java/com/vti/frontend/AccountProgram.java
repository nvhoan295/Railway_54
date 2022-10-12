package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;

public class AccountProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Account> accounts = new AccountController().getListAccounts();
		for (Account account : accounts) {
			System.out.println(account);
		}
	}
}
