package com.SongArtist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		/*Song s1  = new Song();
		s1.setSongId(300);
		s1.setSongName("mash Up");
		s1.setSongReleaseYear("2017");
		
		Artist a1 = new Artist();
		a1.setArtistId(400);
		a1.setArtistName("arjit singh");
		a1.setArtistExp(10);
		a1.setObject(s1);
		
		Artist a2 = new Artist();
		a2.setArtistId(401);
		a2.setArtistName("atif aslam");
		a2.setArtistExp(5);
		a2.setObject(s1);
		
		Artist a3 = new Artist();
		a3.setArtistId(402);
		a3.setArtistName("S.ghosal");
		a3.setArtistExp(7);
		a3.setObject(s1);*/
		
		Song s2  = new Song();
		s2.setSongId(301);
		s2.setSongName("Rap (honey singh)");
		s2.setSongReleaseYear("2015");
		
		Artist a4 = new Artist();
		a4.setArtistId(403);
		a4.setArtistName("Honey singh");
		a4.setArtistExp(8);
		a4.setObject(s2);
		
		Transaction t = session.beginTransaction();
			/*session.save(a1);
			session.save(a2);
			session.save(a3);*/
			session.save(a4);
			
		t.commit();
		session.close();
		System.out.println("Many to One Insert is Done....!!!!!");
	}

}
