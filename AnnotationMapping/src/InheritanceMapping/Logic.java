package InheritanceMapping;

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
		
		ChequePayment c = new ChequePayment();
		c.setPayid(1001);
		c.setAmount(3000.00);
		c.setChtype("Order");
		c.setChqnumber(5895666);
		
		CreditCardPayment cc = new CreditCardPayment();
		cc.setPayid(1002);
		cc.setAmount(2000.00);
		cc.setCctype("ICICI");
		cc.setCcnumber(86232567);
		
		Transaction t = session.beginTransaction();
		session.save(cc);
		session.save(c);
		t.commit();
		session.close();
	}

}
