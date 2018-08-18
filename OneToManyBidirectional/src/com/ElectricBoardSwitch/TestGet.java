package com.ElectricBoardSwitch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		/*-----------child class-------------------*/
		Object o = session.get(Switch.class, 800001);
		Switch s = (Switch)o;
		System.out.println(s.getSwitchId()+" \t\t "+s.getAmpere()+ " \t\t "+s.getSize());
		
		
		ElectricBoard e = s.getEBObject();
		System.out.println(e.getProductId()+" \t\t "+e.getSize()+" \t\t "+e.getQuality()+" \t\t "+e.getCompany());
		
		session.close();
		 System.out.println("many to one Getting done..!!");
	}

}