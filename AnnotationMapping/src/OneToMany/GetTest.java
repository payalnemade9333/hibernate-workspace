package OneToMany;

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
		Query q = session.createQuery("from Vendor");
		List<Vendor> list = q.list();
		
		for(Vendor vendor : list)
		{
			System.out.println(vendor.getVid()+" "+vendor.getVendorName());
		}
		t.commit();
		session.close();
	}

}
