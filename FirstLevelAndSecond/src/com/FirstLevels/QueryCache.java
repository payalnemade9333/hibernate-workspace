package com.FirstLevels;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryCache {
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		/*Session session = sessionFactory.openSession();
		Query query = session.createQuery("from EmployeeDto where id=1");
		query.setCacheable(false);
		List list = query.list();
		Iterator itr = list.iterator();
		EmployeeDto dto;
		while(itr.hasNext())
		{
			dto = (EmployeeDto)itr.next();
			System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getSalary());
		}
		session.close();
		
		Session session1 = sessionFactory.openSession();
		Query query1 = session1.createQuery("from EmployeeDto where id=1");
		query1.setCacheable(false);
		List list1 = query1.list();
		Iterator itr1 = list1.iterator();
		EmployeeDto dto1;
		while(itr1.hasNext())
		{
			dto1 = (EmployeeDto)itr1.next();
			System.out.println(dto1.getId()+" "+dto1.getName()+" "+dto1.getSalary());
		}
		session1.close();*/
		
	/*	Session session2 = sessionFactory.openSession();
		Query query2 = session2.createSQLQuery("select * from employee where name='hansa'");
		query2.setCacheable(true);
		List list2 = query2.list();
		Iterator itr2 = list2.iterator();
		EmployeeDto dto2;
		while(itr2.hasNext())
		{
			dto2 = (EmployeeDto)itr2.next();
			System.out.println(dto2.getName());
		}
		session2.close();*/
		
/*		Session session3 = sessionFactory.openSession();
		EmployeeDto dto3 = (EmployeeDto)session3.load(EmployeeDto.class, 1);
		System.out.println(dto3.getId()+" "+dto3.getName()+" "+dto3.getSalary());
		session3.close();*/
		
		
		Session session4 = sessionFactory.openSession();
		Criteria crt = session4.createCriteria("from EmployeeDto");
		List list3 = crt.list();
		Iterator itr3 = list3.iterator();
		EmployeeDto dto4;
		while(itr3.hasNext())
		{
			dto4 = (EmployeeDto)itr3.next();
			System.out.println(dto4.getId()+" "+dto4.getName()+" "+dto4.getSalary());
		}
	}
		
}
