package com.vti.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.vti.entity.Account;

public class AccountSpecification {

	@SuppressWarnings("deprecation")
	public static Specification<Account> buildWhere(String search) {
		if (StringUtils.isEmpty(search)) {
			return null;
		}
		search = search.trim();

		CustomSpecification name = new CustomSpecification("username", search);

		return Specification.where(name);
	}

}
