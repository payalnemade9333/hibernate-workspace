package com.FacebookPost;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Post p1 = new Post();
		p1.setPid(456987);
		p1.setDate("05-15-1863");
		p1.setTime("22:23");
		p1.setType("images");
		
		Facebook f1 = new Facebook();
		f1.setFbid(45236);
		f1.setFbusername("john");
		f1.setParentObject(p1);
		
		Facebook f2 = new Facebook();
		f2.setFbid(78945);
		f2.setFbusername("harry");
		f2.setParentObject(p1);
		
		Facebook f3 = new Facebook();
		f3.setFbid(258963);
		f3.setFbusername("potter");
		f3.setParentObject(p1);
		
		Transaction t = session.beginTransaction();
		session.save(f1);
		session.save(f2);
		session.save(f3);
		t.commit();
		System.out.println("Done");
		session.close();
	}

}
