package com.PassportPerson;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		// TODO Auto-generated method stub
		Person person = new Person();
        person.setPersonId(1001);
        person.setName("payal");
        
        Passport passport = new Passport();
        passport.setPassportNumber(789456133);
        passport.setExpireDate(new Date());
        passport.setIssudDate(new Date());
        passport.setPerson(person);
        
        Transaction transaction = session.beginTransaction();
        session.save(passport);
        transaction.commit();
        session.close();
	}

}
