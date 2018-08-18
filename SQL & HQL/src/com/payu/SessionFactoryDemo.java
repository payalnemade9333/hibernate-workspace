package com.payu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionFactoryDemo {
	
	private static SessionFactory sessionFactory;
	private static Session session;
	private static Transaction t ;
	
		public static SessionFactory  getSessionFactory()
			{			
			sessionFactory = new Configuration().configure().buildSessionFactory();
			return sessionFactory;
			}
		
		public static Session getSession()
			{
				getSessionFactory();
				session = sessionFactory.openSession();
				return session;
			}
		
		public static Transaction getTransaction()
		{
			getSession();
			t = session.beginTransaction();
			return t;
		}
}
