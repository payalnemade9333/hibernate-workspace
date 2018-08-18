package com.ProductsManufacturers;

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
		
		Products p1 = new Products();
		p1.setProductId(1000);
		p1.setName("samsung");
		p1.setCost(15000);
		
		Products p2 = new Products();
		p2.setProductId(2000);
		p2.setName("apple");
		p2.setCost(30000);
		
		Manufacturers m1 = new Manufacturers();
		m1.setManufactureId(500);
		m1.setName("payu-owner");
		m1.setLocation("tamil nadu");
		
		Manufacturers m2 = new Manufacturers();
		m2.setManufactureId(600);
		m2.setName("rosy");
		m2.setLocation("MP");
		
		Set s = new HashSet();
			/*s.add(p1);
			s.add(p2);
			m1.setProduct(s);
			m2.setProduct(s);*/
		
		s.add(m1);
		s.add(m2);
		
		p1.setManufacture(s);
		p2.setManufacture(s);
		
		Transaction t = session.beginTransaction();
		 
        session.save(p1);
        session.save(p2);

        t.commit();

        session.close();
        System.out.println("Many To Many Bi-Directional is Done..!!");
	}

}
