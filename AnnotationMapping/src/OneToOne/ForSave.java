package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ForSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student s = new Student();
		s.setSid(700);
		s.setSname("james");
		s.setGrp("mps");
		
		Address a = new Address();
		a.setAid(1);
		a.setPlace("US");
		
		a.setParent(s);
		Transaction t = session.beginTransaction();
		session.save(a);
		t.commit();
		System.out.println("One to one Annotation done....!!!!");
		session.close();
	}

}
