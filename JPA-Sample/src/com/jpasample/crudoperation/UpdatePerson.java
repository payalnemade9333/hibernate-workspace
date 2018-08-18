package com.jpasample.crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAservice");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Person p = (Person)em.find(Person.class, 3);
		
		//before update
		System.out.println(p.getContactno());
		p.setContactno(14563289);
		em.getTransaction().commit();
		em.merge(p);
		
		//after update
		System.out.println(p.getContactno());
		em.close();
		
	}

}
