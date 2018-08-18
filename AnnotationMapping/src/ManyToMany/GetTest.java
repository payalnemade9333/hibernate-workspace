package ManyToMany;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import ManyToOne.Customers;

public class GetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		
		Query q = session.createQuery("from Categories");
		List<Categories> list = q.list();
		for(Categories cat : list)
		{
			System.out.println(cat.getId()+" "+cat.getCatName());
		}
		t.commit();
		session.close();
	}

}
