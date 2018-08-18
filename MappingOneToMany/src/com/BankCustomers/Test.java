package com.BankCustomers;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.TeacherCourse.Course;
import com.TeacherCourse.Teacher;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Bank b = new Bank();
		b.setBankid(701);
		b.setBankname("SBI");
		
		
		Customers c1 = new Customers();
		c1.setCustomerid(501);
		c1.setFirstname("payal");
		c1.setLastname("nemade");
		c1.setBirthdate("06-10-1993");
		c1.setPhone(777025896);
		
		Customers c2 = new Customers();
		c2.setCustomerid(502);
		c2.setFirstname("gaurav");
		c2.setLastname("sharma");
		c2.setBirthdate("10-06-1990");
		c2.setPhone(2589631);
		
		Customers c3 = new Customers();
		c3.setCustomerid(503);
		c3.setFirstname("ranu");
		c3.setLastname("joshi");
		c3.setBirthdate("18-12-1887");
		c3.setPhone(36987410);
		
		
		
		Set s = new HashSet();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		b.setBranch(s);
		
		Transaction tx = session.beginTransaction();
		
		session.save(b);
		tx.commit();
		session.close();
	}

}
