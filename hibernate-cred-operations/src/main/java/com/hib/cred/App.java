package com.hib.cred;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		//create();
		//read();
		//update();
		delete();

	}

	public static void delete() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Laptop lap=session.get(Laptop.class, 111);
		session.delete(lap);
		txn.commit();
		System.out.println("Data updated!! "+lap);
		
	}

	public static void update() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Laptop lap=session.get(Laptop.class, 111);
		lap.setName("Dell");
		txn.commit();
		System.out.println("Data updated!! "+lap);
		
	}

	public static void read() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Laptop lap=session.get(Laptop.class, 111);
		txn.commit();
		System.out.println("Data fetched!! "+lap);
		
	}

	public static void create() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Laptop lap=new Laptop(111,"HP",56000);
		session.save(lap);
		txn.commit();
		System.out.println("Table created!!");
		
	}

}
