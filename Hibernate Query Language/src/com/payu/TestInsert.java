
package com.payu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {
	public static void main(String[] args)
	{
	
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	
	Transaction t = session.beginTransaction();
	
	PartDto p = new PartDto();
	p.setName("raju");
	p.setAge(40);
	p.setAddress("78 nagar");
	p.setSalary(50000);
	
	session.save(p);
	t.commit();
	session.close();
	System.out.println("successfully saved");
	
	}
}
