package Filters;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;
public class MainFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Filter filter = session.enableFilter("employeeFilter");
		filter.setParameter("salary", 4000);
		Query query = session.createQuery("from Employee");
		List list = query.list();
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			System.out.println(e.getId()+"\t\t "+e.getName()+"\t\t "+e.getSalary()+"\t\t "+e.getDeptno());
		}
		session.disableFilter("employeeFilter");
	}

}
