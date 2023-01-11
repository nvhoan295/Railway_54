package com.vti;

import java.util.List;

import com.vti.entity.Address;
import com.vti.entity.User;
import com.vti.repository.AddressRepository;
import com.vti.repository.UserRepository;

public class Program {
	public static void main(String[] args) {
		UserRepository userRepository = new UserRepository();
		AddressRepository addressRepository = new AddressRepository();

		System.out.println("***********GET ALL USERS***********");

		List<User> users = userRepository.getAllUsers();

		for (User user : users) {
			System.out.println(user);
		}

//		System.out.println("\n\n***********CREATE USER***********");
//
//		Address address = addressRepository.getAddressByID(4);
//
//		User user = new User();
//		user.setUsername("trantrunghuong");
//		user.setAddress(address);
//
//		userRepository.createUser(user);

	}
}

