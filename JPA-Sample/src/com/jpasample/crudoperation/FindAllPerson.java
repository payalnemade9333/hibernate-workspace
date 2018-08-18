package com.jpasample.crudoperation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindAllPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAservice");
		EntityManager em = emf.createEntityManager();

		javax.persistence.Query q = em.createQuery("from Person");
		List<Person> l = q.getResultList();
		Iterator itr = l.iterator();
		Person p;
		while(itr.hasNext())
		{
			p = (Person)itr.next();
			System.out.println("Person id : "+p.getId());
			System.out.println(" Person name : "+p.getName());
			System.out.println("Person address : "+ p.getAddress());
			System.out.println("Person phoneno : " +p.getContactno());
			System.out.println("Person age : "+p.getAge());
		}
		
		
	}

}
