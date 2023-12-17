package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Jaya", 30000);
		Employee e2 = new Employee(12, "Abhi", 20000);
		Employee e3 = new Employee(13, "Suman", 35000);

		Department d1 = new Department(1, "ECE");
		Department d2 = new Department(2, "ETE");

		// 1. Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure(); // cfg.configure("hibernate.cfg.xml");

		// 2. Build SessionFactory using configuration
		SessionFactory factory = cfg.buildSessionFactory();
		// 3. Open Session using SessionFactory
		Session session = factory.openSession();
		// 4. Begin Transaction using session
		Transaction txn = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(d1);
		session.save(d2);

		// 5. Commit the Transaction
		txn.commit();
		System.out.println("Task done in Database!");

	}

}
