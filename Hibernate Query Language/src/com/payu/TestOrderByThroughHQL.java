package com.payu;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOrderByThroughHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from PartDto where salary like '5%' order by name");
		List list = query.list();
		Iterator itr = list.iterator();
		PartDto obj;
		while(itr.hasNext())
		{
			obj = (PartDto)itr.next();
			System.out.println(obj.getSalary()+" "+ obj.getName());
		}
	}

}
