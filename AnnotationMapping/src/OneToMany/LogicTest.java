package OneToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Vendor v = new Vendor();
		v.setVid(101);
		v.setVendorName("gaurav");
		
		Customers c1 = new Customers();
		c1.setCid(501);
		c1.setCustomerName("mali baba");
		
		Customers c2 = new Customers();
		c2.setCid(502);
		c2.setCustomerName("ramesh");
		
		Customers c3 = new Customers();
		c3.setCid(503);
		c3.setCustomerName("dinesh");
		Set s = new HashSet();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		v.setChildren(s);
			Transaction t = session.beginTransaction();
			session.save(v);
			t.commit();
			session.close();
		System.out.println("One to Many Annotation Done..!!!!!!");
	}
}