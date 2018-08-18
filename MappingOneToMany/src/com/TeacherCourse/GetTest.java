package com.TeacherCourse;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Object o = session.get(Teacher.class, new Integer(6));
		if(o!=null)
		{
			System.out.println(o.getClass().getName());
			Teacher t = (Teacher)o;
			System.out.println(t.getId()+" "+t.getName()+" "+t.getCourse());
		}
		else
		{
			System.out.println("record doen't exist");
		}
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		session.close();
		System.out.println("One To Many is Done for getting..!!");
	}

}
