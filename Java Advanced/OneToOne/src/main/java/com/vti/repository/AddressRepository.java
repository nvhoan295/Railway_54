package com.vti.repository;

import org.hibernate.Session;

import com.vti.entity.Address;
import com.vti.utils.HibernateUtils;

public class AddressRepository {

	private HibernateUtils hibernateUtils;

	public AddressRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public Address getAddressByID(int id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			Address address = session.get(Address.class, id);

			return address;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
