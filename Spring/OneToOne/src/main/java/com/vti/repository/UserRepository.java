package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.entity.User;
import com.vti.utils.HibernateUtils;

public class UserRepository {

	private HibernateUtils hibernateUtils;

	public UserRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<User> query = session.createQuery("FROM User");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createUser(User user) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(user);
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
