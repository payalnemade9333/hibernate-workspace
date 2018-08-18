package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Address a = (Address)session.get(Address.class, 1);
		a.setPlace("bhopal");
		session.save(a);
		t.commit();
		System.out.println("Update is done......!!!!!!!!!1");
		session.close();
		
	}

}
