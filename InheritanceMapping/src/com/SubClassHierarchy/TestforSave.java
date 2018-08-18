package com.SubClassHierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestforSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		CreditCard1 cc = new CreditCard1();
		cc.setPaymentid(1478);
		cc.setAmount(55000.00);
		cc.setCreditcardtype("Gold");
		
		Cheque1 cq = new Cheque1();
		cq.setPaymentid(12331);
		cq.setAmount(45000.00);
		cq.setChequetype("SBI");
		
		session.save(cc);
		session.save(cq);
		tx.commit();
		session.close();

	}

}
