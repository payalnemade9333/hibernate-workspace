package com.StudentAddress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		 Student s=new Student();
		 s.setStudentId(101);
		 s.setStudentName("rosey");
		 
		 Address ad = new Address();
		 ad.setAddressId(502);
		 ad.setCity("indore");
		 ad.setState("MP");
		 ad.setS(s); 
		 
		     Transaction t = session.beginTransaction();
		               session.save(ad);
		     t.commit();
		 
		     session.close();
		     System.out.println("One to One is Done..!!");
	}

}
