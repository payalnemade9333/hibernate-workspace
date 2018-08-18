package com.PassportPerson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Object o = session.get(Passport.class, new Integer(1001));
		Passport p = (Passport)o;
		System.out.println(p.getExpireDate());
		
		Person p1 = p.getPerson();
		System.out.println(p1.getName());
		session.close();
		System.out.println("One to One is Done");
	}

}
