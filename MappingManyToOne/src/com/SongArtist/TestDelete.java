package com.SongArtist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		/*------many to one child will be delete----*/
		Object o = session.get(Artist.class, 403);
		Artist c = (Artist)o; 
		 
		     Transaction tx = session.beginTransaction();
		           session.delete(c);
		     tx.commit();
		 
		     session.close();
		     System.out.println("many to one delete done..!!");
	}

}
