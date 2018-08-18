package com.products;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.MainClass.SessionFactoryDemo;

public class ProductsData {
		public static void main(String[] args)
		{
			ProductsDto dto = new ProductsDto();
			dto.setPname("mouse");
			dto.setPtype("");
			dto.setQuantity(10);
			dto.setPrice(4000);
			
			Session session = SessionFactoryDemo.getSession();
		//	Transaction transaction = SessionFactoryDemo.getTransaction();
			Transaction tx = session.beginTransaction();
			
			session.save(dto);
			tx.commit();
			session.close();
			System.out.println("Successfully done");
		}
}
