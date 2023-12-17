package com.hib.mapping;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Technology t1 = new Technology();
		Technology t2 = new Technology();
		Technology t3 = new Technology();
		Technology t4 = new Technology();

		List<Technology> l1 = new ArrayList<Technology>();
		l1.add(t1);
		l1.add(t3);
		l1.add(t4);

		List<Technology> l2 = new ArrayList<Technology>();
		l2.add(t2);
		l2.add(t3);

		List<Technology> l3 = new ArrayList<Technology>();
		l3.add(t1);
		l3.add(t2);
		l3.add(t3);

		List<Technology> l4 = new ArrayList<Technology>();
		l4.add(t3);
		l4.add(t4);

		List<Technology> l5 = new ArrayList<Technology>();
		l5.add(t1);
		l5.add(t2);
		l5.add(t3);
		l5.add(t4);

		Employee e1 = new Employee(1, "Jin", "c", l1);
		Employee e2 = new Employee(2, "Jhope", "a", l2);
		Employee e3 = new Employee(3, "Jimin", "b", l3);
		Employee e4 = new Employee(4, "V", "c", l4);
		Employee e5 = new Employee(5, "Namjoon", "a", l5);

		List<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(e1);
		emp1.add(e3);
		emp1.add(e5);

		List<Employee> emp2 = new ArrayList<Employee>();
		emp2.add(e2);
		emp2.add(e3);
		emp2.add(e5);

		List<Employee> emp3 = new ArrayList<Employee>();
		emp3.add(e1);
		emp3.add(e2);
		emp3.add(e3);
		emp3.add(e4);
		emp3.add(e5);

		List<Employee> emp4 = new ArrayList<Employee>();
		emp4.add(e1);
		emp4.add(e4);
		emp4.add(e5);

		t1.setTechId(111);
		t1.setTechName("Java");
		t1.setEmp(emp1);

		t2.setTechId(222);
		t2.setTechName("Python");
		t2.setEmp(emp2);

		t3.setTechId(333);
		t3.setTechName("SQL");
		t3.setEmp(emp3);

		t4.setTechId(444);
		t4.setTechName("REACT");
		t4.setEmp(emp4);

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
		session.save(e4);

		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);

		// 5. Commit the Transaction
		txn.commit();
		System.out.println("Done!");
	}

}
