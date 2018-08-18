package com.BookIndex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Book b = new Book();
		b.setBookid(7896);
		b.setName("flower in the water");
		b.setDesc("for childern");
		
		Index i = new Index();
		i.setPageno(12);
		i.setTypes("fun");
		i.setBook(b);
		
		Transaction transaction = session.beginTransaction();
        session.save(i);
        transaction.commit();
        session.close();
        System.out.println("One to One done");
	}
}
