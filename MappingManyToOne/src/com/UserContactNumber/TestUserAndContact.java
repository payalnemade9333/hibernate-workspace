package com.UserContactNumber;

import javax.transaction.Synchronization;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserAndContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		User u = new User();
		u.setId(102);
		u.setName("Ajay");
		
		/*Contact c1 = new Contact();
		c1.setId(601);
		c1.setName("Mahesh");
		c1.setPhone(78945);
		c1.setMail("m@gmail.com");
		c1.setParentObjects(u);
		
		Contact c2 = new Contact();
		c2.setId(602);
		c2.setName("Suresh");
		c2.setPhone(147896);
		c2.setMail("suresh@gmail.com");
		c2.setParentObjects(u);
		
		Contact c3 = new Contact();
		c3.setId(603);
		c3.setName("Jayesh");
		c3.setPhone(147369);
		c3.setMail("jayesh@gmail.com");
		c3.setParentObjects(u);
		
		Contact c4 = new Contact();
		c4.setId(604);
		c4.setName("Ganesh");
		c4.setPhone(777192);
		c4.setMail("ganesh@gmail.com");
		c4.setParentObjects(u);
		
		Contact c5 = new Contact();
		c5.setId(605);
		c5.setName("dinesh");
		c5.setPhone(159874);
		c5.setMail("dinesh@gmail.com");
		c5.setParentObjects(u);*/
		
		Contact c7 = new Contact();
		c7.setId(608);
		c7.setName("shyam");
		c7.setPhone(777632);
		c7.setMail("shym@gmail.com");
		c7.setParentObjects(u);
		
		Transaction t = session.beginTransaction();
			/*session.save(c1);
			session.save(c2);
			session.save(c3);
			session.save(c4);
			session.save(c5);
			session.save(c6);*/
			session.save(c7);
		t.commit();
		session.close();
		System.out.println("Many to One is Done....!!!!!");
	}
}
