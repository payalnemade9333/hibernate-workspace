package com.payu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WhereClauseByHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from PartDto where name like 'raju'");
		List list = query.list();
		Iterator itr  = list.iterator();
		PartDto dto;
		while(itr.hasNext())
		{
			dto= (PartDto)itr.next();
			System.out.println(dto.getId()+"\t "+dto.getName()+"\t "+dto.getAge()+"\t "+dto.getAddress()+" \t"+dto.getSalary());
		}
	}

}
