package AggregateFunction;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

public class AggreFunction {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAservice");
	static EntityManager em = emf.createEntityManager();
	
		// TODO Auto-generated method stub
		public static void countSQL()
		{
			javax.persistence.Query q = em.createNativeQuery("select count(*) from empjpa");
			List l = q.getResultList();
			Iterator itr = l.iterator();
			BigInteger cnt = (BigInteger)itr.next();
			System.out.println(cnt);
		}
		
		public static void SumSQL()
		{
			javax.persistence.Query query = em.createNativeQuery("select sum(salary) from empjpa");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double sum = (Double)itr.next();
			System.out.println(sum);
		}
		public static void AvgSQL()
		{
			javax.persistence.Query query = em.createNativeQuery("select avg(salary) from empjpa");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double d = (Double)itr.next();
			System.out.println(d);
		}
		
		public static void MinSQL()
		{
			javax.persistence.Query query = em.createNativeQuery("select min(salary) from empjpa");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double d = (Double)itr.next();
			System.out.println(d);
		}
		
		public static void MaxSQL()
		{
			javax.persistence.Query query = em.createNativeQuery("select max(salary) from empjpa");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double sum = (Double)itr.next();
			System.out.println(sum);
		}
		
		public static void countJPQL()
		{
			javax.persistence.Query q = em.createQuery("select count(*) from Employee");
			List l = q.getResultList();
			Iterator itr = l.iterator();
			Long cnt = (Long)itr.next();
			System.out.println(cnt);
		}
		
		public static void SumJPQL()
		{
			javax.persistence.Query query = em.createQuery("select sum(salary) from Employee");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double sum = (Double)itr.next();
			System.out.println(sum);
		}
		public static void AvgJPQL()
		{
			javax.persistence.Query query = em.createQuery("select avg(salary) from Employee");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double d = (Double)itr.next();
			System.out.println(d);
		}
		
		public static void MinJPQL()
		{
			javax.persistence.Query query = em.createQuery("select min(salary) from Employee");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double d = (Double)itr.next();
			System.out.println(d);
		}
		
		public static void MaxJPQL()
		{
			javax.persistence.Query query = em.createQuery("select max(salary) from Employee");
			List l = query.getResultList();
			Iterator itr = l.iterator();
			Double sum = (Double)itr.next();
			System.out.println(sum);
		}
		
		public static void main(String[] args) {
			
			System.out.println("---------------------------------Count----------------------------------------------");
			AggreFunction.countSQL();
			System.out.println("---------------------------------SUM----------------------------------------------");
			AggreFunction.SumSQL();
			System.out.println("---------------------------------Average----------------------------------------------");
			AggreFunction.AvgSQL();
			System.out.println("---------------------------------Mininum----------------------------------------------");
			AggreFunction.MinSQL();
			System.out.println("---------------------------------Maximum----------------------------------------------");
			AggreFunction.MaxSQL();
			
			System.out.println("----------------------------------------JPQL-------------------------------------------");
			
			System.out.println("---------------------------------Count----------------------------------------------");
			AggreFunction.countJPQL();
			System.out.println("---------------------------------SUM----------------------------------------------");
			AggreFunction.SumJPQL();
			System.out.println("---------------------------------Average----------------------------------------------");
			AggreFunction.AvgJPQL();
			System.out.println("---------------------------------Mininum----------------------------------------------");
			AggreFunction.MinJPQL();
			System.out.println("---------------------------------Maximum----------------------------------------------");
			AggreFunction.MaxJPQL();
		}

}
