package com.vti.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.DTO.AccountDTO;
import com.vti.entity.Account;
import com.vti.service.IAccountService;

@RestController
@RequestMapping(value = "accounts")
public class AccountController {

	@Autowired
	private IAccountService service;
	@Autowired
	private ModelMapper modelMapper;

//	@GetMapping()
//	public List<AccountDTO> getAllAccountDTOs() {
//		return service.getAllAccountDTOs();
//	}
//
//	@GetMapping(value = "/{id}")
//	public AccountDTO getAccountDTOById(@PathVariable(name = "id") int id) {
//		return service.getAccountById(id);
//
//	}
	@GetMapping()
	public Page<AccountDTO> getAllAcounts(@RequestParam(value = "search", required = false) String search,
			Pageable pageable) {

		Page<Account> entityPages = service.getAllAccount(search, pageable);

		// convert entities --> dtos
		List<AccountDTO> dtos = modelMapper.map(
				entityPages.getContent(), 
				new TypeToken<List<AccountDTO>>() {}.getType());

		Page<AccountDTO> dtoPages = new PageImpl<>(dtos, pageable, entityPages.getTotalElements());

		return dtoPages;
	}

}
