package com.AggregateFunctions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductInsertion {
	public void InsertSQL() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
	ProductsDTO pd = new ProductsDTO();
	pd.setProduct_name("micromax");
	pd.setSupplier_id(18);
	pd.setPrice(14000);
	
	session.save(pd);
	t.commit();
	session.close();
	System.out.println("successfully saved");
	}
}
