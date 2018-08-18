package com.SongArtist;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from Artist ");
		List l = query.list();
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
			/*---Child class----*/
			Object o = itr.next();
			Artist a = (Artist)o;
			System.out.println(a.getArtistId()+" \t\t "+a.getArtistName()+" \t\t "+a.getArtistExp());
			
			/*-----parent class-----*/
			Song s = a.getObject();
			System.out.println(s.getSongId()+" \t\t "+s.getSongName()+" \t\t"+s.getSongReleaseYear());
					
		}
	}

}
