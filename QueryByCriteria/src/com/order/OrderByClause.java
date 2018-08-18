package com.order;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.MainClass.SessionFactoryDemo;
import com.products.ProductsDto;

public class OrderByClause {
			static Session session = SessionFactoryDemo.getSession();
				public static void getOrder()
				{
					Criteria cr = session.createCriteria(ProductsDto.class);
					cr.addOrder(Order.desc("pname"));
			//		cr.addOrder(Order.asc("quantity"));
					List list = cr.list();
					Iterator itr = list.iterator();
					ProductsDto dto;
					while(itr.hasNext())
					{
						dto = (ProductsDto)itr.next();
						System.out.println(dto.getPid()+"\t\t"+dto.getPname()+"\t\t "+dto.getPtype()+"\t\t "+dto.getQuantity()+"\t\t "+dto.getPrice());
					}
				}
}
