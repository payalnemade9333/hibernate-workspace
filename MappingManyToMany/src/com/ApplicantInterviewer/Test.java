package com.ApplicantInterviewer;

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
		
		Applicant a1 = new Applicant();
		a1.setApplicantId(450);
		a1.setName("chippy the potato");
		a1.setResume("uploded");
		
		Applicant a2 = new Applicant();
		a2.setApplicantId(550);
		a2.setName("queen elizardbeth");
		a2.setResume("done");
		
		Interviewer i1 = new Interviewer();
		i1.setInterviewerId(9000);
		i1.setName("kareena");
		i1.setDepartment("developer");
		i1.setDate("2015-10-01");
		
		Interviewer i2 = new Interviewer();
		i2.setInterviewerId(8000);
		i2.setName("Andy park");
		i2.setDepartment("media");
		i2.setDate("2013-10-30");
			
		Set s = new HashSet();
			s.add(i1);
			s.add(i2);
				
		a1.setInterviewer(s);
		a2.setInterviewer(s);
				
		Transaction t = session.beginTransaction();
		 
        session.save(a1);
        session.save(a2);

        t.commit();

        session.close();
        System.out.println("Many To Many Bi-Directional is Done..!!");
	}

}
