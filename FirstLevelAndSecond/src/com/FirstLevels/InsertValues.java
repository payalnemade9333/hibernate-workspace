package com.FirstLevels;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertValues {
	
	public static void main(String[] args) {
	
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		EmployeeDto emp = new EmployeeDto();
		emp.setName("nilm");
		emp.setSalary(4500);
		session.save(emp);
		tx.commit();
		session.close();
		
		System.out.println("successfully saved");
	}
}