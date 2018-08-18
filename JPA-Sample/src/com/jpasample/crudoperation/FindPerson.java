package com.jpasample.crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAservice");
		EntityManager em = emf.createEntityManager();
		
		Person p = (Person)em.find(Person.class, 2);
		System.out.println("Person  id = " +p.getId()+" "+"Person address =" +p.getAddress()+" "+"Person age =" +p.getAge()+"Persom name =" +p.getName()+"person phone no ="+p.getContactno());
	}

}
