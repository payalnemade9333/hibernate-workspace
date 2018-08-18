package com.NamedQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.ast.tree.SelectExpression;

	public class getAllQueries {
		static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		static Session session = sessionFactory.openSession();
		public static void GetAllQuery()
		{
		Query q = session.getNamedQuery("allpart");
		List list = q.list();
		Iterator itr = list.iterator();
		PartDto dto;
		 while(itr.hasNext()){ 
			dto = (PartDto)itr.next();
			System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAge()+"" +dto.getSalary()+" "+dto.getAddress());
		} 
	//	session.close();
		}
		
		public static void GetNameQuery()
		{
			Query q = session.getNamedQuery("findNameByPart");
			q.setString("name", "payal");
			List list = q.list();
			Iterator itr = list.iterator();
			PartDto dto;
			 while(itr.hasNext()){ 
				dto = (PartDto)itr.next();
				System.out.println(dto.getName());
		} 
	//	session.close();
		}
		
		public static void getAndQuery()
		{
			Query q = session.getNamedQuery("findAndByPart");
			q.setString("name", "nilm");
			q.setInteger("salary", 50000);
			List list = q.list();
			Iterator itr = list.iterator();
			PartDto dto;
			 while(itr.hasNext()){ 
				dto = (PartDto)itr.next();
				System.out.println(dto.getName()+"" +dto.getSalary());
			} 
		}
	}
