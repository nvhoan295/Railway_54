package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;

@Service
public class UserService implements IUserService{
	@Autowired
	private IUserRepository repository;

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}
}
