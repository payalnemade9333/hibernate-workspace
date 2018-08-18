package com.TeacherCourse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Object o = session.get(Teacher.class, new Integer(2));
		Teacher v = (Teacher)o;
		 
		Transaction tx = session.beginTransaction();
		session.delete(v);
		tx.commit();
		 
		session.close();
		System.out.println("One To Many is Done for deleting..!!");

	}

}
