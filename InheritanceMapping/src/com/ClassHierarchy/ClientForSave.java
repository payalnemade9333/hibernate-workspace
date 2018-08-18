package com.ClassHierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
			CreditCard c = new CreditCard();
				c.setPaymentId(10);
				c.setAmount(2500.00);
				c.setCreditCardType("Visa");
				
			Cheque c1=new Cheque();
				c1.setPaymentId(11);
				c1.setAmount(2600.00);
				c1.setChequeType("ICICI");
		
		Transaction tx = session.beginTransaction();
				session.save(c);
				session.save(c1);
				System.out.println("Object saved successfully.....!!");
				tx.commit();

	}

}
