//
package com.vti;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Group;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HoanNV
 * @create_date: Nov 24, 2022
 * @version: 1.0
 * @modifer: HoanNV
 * @modifer_date: Nov 24, 2022
 */
public class TestProgram {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			Group group = new Group();
			group.setName("Nguyen Van Hoan");
			session.save(group);
			System.out.println("Create Success");
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	private static SessionFactory buildSessionFactory() {
		// load configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// add entity
		configuration.addAnnotatedClass(Group.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);
	}
}
