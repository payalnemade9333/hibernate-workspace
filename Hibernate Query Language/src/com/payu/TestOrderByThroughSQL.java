package com.payu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOrderByThroughSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session sesssion = sessionFactory.openSession();
		Query query = sesssion.createSQLQuery("select * from part where age like '2%' order by name");
		List<Object[]> l = query.list();
		Iterator itr  = l.iterator();
		
		for(Object[] o : l)
		{
			PartDto dto = new PartDto();
			dto.setAge(Integer.parseInt(o[0].toString()));
			dto.setName(o[1].toString());
			System.out.println(dto.getAge()+" "+dto.getName());
		}
	}

}
