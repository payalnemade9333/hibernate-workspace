package CrudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateOperation {
	public static void main(String args[])
	{
	AnnotationConfiguration cfg = new AnnotationConfiguration();
	cfg.configure();
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction t = session.beginTransaction();
	
	 Student s = (Student)session.get(Student.class, 2);
	 s.setStudentname("parul");
	  System.out.println("Updated Successfully");
	  session.save(s);
	  t.commit();
	  sessionFactory.close();
	}
}
