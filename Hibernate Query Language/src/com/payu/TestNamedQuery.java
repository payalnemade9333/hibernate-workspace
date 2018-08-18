package com.payu;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestNamedQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query q = session.getNamedQuery("allpart");
	//	q.setParameter("name", "payal");
		List list = q.list();
		Iterator itr = list.iterator();
		PartDto dto;
		 while(itr.hasNext()){ 
			dto = (PartDto)itr.next();
			System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAge()+"" +dto.getSalary()+" "+dto.getAddress());
		}  
		session.close();  
	}
}
