package HelloWorld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class ClientForSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg=new AnnotationConfiguration();
	     cfg.configure();

	     SessionFactory factory = cfg.buildSessionFactory();
	     Session session = factory.openSession();
	     Product p=new Product(); 

	     p.setProductId(501);
	     p.setProName("machine");
	     p.setPrice(15000);

	     Transaction tx = session.beginTransaction();
	     session.save(p);
	     System.out.println("Object saved successfully using annotations.....!!");
	     tx.commit();
	     session.close();
	     factory.close();
	}

}
