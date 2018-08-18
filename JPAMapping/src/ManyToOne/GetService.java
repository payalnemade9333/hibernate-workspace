package ManyToOne;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      
	    EntityManager em = emfactory.createEntityManager();
	    em.getTransaction().begin();
	    
	    Query query = em.createQuery("from Employee");
	    List list = query.getResultList();
	    Iterator itr = list.iterator();
	    Employee e;
	    while(itr.hasNext())
	    {
	    	e = (Employee)itr.next();
	    	System.out.println(e.getId()+" "+e.getEname()+" "+e.getEname()+" "+e.getDeg()+" "+e.getSalary());
	    }
	}

}
