package com.CarEngine;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Engine");
		List l = query.list();
		Iterator itr = l.iterator();
		Engine e;
		while(itr.hasNext())
		{
			e = (Engine)itr.next();
			System.out.println(e.getEngno()+" \t\t "+e.getGearbox());
			
			Car c = e.getCar();
			System.out.println(c.getCarid()+" \t\t "+c.getCarname()+" \t\t "+c.getPrice());
		}
		
	}

}
