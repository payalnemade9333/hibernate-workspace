package com.OwnerCar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Car o = (Car)session.get(Car.class, new Integer(17));
	//	Car v = (Car)o;
		 
		session.delete(o);
		tx.commit();
		 
		session.close();
		System.out.println("Many to one is Done for deleting..!!");
	}

}
