package com.StudentAddress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student s = new Student();
		s.setStudentId(107);
		s.setName("abc");
		s.setStudentAddress(1);
		
		s.setStudentId(108);
		s.setName("xyz");
		s.setStudentAddress(2);
		
		Address a1 = new Address();
		a1.setObject(s);
		a1.setStreet("omr road");
		a1.setCity("chennai");
		a1.setState("TN");
		a1.setZipcode(452010);
		
		/*Address a2 = new Address();
		a2.setAddressId(s);
		a2.setStreet("Mg road");
		a2.setCity("chennai");
		a2.setState("TN");
		a2.setZipcode(452010);*/
		
		Transaction t = session.beginTransaction();
				session.save(a1);
				
		t.commit();
		session.close();
		System.out.println("Many to One is Done....!!!!!");
	}

}
