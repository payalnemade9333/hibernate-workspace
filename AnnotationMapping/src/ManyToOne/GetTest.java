package ManyToOne;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Query q = session.createQuery("from Customers");
		List<Customers> list = q.list();
		for(Customers cust : list)
		{
			System.out.println(cust.getCustomerName()+" "+cust.getCid());
		}
		t.commit();
		session.close();
	}

}
