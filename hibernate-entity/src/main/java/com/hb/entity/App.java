package com.hb.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Jin", 99);

		  //1. Configure the hibernate.cfg.xml file
		  Configuration cfg = new Configuration();
		  cfg.configure(); // cfg.configure("hibernate.cfg.xml");

		  //2. Build SessionFactory using configuration
		  SessionFactory factory = cfg.buildSessionFactory();
		  //3. Open Session using SessionFactory
		  Session session = factory.openSession();
		  //4. Begin Transaction using session
		  Transaction txn = session.beginTransaction();

		  session.save(s1);
		  
		  //5. Commit the Transaction
		  txn.commit();
		  System.out.println("-----> " + s1 + " has been stored in Database !");
	}

}
