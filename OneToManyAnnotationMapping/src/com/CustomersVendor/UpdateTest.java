package com.CustomersVendor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Customers c = (Customers)session.get(Customers.class, 502);
		c.setCustomerName("Hora");
		System.out.println("Successfully Saved");
		session.save(c);
		t.commit();
		session.close();
	}

}
