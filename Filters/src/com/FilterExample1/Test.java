package com.FilterExample1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.FilterExample.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Employee Name Filter");
		System.out.println("--------------------------------------------------------------------------------");
        
        // enabling the studentName filter
		session.enableFilter("name");
		 Query query = session.createQuery("from Employee");
	        List list = query.list();
	        Iterator it = list.iterator();
	        while (it.hasNext()) {
	            Employee emp = (Employee) it.next();
	            System.out.println("Employee Names which starting with 's' : " + emp.getName()+" "+emp.getSalary());
	        }
	        
	        // disabling the employee salary filter after the operation
	        session.disableFilter("name");
	        
	       /* System.out.println("salary Filter");
	        System.out.println("----------------------------------------------------------");
	        // enabling the age filter
	        Filter filter = session.enableFilter("salaryFilter");
	        filter.setParameter("salary", 50000);
	        Query query2 = session.createQuery("from Employee e");
	        List list2 = query2.list();
	        Iterator it2 = list2.iterator();
	        while (it2.hasNext()) {
	            Employee emp1 = (Employee) it2.next();
	            System.out.println("employee salary who are salary >= 5000 : " + emp1.getSalary());
	        }
	        
	        // disabling the age filter after the operation
	        session.disableFilter("salaryFilter");
	        */
	        session.clear();
	        session.close();	
	}
	}
