package com.HouseBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Base b1 = new Base();
		b1.setPlotno(960);
		b1.setLength("35*36");
		b1.setPrice(1000450000);
		
		House h1 = new House();
		h1.setHouseno(60);
		h1.setOwnername("harry");
		h1.setBase(b1);
		
		Transaction transaction = session.beginTransaction();
        session.save(h1);
        transaction.commit();
        session.close();
        System.out.println("One to One done");
	}

}
