package com.vti.service;

import java.util.List;

import com.vti.entity.Account;

public interface IAccountService {

	public List<Account> getAllAccounts();

	public Account getAccountByID(int id);
}
