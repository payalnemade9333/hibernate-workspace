package TablePerSubClass;

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
		
		Employee e = new Employee();
		e.setName("payu");
		
		Regular_Employee re  = new Regular_Employee();
		re.setName("raju");
		re.setSalary(50860);
		re.setBonus(5);
		
		Contract_Employee ce = new Contract_Employee();
		ce.setName("Arjun");
		ce.setPay_per_hour(10);
		ce.setContract_duration("15 hr");
		
		Transaction t = session.beginTransaction();
		session.save(e);
		session.save(re);
		session.save(ce);
		t.commit();
		session.close();
		System.out.println("Done");
	}

}
