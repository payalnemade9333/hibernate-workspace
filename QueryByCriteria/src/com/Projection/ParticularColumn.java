package com.Projection;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.MainClass.SessionFactoryDemo;
import com.products.ProductsDto;

public class ParticularColumn {
		static Session session = SessionFactoryDemo.getSession();
			public static void getColumn()
			{
				Criteria cr = session.createCriteria(ProductsDto.class);
				ProjectionList p = Projections.projectionList();
				p.add(Projections.property("pname"));
				p.add(Projections.property("price"));
				cr.setProjection(p);
				List l =cr.list();
				Iterator itr = l.iterator();
				Object[] obj;
				while(itr.hasNext())
				{
					obj = (Object[])itr.next();
					String pname = (String)obj[0];
					int price = (Integer)obj[1];
					System.out.println(pname + " \t\t "+price);
				}
				
			}
}
