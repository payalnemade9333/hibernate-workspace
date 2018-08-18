package com.CustomersVendor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Vendor v = new Vendor();
		v.setVid(700);
		v.setVendorName("Andy");
		
		Customers c1 = new Customers();
		c1.setCid(501);
		c1.setCustomerName("Payal");
		
		Customers c2 = new Customers();
		c2.setCid(502);
		c2.setCustomerName("suresh");
		
		Customers c3 = new Customers();
		c3.setCid(503);
		c3.setCustomerName("rajesh");
		Transaction t = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		t.commit();
		System.out.println("Many to One Annotaion Done...........!!!");
		session.close();
	}

}
