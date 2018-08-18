package CrudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student s = new Student();
		s.setStudentid(1);
		s.setStudentname("dinesh");
		s.setRollno(1);
		s.setCourse("PGDCA");
		
		Student s1 = new Student();
		s1.setStudentid(2);
		s1.setStudentname("Ramesh rajput");
		s1.setRollno(2);
		s1.setCourse("MCA");
		
		Student s2 = new Student();
		s2.setStudentid(3);
		s2.setStudentname("Adesh");
		s2.setRollno(3);
		s2.setCourse("MA");
		
		Student s3 = new Student();
		s3.setStudentid(4);
		s3.setStudentname("Vinesh");
		s3.setRollno(4);
		s3.setCourse("BA");
		
		Transaction t = session.beginTransaction();
		session.save(s);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		System.out.println("Object Saved successfully using annotation..........!!!!!!!!!!!");
		t.commit();
		session.close();
		
	}

}
