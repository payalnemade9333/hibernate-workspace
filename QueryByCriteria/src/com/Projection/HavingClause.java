package com.Projection;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.MainClass.SessionFactoryDemo;
import com.products.ProductsDto;

public class HavingClause {
	static Session session = SessionFactoryDemo.getSession();
	public static void getHavingClause() {
			Criteria cr = session.createCriteria(ProductsDto.class);
			ProjectionList p = Projections.projectionList();
			
			p.add(Projections.count("ptype"));
			p.add(Projections.groupProperty("ptype"));
			cr.add(Restrictions.eq("ptype", "electric"));
			cr.setProjection(p);
			
			List list = cr.list();
			Iterator itr=list.iterator();
			Object[] row;
			while(itr.hasNext())
			{
				row=(Object[])itr.next();
				Integer cnt=(Integer)row[0];
				System.out.println(cnt);
			}
		}
}