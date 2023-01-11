package com.vti.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.AccountDTO;
import com.vti.entity.Account;
import com.vti.service.IAccountService;

@RestController
@RequestMapping(value = "api/v1/accounts")
public class AccountController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private IAccountService service;

	@GetMapping()
	public List<AccountDTO> getAllAccounts() {

		List<Account> entities = service.getAllAccounts();

		// convert entities --> dtos
		List<AccountDTO> dtos = modelMapper.map(entities, new TypeToken<List<AccountDTO>>() {
		}.getType());

		return dtos;
	}

	@GetMapping(value = "/{id}")
	public AccountDTO getAccountByID(@PathVariable(name = "id") int id) {

		Account entity = service.getAccountByID(id);

		// convert entity to dto
		AccountDTO dto = modelMapper.map(entity, AccountDTO.class);

		return dto;
	}

}
