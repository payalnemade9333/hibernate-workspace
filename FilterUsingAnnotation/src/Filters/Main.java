package Filters;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee e = new Employee();
		e.setName("chandra");
		e.setDeptno(101);
		e.setSalary(6000);
		
		Employee e1 = new Employee();
		e1.setName("shakhar");
		e1.setDeptno(101);
		e1.setSalary(8000);
		
		Employee e2 = new Employee();
		e2.setName("rahul");
		e2.setDeptno(105);
		e2.setSalary(4000);
		
		Employee e3 = new Employee();
		e3.setName("mahesh");
		e3.setDeptno(103);
		e3.setSalary(5000);
		
		Employee e4 = new Employee();
		e4.setName("vinay");
		e4.setDeptno(101);
		e4.setSalary(4000);
		
		Employee e5 = new Employee();
		e5.setName("vijay");
		e5.setDeptno(105);
		e5.setSalary(3000);
		
		Transaction t = session.beginTransaction();
		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		System.out.println("Object Saved successfully using annotation..........!!!!!!!!!!!");
		t.commit();
		session.close();
	}

}
