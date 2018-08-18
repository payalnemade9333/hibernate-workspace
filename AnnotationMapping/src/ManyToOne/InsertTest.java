package ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Vendor v = new Vendor();
		v.setVid(701);
		v.setVendorName("Mannu");
		
		Customers c1 = new Customers();
		c1.setCid(504);
		c1.setCustomerName("tiger");
		c1.setParent(v);
		
		Customers c2 = new Customers();
		c2.setCid(505);
		c2.setCustomerName("bull");
		c2.setParent(v);
		
		Customers c3 = new Customers();
		c3.setCid(506);
		c3.setCustomerName("road");
		c3.setParent(v);
		
		Transaction t = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		t.commit();
		System.out.println("Many to One Annotaion Done...........!!!");
		session.close();
	}

}
