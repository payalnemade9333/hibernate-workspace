package com.HouseBase;

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
		
		
		House h = (House)session.get(House.class, 450);
		h.setOwnername("rajesh");
		
		Base b = h.getBase();
		b.setPrice(78000550);
		
		session.update(h);
		//session.update(b);
		t.commit();
		
		
	}

}
