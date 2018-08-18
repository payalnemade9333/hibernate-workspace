package com.OneToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicTest {
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Vendor v = new Vendor();
		v.setVendorId(101);
		v.setVendorName("gaurav");
		
		Customer c1 = new Customer();
		c1.setCustomerId(501);
		c1.setCustomerName("customer-1");
		
		Customer c2 = new Customer();
		c2.setCustomerId(502);
		c2.setCustomerName("customer-2");
		
		Customer c3 = new Customer();
		c3.setCustomerId(503);
		c3.setCustomerName("customer-3");
		
		Customer c4 = new Customer();
		c4.setCustomerId(504);
		c4.setCustomerName("customer-4");
		
		Set s = new HashSet();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		
		v.setChildren(s);
		
		Transaction t = session.beginTransaction();
		
     	session.save(v);
		t.commit();
		session.close();
	}
}