package com.ConcreteClassHierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestforSave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		/*CreditCard2 cc = new CreditCard2();
		cc.setPaymentid(12321);
		cc.setAmount(55000.00);
		cc.setCreditcardtype("Gold");*/
		
		CreditCard2 cc = new CreditCard2();
		cc.setPaymentid(12331);
		cc.setAmount(45000.00);
		cc.setCreditCardType("platinum");
		
	/*	Cheque2 cq = new Cheque2();
		cq.setPaymentid(12331);
		cq.setAmount(45000.00);
		cq.setChequetype("SBI");*/
		
		session.save(cc);
	//	session.save(cq);
		tx.commit();
		session.close();
	}

}
