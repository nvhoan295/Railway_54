package com.vti.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.vti.DTO.AccountDTO;
import com.vti.entity.Account;
import com.vti.form.AccountFilterForm;
import com.vti.repository.IAccountRepository;
import com.vti.specification.AccountSpecification;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private IAccountRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public AccountDTO getAccountById(int id) {
		Account account = repository.findById(id).get();

//		AccountDTO accountDTO = new AccountDTO();
//		accountDTO.setUsername(account.getUsername());
//		accountDTO.setDepartmentName(account.getDepartment().getName());

		AccountDTO accountDTO = modelMapper.map(account, AccountDTO.class);

		return accountDTO;
	}

	@Override
	public List<AccountDTO> getAllAccountDTOs() {
		List<Account> accounts = repository.findAll();

		List<AccountDTO> accountDTOs = modelMapper.map(accounts, new TypeToken<List<AccountDTO>>() {
		}.getType());

		return accountDTOs;
	}

	@Override
	public Page<Account> getAllAccount(String search, AccountFilterForm filterForm, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
