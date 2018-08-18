package com.payu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class GetSomeColumnBySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createSQLQuery("select id,name from part");
		List<Object[]> l = query.list();
		Iterator itr = l.iterator();
		
		for(Object[] o : l)
		{
			PartDto dto = new PartDto();
			dto.setId(Integer.parseInt(o[0].toString()));
			dto.setName(o[1].toString());
			System.out.println(dto.getId()+"  "+dto.getName());
		}
	}

}
