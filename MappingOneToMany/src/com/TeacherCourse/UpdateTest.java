package com.TeacherCourse;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Teacher t = new Teacher();
		t.setId(2);
		t.setName("payu");
		t.setCourse("mining");
		
		
		Course c1 = new Course();
		c1.setCourseId(5550);
		c1.setCourseName("bio");
		c1.setTeacherName("harry");
		
		Course c2 = new Course();
		c2.setCourseId(5551);
		c2.setCourseName("sci");
		c2.setTeacherName("verno");
		
		Course c3 = new Course();
		c3.setCourseId(5552);
		c3.setCourseName("sanskrit");
		c3.setTeacherName("jorge");
		
		Course c4 = new Course();
		c4.setCourseId(5553);
		c4.setCourseName("maths");
		c4.setTeacherName("rusi");
		
		Course c6 = new Course();
		c6.setCourseId(5555);
		c6.setCourseName("datamining");
		c6.setTeacherName("barman");
		
		Set s = new HashSet();
		/*s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		s.add(c5);*/
		s.add(c6);
		t.setChild(s);
		
		Transaction tx = session.beginTransaction();
		
		session.update(t);
		tx.commit();
		session.close();
	}

}
