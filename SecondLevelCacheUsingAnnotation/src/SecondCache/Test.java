package SecondCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		System.out.println("Session first: ");
		for(int i=0; i<=10; i++)
		{
		Employee emp1 = (Employee)session.load(Employee.class, 4);
		Thread.sleep(3000);
		System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());
		}
		session.close();
		
	}

}
