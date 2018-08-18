package com.JPQL;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;


import SaveOperation.Employee;

public class AllJPQLQueries {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAservice");
	static EntityManager em = emf.createEntityManager();
	
	public static void GetColumnByJPQL() {
		javax.persistence.Query query = em.createQuery("select deg,salary from Employee");
		List<Object[]> l = query.getResultList();
		Iterator itr = l.iterator();
		
		for(Object[] o : l)
		{
			Employee e = new Employee();
			/*e.setDeg(o[0].toString());
			e.setSalary(Double.parseDouble(o[1].toString()));*/
			System.out.println(o[0].toString()+" "+Double.parseDouble(o[1].toString()));
		}
	}
	public static void SelectByJPQL() {
		/*---------------------------SELECT QUERY-------------------------*/
			javax.persistence.Query query = em.createQuery(" from Employee");
			List<Object[]> l =query.getResultList();
			Iterator itr  = l.iterator();
			Employee e;
			while(itr.hasNext())
			{
				e = (Employee)itr.next();
				System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeg()+" "+e.getSalary());
			}
		}
	public static void UpdateByJPQL() {
		em.getTransaction().begin();
		javax.persistence.Query query = em.createQuery("update Employee set salary =85000 where id=2");
		int result = query.executeUpdate();
		System.out.println(result);
		em.getTransaction().commit();
		
		javax.persistence.Query query2 = em.createQuery("from Employee");
		List<Object[]> list = query2.getResultList();
		Iterator itr = list.iterator();
		Employee e;
		while(itr.hasNext())
		{
			e = (Employee)itr.next();
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeg()+" "+e.getSalary());
		}
	}
	/*public static void DeleteByJPQL() {
		em.getTransaction().begin();
		Query query = em.createQuery("delete Employee where id=5");
		int result = query.executeUpdate();
		System.out.println(result);
		em.getTransaction().commit();
		
		Query query2 = em.createQuery("from Employee");
		List list = query2.getResultList();
		Iterator itr = list.iterator();
		Employee e;
		while(itr.hasNext()) {
				e = (Employee)itr.next();
				System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeg()+" "+e.getSalary());
		}		
	}*/
	public static  void WhereClauseByJPQL() {
		Query query = em.createQuery("from Employee where ename like '%h'");
		List list = query.getResultList();
		Iterator itr  = list.iterator();
		Employee e;
		while(itr.hasNext()) {
			e = (Employee)itr.next();
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeg()+" "+e.getSalary());
		}
	}
	public static void OrderByJPQL() {
		Query query = em.createQuery("from Employee where salary like '1%' order by ename");
		List<Object[]> l = query.getResultList();
		Iterator itr  = l.iterator();
		Employee e;
		while(itr.hasNext()) {
			e = (Employee)itr.next();
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeg()+" "+e.getSalary());
		}
	}
	public static void GroupByJPQL() {
		Query query = em.createQuery("select sum(salary),eid, ename from Employee group by ename");
		List<Employee> list = query.getResultList();
		Iterator itr = list.iterator();
		Object[] col;
		while(itr.hasNext()) {
			col = (Object[])itr.next();
			Double sumSal = (Double)col[0];
			Integer eid = (Integer)col[1];
			String ename = (String)col[2];
			System.out.println(sumSal+" "+eid+" "+ename);
		}
	}
	/*public static void HavingByJPQL()
	{
		Query query = em.createQuery("select p.ename, p.salary,eid from Employee p where salary='4%' group by ename having eid ");
		List<Object[]> list = query.getResultList();
		Iterator itr = list.iterator();
		
		Object[] col;
		while(itr.hasNext()) {
			col = (Object[])itr.next();
			Double sumSal = (Double)col[0];
			Integer eid = (Integer)col[1];
			String ename = (String)col[2];
			System.out.println(sumSal+" "+eid+" "+ename);
		}
	}*/
	
}
