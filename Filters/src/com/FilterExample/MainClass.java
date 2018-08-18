package com.FilterExample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		 System.out.println("Student Name Filter");
	        System.out.println("---------------------------------------------------");
	        
	        // enabling the studentName filter
	        session.enableFilter("studentName");
	        Query query = session.createQuery("from Student");
	        List list = query.list();
	        Iterator it = list.iterator();
	        while (it.hasNext()) {
	            Student student = (Student) it.next();
	            System.out.println("Student Names which starting with 'c' : " + student.getStudentName());
	        }
	        
	        // disabling the studentName filter after the operation
	        session.disableFilter("studentName");
	        
	        System.out.println("Age Filter");
	        System.out.println("----------------------------------------------------------");
	        // enabling the age filter
	        Filter filter = session.enableFilter("ageFilter");
	        filter.setParameter("age", 20);
	        Query query2 = session.createQuery("from Student s");
	        List list2 = query2.list();
	        Iterator it2 = list2.iterator();
	        while (it2.hasNext()) {
	            Student student = (Student) it2.next();
	            System.out.println("studentNames who are age >= 20 : " + student.getStudentName());
	        }
	        
	        // disabling the age filter after the operation
	        session.disableFilter("ageFilter");
	        
	        session.clear();
	        session.close();	
		}
	}