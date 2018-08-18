package com.BookAuthor;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Book b = new Book();
		/*b.setBookId(1);
		b.setName("let is snow");
		b.setIsbn("ISBN7503002");*/
		
		b.setBookId(3);
		b.setName("old man in the sea");
		b.setIsbn("ISBN752013");
		
		Author a1 = new Author();
		a1.setAuthorId(106);
		a1.setFullName("shake");
		a1.setMobileno(5630);
//		a1.setForBookId(2);
/*
		Author a2 = new Author();
		a2.setAuthorId(106);
		a2.setFullName("John Maureen ");
		a2.setMobileno(7896);*/
//		a2.setForBookId(1);
/*		
		Author a3 = new Author();
		a3.setAuthorId(102);
		a3.setFullName("Lauren Myrade");
		a3.setMobileno(76665);
		a3.setForBookId(1);
		
		Author a4 = new Author();
		a4.setAuthorId(103);
		a4.setFullName("Greq Mortension");
		a4.setMobileno(6434);
		a4.setForBookId(2);
		
		Author a5 = new Author();
		a5.setAuthorId(104);
		a5.setFullName("David Oliver");
		a5.setMobileno(72322);
		a5.setForBookId(2);
		*/
		
		Set s = new HashSet();
		s.add(a1);
	//	s.add(a2);
	//	s.add(a3);
	//	s.add(a4);
	//	s.add(a5);
		
		b.setChild(s);
		session.save(b);
		t.commit();
		session.close();
	}

}
