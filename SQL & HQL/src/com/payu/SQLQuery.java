package com.payu;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SQLQuery {
	//	static SessionFactory sessionFactory = SessionFactoryDemo.getSessionFactory(); 
		static Session session = SessionFactoryDemo.getSession();
	//	static Transaction t = SessionFactoryDemo.getTransaction();
		public static void SelectBySQL() {
		/*---------------------------SELECT QUERY-------------------------*/
			Query query = session.createSQLQuery("select * from employee");
			List<Object[]> l =query.list();
			Iterator itr  = l.iterator();
			for(Object[] o : l)
			{
				PartDto dto = new PartDto();
				dto.setId(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				dto.setAge(Integer.parseInt(o[2].toString()));
				dto.setSalary(Integer.parseInt(o[3].toString()));
				dto.setAddress(o[4].toString());
				
				System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAge()+" "+dto.getSalary()+" "+dto.getAddress());
			}
		}
		
		public static void SelectByHQl() {	
			Query query = session.createQuery("from PartDto");
			List list = query.list();
			Iterator itr = list.iterator();
			
			PartDto dto;
			while(itr.hasNext())
			{
				dto = (PartDto)itr.next();
				System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAge()+" "+dto.getAddress()+" "+dto.getSalary());
			}
		}
		public static void SelectByCriteries() {
			Criteria crit = session.createCriteria(PartDto.class);
			List list = crit.list();
			Iterator itr = list.iterator();
			PartDto dto;
			while(itr.hasNext())
			{
				dto = (PartDto)itr.next();
				System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAge()+" "+dto.getAddress()+" "+dto.getSalary());
			}
		}
		
		public static void UpdateBySQL() {
			/*---------------------------UPDATE QUERY-------------------------*/	
			session.beginTransaction();
			Query query = session.createSQLQuery("update employee set salary =85000 where id=2");
			int result = query.executeUpdate();
			System.out.println(result);			
			session.getTransaction().commit();
			
			Query query2 = session.createSQLQuery("select * from employee");
			List<Object[]> list = query2.list();
			for(Object[] o : list)
			{
				PartDto dto = new PartDto();
				dto.setId(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				dto.setAge(Integer.parseInt(o[2].toString()));
				dto.setSalary(Integer.parseInt(o[3].toString()));
				dto.setAddress(o[4].toString());
				System.out.println(dto.getId()+" "+dto.getName()+" "+ dto.getAge()+"  "+dto.getSalary()+" "+dto.getAddress());
			}
			
		}
		public static void UpdateByHQL() {
			session.beginTransaction();
			Query query = session.createQuery("update PartDto set salary =33333 where id=1");
			int result = query.executeUpdate();
			System.out.println(result);
			session.getTransaction().commit();
			
			Query query2 = session.createQuery("from PartDto");
			List list = query2.list();
			Iterator itr = list.iterator();
			PartDto dto;
			while(itr.hasNext()) {
					dto = (PartDto)itr.next();
					System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAddress()+" "+dto.getAge()+" "+dto.getSalary());
			}
		}
		public static void DeleteByHQl() {
			session.beginTransaction();
			Query query = session.createQuery("delete PartDto where id=5");
			int result = query.executeUpdate();
			System.out.println(result);
			session.getTransaction().commit();
			
			Query query2 = session.createQuery("from PartDto");
			List list = query2.list();
			Iterator itr = list.iterator();
			PartDto dto;
			while(itr.hasNext()) {
					dto = (PartDto)itr.next();
					System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAddress()+" "+dto.getAge()+" "+dto.getSalary());
			}		
		}
		public static void SelectTopBySQL()
		{
			Query query = session.createSQLQuery("select * from employee limit 3");
			List<Object[]> list = query.list();
			Iterator itr = list.iterator();
			
			for(Object[] o : list)
			{
				PartDto dto = new PartDto();
				dto.setId(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				dto.setAge(Integer.parseInt(o[2].toString()));
				dto.setSalary(Integer.parseInt(o[3].toString()));
				dto.setAddress(o[4].toString());
				System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getAge()+" "+dto.getSalary()+" "+dto.getAddress());
			}
		}
		public static void ANDBySQL() {
			Query query = session.createSQLQuery("select * from employee where age=40 AND salary=33333");
			List<Object[]> l = query.list();
			Iterator itr = l.iterator();
			
			for(Object[] o : l)
			{
				PartDto dto = new PartDto();
				dto.setId(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				dto.setAge(Integer.parseInt(o[2].toString()));
				dto.setSalary(Integer.parseInt(o[3].toString()));
				dto.setAddress(o[4].toString());
				System.out.println(dto.getId()+" "+dto.getName()+" "+ dto.getAge()+"  "+dto.getSalary()+" "+dto.getAddress());
			}
		}
		public static void ANDByHQL() {
			Query query = session.createQuery("from PartDto  where age=40 and salary=33333");
			List l = query.list();
			Iterator itr = l.iterator();
			
			//	Object[] column;
				System.out.println("id" + "\t" + "name" + "\t" + "age" + "\t" + "salary");
			while(itr.hasNext())
				{
					PartDto dto = new PartDto();
					dto= (PartDto)itr.next();
					System.out.println(dto.getId()+"\t "+dto.getName()+"\t "+dto.getAge()+"\t "+dto.getAddress()+" \t"+dto.getSalary());
				}
			}
		
		public static void ORBySQL() {
			Query query = session.createSQLQuery("select * from employee where age=40 or salary=33333");
			List<Object[]> l = query.list();
			Iterator itr = l.iterator();
			
			for(Object[] o : l)
			{
				PartDto dto = new PartDto();
				dto.setId(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				dto.setAge(Integer.parseInt(o[2].toString()));
				dto.setSalary(Integer.parseInt(o[3].toString()));
				dto.setAddress(o[4].toString());
				System.out.println(dto.getId()+" "+dto.getName()+" "+ dto.getAge()+"  "+dto.getSalary()+" "+dto.getAddress());
			}
		}
		
		public static void ORByHQL() {
			Query query = session.createQuery("from PartDto  where age=40 and salary=33333");
			List l = query.list();
			Iterator itr = l.iterator();
			
			//	Object[] column;
				System.out.println("id" + "\t" + "name" + "\t" + "age" + "\t" + "salary");
			while(itr.hasNext())
				{
					PartDto dto = new PartDto();
					dto= (PartDto)itr.next();
					System.out.println(dto.getId()+"\t "+dto.getName()+"\t "+dto.getAge()+"\t "+dto.getAddress()+" \t"+dto.getSalary());
				}
			}
		
		public static void NotBySQL() {
			Query query = session.createSQLQuery("select * from employee where not age=40 or salary=33333");
			List<Object[]> l = query.list();
			Iterator itr = l.iterator();
			
			for(Object[] o : l)
			{
				PartDto dto = new PartDto();
				dto.setId(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				dto.setAge(Integer.parseInt(o[2].toString()));
				dto.setSalary(Integer.parseInt(o[3].toString()));
				dto.setAddress(o[4].toString());
				System.out.println(dto.getId()+" "+dto.getName()+" "+ dto.getAge()+"  "+dto.getSalary()+" "+dto.getAddress());
			}
		}
		public static void NotByHQL() {
			Query query = session.createQuery("from PartDto  where age=40 and salary=33333");
			List l = query.list();
			Iterator itr = l.iterator();
			
			//	Object[] column;
				System.out.println("id" + "\t" + "name" + "\t" + "age" + "\t" + "salary");
			while(itr.hasNext())
				{
					PartDto dto = new PartDto();
					dto= (PartDto)itr.next();
					System.out.println(dto.getId()+"\t "+dto.getName()+"\t "+dto.getAge()+"\t "+dto.getAddress()+" \t"+dto.getSalary());
				}
			}
		public static void GetColumnBySQL() {
			Query query = session.createSQLQuery("select id,name from employee");
			List<Object[]> l = query.list();
			Iterator itr = l.iterator();
			
			for(Object[] o : l)
			{
				PartDto dto = new PartDto();
				dto.setId(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				System.out.println(dto.getId()+"  "+dto.getName());
			}
		}
		public static void GetColumnByHQL() {
			Query query = session.createQuery("select p.id,p.name from PartDto p");
			List l = query.list();
			Iterator itr = l.iterator();
			
				Object[] column;
				System.out.println("id"+ "\t"+"Name");
			while(itr.hasNext())
				{
					column = (Object[])itr.next();
					Integer id = (Integer)column[0];
					String name = (String)column[1];
					System.out.println(id +"   "+ name);
				}
		}
		public static void CriteriaSelectAttribute() {
		//	Query query = session.createQuery("select p.id,p.name from PartDto p");
			Criteria cr = session.createCriteria(PartDto.class);
			ProjectionList p = Projections.projectionList();
			p.add(Projections.property("id"));
			p.add(Projections.property("name"));
			cr.setProjection(p);
			List l = cr.list();
			Iterator itr = l.iterator();
			
				Object[] column;
				System.out.println("id"+ "\t"+"Name");
			while(itr.hasNext())
				{
					column = (Object[])itr.next();
					Integer id = (Integer)column[0];
					String name = (String)column[1];
					System.out.println(id +"   "+ name);
				}
		}

	public static void WhereClauseBySQL(){
			Query query = session.createSQLQuery("select * from employee where name like 'r%'");
			List<Object[]> l = query.list();
			Iterator itr = l.iterator();
			
			for(Object[] o : l)
			{
				PartDto dto = new PartDto();
				dto.setName(o[1].toString());
				System.out.println(dto.getName());
			}
		}
	public static  void WhereClauseByHQL() {
			Query query = session.createQuery("from PartDto where ename like 'raju'");
			List list = query.list();
			Iterator itr  = list.iterator();
			PartDto dto;
			while(itr.hasNext())
			{
				dto= (PartDto)itr.next();
				System.out.println(dto.getId()+"\t "+dto.getName()+"\t "+dto.getAge()+"\t "+dto.getAddress()+" \t"+dto.getSalary());
			}
	}
	public static  void CriteriaLike() {
		Criteria crit = session.createCriteria(PartDto.class);
	//	crit.add(Restrictions.like("name", "r%"));
		crit.add(Restrictions.eq("id", 2));
		List list = crit.list();
		Iterator itr  = list.iterator();
		PartDto dto;
		while(itr.hasNext())
		{
			dto= (PartDto)itr.next();
			System.out.println(dto.getId()+"\t "+dto.getName()+"\t "+dto.getAge()+"\t "+dto.getAddress()+" \t"+dto.getSalary());
		}
}
	public static void OrderBySQL() {
			Query query = session.createSQLQuery("select * from employee where age like '1%' order by name");
			List<Object[]> l = query.list();
			Iterator itr  = l.iterator();
			
			for(Object[] o : l)
			{
				PartDto dto = new PartDto();
				dto.setAge(Integer.parseInt(o[0].toString()));
				dto.setName(o[1].toString());
				System.out.println(dto.getAge()+" "+dto.getName());
			}
	}
	public static void OrderByHQL() {
			Query query = session.createQuery("from PartDto where salary like '7%' order by name");
			List list = query.list();
			Iterator itr = list.iterator();
			PartDto obj;
			while(itr.hasNext())
			{
				obj = (PartDto)itr.next();
				System.out.println(obj.getSalary()+" "+ obj.getName());
			}
		 }
	public static void GroupBySQL() {
		Query query = session.createSQLQuery("select sum(salary),address from employee group by address");
		List<Object[]> list = query.list();
		Iterator itr = list.iterator();
		
		for(Object[] o : list)
		{
			PartDto dto = new PartDto();
			dto.setSalary(Integer.parseInt(o[0].toString()));
			dto.setAddress(o[1].toString());
			System.out.println(dto.getSalary()+"  "+dto.getAddress());
		}
	}
	public static void GroupByHQL() {
		Query query = session.createQuery("select sum(salary),address from PartDto group by address");
		List list = query.list();
		Iterator itr = list.iterator();
		
		Object[] column;
		while(itr.hasNext())
		{
			column = (Object[])itr.next();
			long salary = (Long)column[0];
			String address = (String)column[1];
			System.out.println(salary +"   "+ address);
		}
	}
	public static void HavingBySQL()
	{
		Query query = session.createSQLQuery("select p.name, p.address,id from employee p where address='saket' group by address having id ");
		List<Object[]> list = query.list();
		Iterator itr = list.iterator();
		
		for(Object[] o : list)
		{
			PartDto dto = new PartDto();
			dto.setName(o[0].toString());
			dto.setAddress(o[1].toString());
			dto.setId(Integer.parseInt(o[2].toString()));
			System.out.println(dto.getId()+" "+dto.getName()+"  "+dto.getAddress());
		}
	}
	public static void HavingByHQL()
	{
		Query query = session.createQuery("select count(name),id from PartDto group by age having age=15 ");
		List<Object[]> list = query.list();
		Iterator itr = list.iterator();
		
			Object[] obj;
			while(itr.hasNext())
			{
				obj = (Object[])itr.next();
				long name = (Long)obj[0];
			//	int id = (Integer)obj[1];
			//	int age = (Integer)obj[2];
			}
	}
}
