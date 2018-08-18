package com.StudentClasses;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student s1 = new Student();
		s1.setStudentid(107);
		s1.setFirstname("sonu");
		s1.setLastname("chandal");
		
		Student s2 = new Student();
		s2.setStudentid(108);
		s2.setFirstname("payu");
		s2.setLastname("namade");
		
		Classes c1 = new Classes();
		c1.setClassid(500);
		c1.setTitle("9th");
		c1.setDescription("smart class");
		
		Classes c2 = new Classes();
		c2.setClassid(600);
		c2.setTitle("12th");
		c2.setDescription("lab");
		
		Set s = new HashSet();
		s.add(s1);
		s.add(s2);
		c1.setStudent(s);
		c2.setStudent(s);
		
		Transaction t = session.beginTransaction();
	 
	    session.save(c1);
	    session.save(c2);

	    t.commit();

	    session.close();
	    System.out.println("Many To Many Bi-Directional is Done..!!");
	}

}
