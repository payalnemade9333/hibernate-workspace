package com.payu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpInsertion {
	public void InsertSQL() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
	PartDto p = new PartDto();
	p.setName("k.shruti");
	p.setAge(36);
	p.setAddress("chennai");
	p.setSalary(78963);
	
	session.save(p);
	t.commit();
	session.close();
	System.out.println("successfully saved");
	}
}
