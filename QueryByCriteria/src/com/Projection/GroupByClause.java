package com.Projection;

import java.util.Iterator;
import java.util.List;

import javax.persistence.OrderBy;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.MainClass.SessionFactoryDemo;
import com.products.ProductsDto;

public class GroupByClause {
	static Session session = SessionFactoryDemo.getSession();
		public static void getGroupBy() {
				Criteria cr = session.createCriteria(ProductsDto.class);
				ProjectionList p = Projections.projectionList();
				
				p.add(Projections.sum("price"));
				p.add(Projections.avg("quantity"));
				p.add(Projections.groupProperty("ptype"));
				cr.addOrder(Order.desc("ptype"));
				cr.setProjection(p);
				List<Object[]> list = cr.list();
				Iterator itr = list.iterator();
			
				Object[] col;
				while(itr.hasNext())
				{
					col = (Object[])itr.next();
					int price  = (Integer)col[0]; 
					double quantity  = (Double)col[1]; 
					String ptype = (String)col[2];
					System.out.println(" "+price + "  "+quantity+ " "+ptype);
				}
		}
	//	public static void 
}
