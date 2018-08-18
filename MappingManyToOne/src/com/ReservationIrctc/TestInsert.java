package com.ReservationIrctc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		/*Irctc i  = new Irctc();
		i.setLoginId(701);
		i.setPassword("dhjsnjd@1589");
		
		Reservation r1 = new Reservation();
		r1.setReservationId(800);
		r1.setPassengerName("golu");
		r1.setBerth("41");
		r1.setDate("01-05-2018");
		r1.setStatus("confirm");
		r1.setObject(i);
		
		Reservation r2 = new Reservation();
		r2.setReservationId(801);
		r2.setPassengerName("molu");
		r2.setBerth("56");
		r2.setDate("10-10-2017");
		r2.setStatus("RAC");
		r2.setObject(i);*/
		
		Irctc i2  = new Irctc();
		i2.setLoginId(702);
		i2.setPassword("quiehin@1589");
		
		Reservation r2 = new Reservation();
		r2.setReservationId(802);
		r2.setPassengerName("sonu");
		r2.setBerth("01");
		r2.setDate("16-12-2016");
		r2.setStatus("waiting");
		r2.setObject(i2);
		
		Reservation r3 = new Reservation();
		r3.setReservationId(803);
		r3.setPassengerName("monal");
		r3.setBerth("18");
		r3.setDate("30-04-2017");
		r3.setStatus("confirm");
		r3.setObject(i2);
		
		Transaction t = session.beginTransaction();
		//	session.save(r1);
			session.save(r2);
		/*	session.save(c3);
			session.save(c4);
			session.save(c5);
			session.save(c6);
			session.save(c7);
			session.save(c8);
			session.save(c9);
		*/	
		t.commit();
		session.close();
		System.out.println("Many to One is Done....!!!!!");
	}

}
