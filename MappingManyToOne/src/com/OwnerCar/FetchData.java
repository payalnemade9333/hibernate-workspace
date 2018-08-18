package com.OwnerCar;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		 Query qry=session.createQuery("from Owner o");
		 
	     List l=qry.list();
	     Iterator it = l.iterator();
	     while(it.hasNext())
	     {
	      Object o = it.next();
	      Car c = (Car)o;
	      System.out.println(c.getCarId());
	      Owner v= c.getParentObjects();
	      System.out.println(v.getUserId());
	     }
	 
	     session.close();
	     System.out.println("many to one select done..!!");
	}

}
