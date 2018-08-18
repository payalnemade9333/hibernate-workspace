package com.Courtlawyer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		/*lawyer l = new lawyer();
		l=session.get(lawyer.class, new String(""));*/
		lawyer l = new lawyer();
		l.setLawyerid(15236);
		l.setStatus("agree");
		session.update(l);
		t.commit();
		session.close();	}

}
