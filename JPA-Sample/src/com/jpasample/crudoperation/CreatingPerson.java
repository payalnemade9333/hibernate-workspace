package com.jpasample.crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreatingPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAservice");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Person p = new Person();
		p.setName("mahesh");
		p.setContactno(78465121);
		p.setAge(45);
		p.setAddress("7898,nbh/gj,46546");
		
		Person p1 = new Person();
		p1.setName("dinesh");
		p1.setContactno(15612);
		p1.setAge(36);
		p1.setAddress("njsnhjhj /nfked/646");
		
		Person p2 = new Person();
		p2.setName("ramesh");
		p2.setContactno(7896302);
		p2.setAge(45);
		p2.setAddress("lsmflflk /554645");
		
		Person p3 = new Person();
		p3.setName("raju");
		p3.setContactno(78930);
		p3.setAge(10);
		p3.setAddress("powder gali indore");
		
		em.persist(p);
		em.persist(p1);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("succeccfully done.....!!!!!!!!!!!!!");
		em.close();
	}

}
