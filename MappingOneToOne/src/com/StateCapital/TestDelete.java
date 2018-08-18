package com.StateCapital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		/*State s = (State)session.get(State.class, 45698);
		session.delete(s);
		t.commit();*/
		
		Capital c = (Capital)session.get(Capital.class, 564123);
		session.delete(c);
		t.commit();
	}

}
