package com.Payal;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
	
	
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
	//	------To insert the data(select and insert query will be execute)-----
		/*	userDto u = new userDto();
		u.setFirstName("harshit");
		u.setLastName("joshi");
		session.save(u);	*/
		
	/*	u.setId(3);
		u.setFirstName("payal");
		u.setLastName("nemade");
      session.update(u);		*/
		
	/*	u.setId(4);
	  session.delete(u);	*/
		
	//	------get(To retrive the Data)------
		userDto u = (userDto)session.get(userDto.class, 5);
		System.out.println(u.getId());
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		
		tx.commit();
		session.close();
		
		System.out.println("successfully saved");
	}
}