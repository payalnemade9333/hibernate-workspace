package com.AggregateFunctions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.helpers.QuietWriter;
import org.apache.xerces.impl.dv.xs.DecimalDV;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.payu.PartDto;
import com.payu.SessionFactoryDemo;

public class AggreFunctions {
	static Session session = SessionFactoryDemo.getSession();
	//-------------------COUNT FUNCTION----------------------	
		public static void countSQL()
		{
			Query query = session.createSQLQuery("select count(*) from products");
			List l = query.list();
			Iterator itr = l.iterator();
			BigInteger cnt = (BigInteger)itr.next();
			System.out.println(cnt);
		}
		public static void countHQL()
		{
			Query query = session.createQuery("select count(*) from ProductsDTO");
			List<Object[]> l = query.list();
			Iterator itr = l.iterator();
			Long cnt = (Long)itr.next();
			System.out.println(cnt);
		}	
		public static void countCriteria()
		{
			Criteria cr = session.createCriteria(ProductsDTO.class);
			ProjectionList p = Projections.projectionList();
		//	p.add(Projections.count("id"));
			p.add(Projections.rowCount());
		//	p.add(Projections.groupProperty("product_name"));
			cr.setProjection(p);
			List<Object[]> l = cr.list();
			System.out.println(l.get(0));
		}	
	//-------------------COUNT DISTINCT FUNCTION----------------------
		public static void countDistinctSQL()
		{
			Query query = session.createSQLQuery("select count(distinct price,product_name) from products");
			List l = query.list();
			Iterator itr = l.iterator();
			BigInteger cnt = (BigInteger)itr.next();
			System.out.println(cnt);
		}
		//-------------------AVERAGE FUNCTION----------------------	
		public static void AvgSQL()
		{
			Query query = session.createSQLQuery("select avg(price) from products");
			List l = query.list();
			Iterator itr = l.iterator();
			BigDecimal avg = (BigDecimal)itr.next();
			System.out.println(avg);
		}
		public static void AvgHQL()
		{
			Query query = session.createQuery("select avg(price) from ProductsDTO");
			List l = query.list();
			Iterator itr = l.iterator();
			Double avg = (Double)itr.next();
			System.out.println(avg);
		}
		public static void AvgCriteria()
		{
			//Query query = session.createQuery("select avg(price) from ProductsDTO");
			Criteria cr = session.createCriteria(ProductsDTO.class);
			ProjectionList p = Projections.projectionList();
			p.add(Projections.avg("price"));
			cr.setProjection(p);
			List l = cr.list();
			System.out.println(l.get(0));
		}
		//-------------------SUM FUNCTION----------------------
		public static void SumSQL()
		{
			Query query = session.createSQLQuery("select sum(price) from products");
			List l = query.list();
			Iterator itr = l.iterator();
			BigDecimal sum = (BigDecimal)itr.next();
			System.out.println(sum);
		}
		public static void SumHQL()
		{
			Query query= session.createQuery("select sum(price) from ProductsDTO");
			List l = query.list();
			Iterator itr = l.iterator();
			Long sum = (Long)itr.next();
			System.out.println(sum);
		}
		public static void SumCriteria()
		{
			Criteria cr = session.createCriteria(ProductsDTO.class);
			ProjectionList p = Projections.projectionList();
			p.add(Projections.sum("price"));
			cr.setProjection(p);
			List l = cr.list();
			Iterator itr = l.iterator();
			System.out.println(l.get(0));
		}
		//-------------------MINIMUM FUNCTION----------------------
		public static void MinSQL()
		{
			Query query = session.createSQLQuery("select min(price) from products");
			List l = query.list();
			Iterator itr = l.iterator();
			int sum = (Integer)itr.next();
			System.out.println(sum);
		}
		public static void MinHQL()
		{
			Query query= session.createQuery("select min(price) from ProductsDTO");
			List l = query.list();
			Iterator itr = l.iterator();
			int sum = (Integer)itr.next();
			System.out.println(sum);
		}
		public static void MinCriteria()
		{
			Criteria cr = session.createCriteria(ProductsDTO.class);
			ProjectionList p = Projections.projectionList();
			p.add(Projections.min("price"));
			cr.setProjection(p);
			List l = cr.list();
			Iterator itr = l.iterator();
			System.out.println(l.get(0));
		}
		//-------------------MAXIMUM FUNCTION----------------------
		public static void MaxSQL()
		{
			Query query = session.createSQLQuery("select max(price) from products");
			List l = query.list();
			Iterator itr = l.iterator();
			int sum = (Integer)itr.next();
			System.out.println(sum);
		}
		public static void MaxHQL()
		{
			Query query= session.createQuery("select max(price) from ProductsDTO");
			List l = query.list();
			Iterator itr = l.iterator();
			int sum = (Integer)itr.next();
			System.out.println(sum);
		}
		public static void MaxCriteria()
		{
			Criteria cr = session.createCriteria(ProductsDTO.class);
			ProjectionList p = Projections.projectionList();
			p.add(Projections.max("price"));
			cr.setProjection(p);
			List l = cr.list();
			Iterator itr = l.iterator();
			System.out.println(l.get(0));
		}

}
