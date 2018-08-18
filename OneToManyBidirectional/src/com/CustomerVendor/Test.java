package com.CustomerVendor;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Vendor v =new Vendor();
        v.setVendorId(104);
        v.setVendorName("marry");

        Customer c1=new Customer();
        c1.setCustomerId(5013);
        c1.setCustomerName("customer-13");

        Customer c2=new Customer();
        c2.setCustomerId(5011);
        c2.setCustomerName("customer-11");

        Customer c3=new Customer();
        c3.setCustomerId(5012);
        c3.setCustomerName("customer-12");

        // one-to-many
        Set s = new HashSet();

			    s.add(c1);
			    s.add(c2);
			/*    s.add(c3); */       
	   
        v.setChildren(s);

		// many-to-one          
		
	         c1.setParentObject(v);
			 c2.setParentObject(v);
			 c3.setParentObject(v);
		 
		Transaction t = session.beginTransaction();
		
		session.save(c1);
	//	session.save(v);

		t.commit();
		session.close();
		System.out.println("One To Many Bi-Directional is Done..!!");
	}

}		
