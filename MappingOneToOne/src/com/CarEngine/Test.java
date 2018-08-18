package com.CarEngine;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Car c1 = new Car();
		c1.setCarid(15369);
		c1.setCarname("BMW");
		c1.setPrice(8000000);
		
		Engine e1 = new Engine();
		e1.setEngno(52485419);
		e1.setGearbox("4-gear");
		e1.setCar(c1);
		
		Transaction transaction = session.beginTransaction();
        session.save(e1);
        transaction.commit();
        session.close();
        System.out.println("One to One done");
	}

}
