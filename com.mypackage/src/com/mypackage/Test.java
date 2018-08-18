package com.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Customer c = new Customer();
		c.setCust_id(1);
		c.setcName("hansa");
		c.setAddress("vijay nagar");
		c.setCity("indore");
		c.setState("mp");
		c.setPincode(452010);

		session.save(c);
		t.commit();
		session.close();
		
		System.out.println("successfully saved");		
	}
}