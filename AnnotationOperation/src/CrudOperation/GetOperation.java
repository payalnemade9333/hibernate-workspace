package CrudOperation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Student");
		
		List<Student> list = query.list();
		for(Student student : list)
		{
			System.out.println(student.getStudentid()+" "+student.getStudentname()+" "+student.getRollno()+" "+student.getCourse());
		}
		t.commit();
		session.close();
		
	}

}
