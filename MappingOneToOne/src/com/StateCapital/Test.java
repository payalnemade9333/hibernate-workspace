package com.StateCapital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Capital c = new Capital();
		c.setCapitalid(153698);
		c.setCaptialname("panaji");
		 
		State s = new State();
		s.setPinprefix(403);
		s.setStatename("goa");
		s.setDescription("tourist attraction");
		s.setCapital(c);

		
		 Transaction transaction = session.beginTransaction();
		 session.save(s);
        transaction.commit();
        session.close();
        System.out.println("One to One done");
	}

}
