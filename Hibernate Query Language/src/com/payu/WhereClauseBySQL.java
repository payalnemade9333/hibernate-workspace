package com.payu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WhereClauseBySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createSQLQuery("select * from part where name like 'r%'");
		List<Object[]> l = query.list();
		Iterator itr = l.iterator();
		
		for(Object[] o : l)
		{
			PartDto dto = new PartDto();
			dto.setName(o[1].toString());
			System.out.println(dto.getName());
		}
		

	}

}
