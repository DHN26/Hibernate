package com.hib.mapping;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		List<Product> l1 = new ArrayList<Product>();
		l1.add(p1);
		l1.add(p2);

		List<Product> l2 = new ArrayList<Product>();
		l2.add(p3);
		l2.add(p4);

		Customer c1 = new Customer(1, "Amit", 21, l1);
		Customer c2 = new Customer(2, "Jhope", 24, l2);

		p1.setpId(1);
		p1.setpName("Fridge");
		p1.setpCost(10000);
		p1.setCust(c1);

		p2.setpId(2);
		p2.setpName("TV");
		p2.setpCost(20000);
		p2.setCust(c1);

		p3.setpId(3);
		p3.setpName("Mobile");
		p3.setpCost(40000);
		p3.setCust(c2);

		p4.setpId(4);
		p4.setpName("Washing Machine");
		p4.setpCost(15000);
		p4.setCust(c2);

		// 1. Configure the hibernate.cfg.xml file
		Configuration cfg = new Configuration();
		cfg.configure(); // cfg.configure("hibernate.cfg.xml");

		// 2. Build SessionFactory using configuration
		SessionFactory factory = cfg.buildSessionFactory();
		// 3. Open Session using SessionFactory
		Session session = factory.openSession();
		// 4. Begin Transaction using session
		Transaction txn = session.beginTransaction();

		session.save(c1);
		session.save(c2);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);

		// 5. Commit the Transaction
		txn.commit();
		System.out.println("Done!");
	}

}
