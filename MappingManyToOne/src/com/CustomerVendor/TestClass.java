package com.CustomerVendor;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Vendor v = new Vendor();
		v.setVendorId(1003);
		v.setVendorName("payal");
		
		/*Customer c1 = new Customer();
		c1.setCustomerId(601);
		c1.setCustomerName("cust_1");
		c1.setParentObject(v);
		
		Customer c2 = new Customer();
		c2.setCustomerId(602);
		c2.setCustomerName("cust_2");
		c2.setParentObject(v);
		
		Customer c3 = new Customer();
		c3.setCustomerId(603);
		c3.setCustomerName("cust_3");
		c3.setParentObject(v);
		
		Customer c4 = new Customer();
		c4.setCustomerId(604);
		c4.setCustomerName("cust_4");
		c4.setParentObject(v);
		*/
		Customer c5 = new Customer();
		c5.setCustomerId(606);
		c5.setCustomerName("cust_6");
		c5.setParentObject(v);
		Transaction t = session.beginTransaction();
		/*session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);*/
		session.save(c5);
		t.commit();
		session.close();
	}

}
