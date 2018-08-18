package com.UserContactNumber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Object o = session.get(User.class, new Integer(102));
		if(o!=null)
		{
			System.out.println(o.getClass().getName());
			User u = (User)o;
			System.out.println(u.getId()+" "+u.getName());
			System.out.println("Many to one is Done for Fetching the data..!!");
		}
		else
		{
			System.out.println("record doen't exist");
		}
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		session.close();
		
	}

}
