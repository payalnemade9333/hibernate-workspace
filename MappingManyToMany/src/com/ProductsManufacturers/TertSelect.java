package com.ProductsManufacturers;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TertSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		List l = session.createQuery("from Products").list();
		Iterator itr = l.iterator();
		Products p;
		while(itr.hasNext())
		{
			p = (Products)itr.next();
			System.out.println(p.getProductId()+" "+p.getName()+" "+p.getCost());
			
			Set s = p.getManufacture();
			Iterator it = s.iterator();
			Manufacturers m;
			while(it.hasNext())
			{
				m = (Manufacturers)it.next();
				System.out.println(m.getManufactureId()+" "+m.getName());
			}
		}
		session.close();
	}

}
