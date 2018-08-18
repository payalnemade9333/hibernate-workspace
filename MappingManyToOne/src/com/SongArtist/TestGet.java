package com.SongArtist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Object o = session.get(Artist.class, 401);
		/*-----child----*/
		Artist c = (Artist)o; 
		System.out.println(c.getArtistId()+" "+c.getArtistName()+" "+c.getArtistExp());
		
		/*----parent ------*/
		Song s = c.getObject();
		System.out.println(s.getSongName()+" "+s.getSongId()+" "+s.getSongReleaseYear());
		
		     session.close();
		     
		     System.out.println("many to one Getting done..!!");
	}

}
