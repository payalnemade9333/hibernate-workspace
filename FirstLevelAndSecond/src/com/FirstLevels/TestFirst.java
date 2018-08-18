package com.FirstLevels;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestFirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			Configuration cfg=new Configuration().configure();
			
			SessionFactory factory=cfg.buildSessionFactory();
				
				Session session = factory.openSession();
				for(int i=0; i<=10; i++)
				{
				EmployeeDto emp = (EmployeeDto)session.load(EmployeeDto.class, 3);
				Thread.sleep(10000);
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
				}
				session.close();
				
				
	}

}
