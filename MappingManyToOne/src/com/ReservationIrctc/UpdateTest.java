package com.ReservationIrctc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Irctc i2  = new Irctc();
		i2.setLoginId(702);
		i2.setPassword("sonal@gmail.com");
		
		Reservation r2 = new Reservation();
		r2.setReservationId(802);
		r2.setPassengerName("sonal");
		r2.setBerth("45");
		r2.setDate("16-12-2018");
		r2.setStatus("confirm");
		r2.setObject(i2);
		
		Reservation r3 = new Reservation();
		r3.setReservationId(803);
		r3.setPassengerName("monu");
		r3.setBerth("18");
		r3.setDate("30-04-2017");
		r3.setStatus("cnfm");
		r3.setObject(i2);
		
		Transaction t = session.beginTransaction();
		
			session.update(r2);
			session.update(r3);
		
		t.commit();
		session.close();
		System.out.println("Many to One Update is Done....!!!!!");
	}

}
