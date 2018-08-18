package com.payu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSelectQueryBySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createSQLQuery("select * from part");
		
		List<Object[]> l =query.list();
		Iterator itr  = l.iterator();
		
		for(Object[] o : l)
		{
			PartDto dto = new PartDto();
			dto.setId(Integer.parseInt(o[0].toString()));
			dto.setName(o[1].toString());
			dto.setAge(Integer.parseInt(o[2].toString()));
			dto.setSalary(Integer.parseInt(o[3].toString()));
			dto.setAddress(o[4].toString());
			
			System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAge()+" "+dto.getSalary()+" "+dto.getAddress());
			
		}
	}

}
