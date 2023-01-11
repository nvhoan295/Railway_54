package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Account;
import com.vti.repository.IAccountRepository;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private IAccountRepository repository;

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
