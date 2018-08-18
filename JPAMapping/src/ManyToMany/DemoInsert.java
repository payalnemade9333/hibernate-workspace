package ManyToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      EntityManager entitymanager = emfactory.createEntityManager();
	      entitymanager.getTransaction().begin();
	      
		Court c1 = new Court();
	//	c1.setCourtno(421);
		c1.setBlock("B1-2");
		c1.setName("Allahabad High Court");
		
		Court c2 = new Court();
	//	c2.setCourtno(630);
		c2.setBlock("C2-78");
		c2.setName("bombay High Court");
		
		Lawyer l1 = new Lawyer();
	//	l1.setLawyerid(45879);
		l1.setName("ramesh");
		l1.setPost("offficer");
		l1.setStatus("agree");
		
		Lawyer l2 = new Lawyer();
	//	l2.setLawyerid(15236);
		l2.setName("dinesh");
		l2.setPost("clk");
		l2.setStatus("disagree");
		
		Set s =new HashSet();
	       s.add(l1);
	       s.add(l2);
	       c1.setLawyer(s);
	       c2.setLawyer(s);
	       
           entitymanager.persist(c1);
           entitymanager.persist(c2);

           entitymanager.getTransaction().commit();
           System.out.println("Many To Many is Done..!!");
           entitymanager.close();
	}

}
