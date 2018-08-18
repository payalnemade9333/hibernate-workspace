package com.Courtlawyer;

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
		
		Court c1 = new Court();
		c1.setCourtno(421);
		c1.setBlock("B1-2");
		c1.setName("Allahabad High Court");
		
		Court c2 = new Court();
		c2.setCourtno(630);
		c2.setBlock("C2-78");
		c2.setName("bombay High Court");
		
		lawyer l1 = new lawyer();
		l1.setLawyerid(45879);
		l1.setName("ramesh");
		l1.setPost("offficer");
		l1.setStatus("agree");
		
		lawyer l2 = new lawyer();
		l2.setLawyerid(15236);
		l2.setName("dinesh");
		l2.setPost("clk");
		l2.setStatus("disagree");
		
		Set s =new HashSet();
	       s.add(l1);
	       s.add(l2);
	       c1.setLawyer(s);
	       c2.setLawyer(s);
	       
	       Transaction t = session.beginTransaction();
			 
           session.save(c1);
           session.save(c2);

           t.commit();

           session.close();
           System.out.println("Many To Many Bi-Directional is Done..!!");
	}

}
