package com.ElectricBoardSwitch;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		ElectricBoard e1 = new ElectricBoard();
		e1.setProductId(401);
		e1.setSize(14);
		e1.setQuality("plastic");
		e1.setCompany("anchor");
		
		Switch s1 = new Switch();
		s1.setSwitchId(800001);
		s1.setAmpere("400 volt");
		s1.setSize("4*3");
		
		Switch s2 = new Switch();
		s2.setSwitchId(800002);
		s2.setAmpere("400 volt");
		s2.setSize("4*3");
		
		ElectricBoard e2 = new ElectricBoard();
		e2.setProductId(402);
		e2.setSize(16);
		e2.setQuality("PVC");
		e2.setCompany("rubycon");
		
		Switch s3 = new Switch();
		s3.setSwitchId(800003);
		s3.setAmpere("300 volt");
		s3.setSize("4*3");
		
		/*----------------one-to-many--------------*/
		Set s = new HashSet();
			s.add(s1);
			s.add(s2);
			s.add(s3);
			e1.setChild(s);
		
			/*-----------many-to-one-----------*/
			s1.setEBObject(e1);
			s2.setEBObject(e1);
			s2.setEBObject(e2);
			
			
			Transaction t = session.beginTransaction();
		
			session.save(e1);
		//	session.save(e1);
		//	session.save(e2);
			
			t.commit();
			session.close();
			System.out.println("One To Many Bi-Directional is Done..!!");
	}

}
