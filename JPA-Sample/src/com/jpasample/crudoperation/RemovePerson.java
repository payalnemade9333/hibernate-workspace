package com.jpasample.crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemovePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAservice");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Person p = (Person)em.find(Person.class, 1);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Removing Done..............!!!!!!!!!!!1");
		em.close();
		
	}

}
