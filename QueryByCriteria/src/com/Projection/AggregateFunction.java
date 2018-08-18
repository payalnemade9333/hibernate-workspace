package com.Projection;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.MainClass.SessionFactoryDemo;
import com.products.ProductsDto;

public class AggregateFunction {
		static Session session = SessionFactoryDemo.getSession();
			public static void getCount()
			{
				Criteria cr = session.createCriteria(ProductsDto.class);
			//	cr.setProjection(Projections.rowCount());
				cr.setProjection(Projections.count("price"));
				cr.setProjection(Projections.countDistinct("ptype"));
				List list = cr.list();
			//	System.out.println("rowCount    " +list.get(0));
			//	System.out.println("Count" +list.get(0));
				System.out.println("CountDistinct" +list.get(0));
			}
			
			public static void getAvg()
			{
				Criteria cr = session.createCriteria(ProductsDto.class);
				cr.setProjection(Projections.avg("price"));
				List list = cr.list();
				System.out.println("Average :   "+list.get(0));
			}
			
			public static void getSum()
			{
				Criteria cr = session.createCriteria(ProductsDto.class);
				cr.setProjection(Projections.sum("price"));
				List list = cr.list();
				System.out.println("SUM :   "+list.get(0));
			}
			
			public static void getMin()
			{
				Criteria cr = session.createCriteria(ProductsDto.class);
				cr.setProjection(Projections.min("price"));
				List list = cr.list();
				System.out.println("MINIMUM :   "+list.get(0));
			}
			
			public static void getMax()
			{
				Criteria cr = session.createCriteria(ProductsDto.class);
				cr.setProjection(Projections.max("price"));
				List list = cr.list();
				System.out.println("MAXIMUM :   "+list.get(0));
			}
			
}
