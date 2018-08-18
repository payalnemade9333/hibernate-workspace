package TablePerConcreteClass;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Person p = new Person();
		p.setPersonid(1);
		p.setFirstname("balveer");
		p.setLastname("sharma");
		session.save(p);
		
		Employees e = new Employees();
		e.setPersonid(2);
		e.setFirstname("harshit");
		e.setLastname("joshi");
		e.setDepartmentname("marketing");
		e.setJoiningdate(new Date());
		session.save(e);
		
		Owner o = new Owner();
		o.setPersonid(3);
		o.setFirstname("vanky");
		o.setLastname("jaiswal");
		o.setStocks(300L);
		o.setPartnershipstack(40L);
		session.save(o);
		
		Transaction t = session.beginTransaction();
		session.save(p);
		session.save(e);
		session.save(o);
		t.commit();
		session.close();
		System.out.println("Done");
	}

}
