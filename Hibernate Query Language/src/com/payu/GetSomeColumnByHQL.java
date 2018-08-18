package com.payu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSomeColumnByHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("select p.id,p.name from PartDto p");
		List l = query.list();
		Iterator itr = l.iterator();
		
			Object[] column;
			System.out.println("id"+ "\t"+"Name");
		while(itr.hasNext())
		{
			column = (Object[])itr.next();
			Integer id = (Integer)column[0];
			String name = (String)column[1];
			System.out.println(id +"   "+ name);
			}
	}

}
