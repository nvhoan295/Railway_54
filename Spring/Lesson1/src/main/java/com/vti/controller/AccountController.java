package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Account;
import com.vti.service.IAccountService;

@RestController
@RequestMapping(value = "api/v1/accounts")
public class AccountController {
	@Autowired
	private IAccountService service;
	
	@GetMapping()
	public List<Account> getAllAccounts() {
		return service.getAllAccounts();
	}
}
