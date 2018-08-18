package com.Payal;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
	
	//	Configuration cfg = new Configuration();
	//	cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();//load Factory
		
		Session session = factory.openSession();	//create session
		
		Transaction t = session.beginTransaction();
		
		userDto u = new userDto();
		u.setId(123);
		u.setFirstName("payu");
		u.setLastName("nemade");
		
		session.save(u);
		t.commit();
		session.close();
		
		System.out.println("successfully saved");
	}

}
