package ManyToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class LogicInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Categories c1 = new Categories();
		c1.setId(1);
		c1.setCatName("Categories-1");
		 
		 Categories c2=new Categories();
		 c2.setId(2);
		 c2.setCatName("categories-2");
		 
		 Items i1=new Items();
		 i1.setItemid(101);
		 i1.setItemName("item-1");
		 
		 Items i2 = new Items();
		 i2.setItemid(102);
		 i2.setItemName("item-2");
		 
		 Set  s =new HashSet();
		 s.add(i1);
		 s.add(i2);
		 
		 c1.setItems(s);
		 c2.setItems(s);
		 
		 Transaction t = session.beginTransaction();
		 session.save(c1);
		 session.save(c2);
		 t.commit();
		 System.out.println("Many to Many annotations been done...!!!!!");
		 session.close();
		
	}
}
