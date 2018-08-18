package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import OneToOne.Address;

public class DeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Categories a = (Categories)session.get(Categories.class, 2);
		session.delete(a);
		t.commit();
		System.out.println("Deleting is Done......!!!!!!!1");
		session.close();
	}

}
