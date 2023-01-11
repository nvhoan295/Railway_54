package com.vti.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.entity.Account;
import com.vti.form.AccountFilterForm;

public interface IAccountService {
//	AccountDTO getAccountById(int id);
//	List<AccountDTO> getAllAccountDTOs();
	
	Page<Account> getAllAccount(String search, AccountFilterForm filterForm,  Pageable pageable);
	
	
}
