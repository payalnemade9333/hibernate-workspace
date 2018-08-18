package OneToMany;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToOne.Employee;

public class GetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      
	    EntityManager em = emfactory.createEntityManager();
	    em.getTransaction().begin();
	    
	    Query query = em.createQuery("from Customers");
	    List list = query.getResultList();
	    Iterator itr = list.iterator();
	    Customers c;
	    while(itr.hasNext())
	    {
	    	c = (Customers)itr.next();
	    	System.out.println(c.getFirstname()+" "+c.getLastname()+" "+c.getBirthdate()+" "+c.getPhone()+" "+c.getCustomerid());
	    }
	}

}
