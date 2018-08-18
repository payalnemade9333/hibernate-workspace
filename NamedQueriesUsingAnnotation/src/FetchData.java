import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query q = session.getNamedQuery("findEmployeeByName");
		q.setString("name", "payu");
		
		List<Employee> l = q.list();
		Iterator<Employee> itr = l.iterator();
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println(e);
		}
		session.close();
	}

}
