package com.MobileHotspot;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Mobile m1= new Mobile();
		m1.setModelNo(200);
		m1.setMobileNo(777192777l);
		m1.setNetworkName("VM_780520_15593");
		
		Hotspot h1 = new Hotspot();
		h1.setSecurity("Open security");
		h1.setPassword("QWRYUBHH#1234");
		
		Hotspot h2 = new Hotspot();
		h2.setSecurity("single security");
		h2.setPassword("HJHJGYFTYFHJ@1234");
		
		Mobile m2= new Mobile();
		m2.setModelNo(201);
		m2.setMobileNo(9826675050l);
		m2.setNetworkName("Mi_2354845415_454647845");
		
		Hotspot h3 = new Hotspot();
		h3.setSecurity("single user");
		h3.setPassword("BJHJHJBJ@1234");
		
		/*----------------one-to-many--------------*/
		Set s = new HashSet();
			s.add(h1);
			s.add(h2);
	//		s.add(h3);
			
			m1.setBranch(s);
	//		m2.setBranch(s);
			
			
			/*-----------many-to-one-----------*/
			h1.setMHObject(m1);
			h2.setMHObject(m1);
			/*h3.setMHObject(m2);*/
			
			Transaction t = session.beginTransaction();
		
			session.save(m1);
			//session.save(m2);
			
			t.commit();
			session.close();
			System.out.println("One To Many Bi-Directional is Done..!!");
	}

}
