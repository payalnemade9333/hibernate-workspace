package OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      
	      EntityManager em = emfactory.createEntityManager();
	      em.getTransaction().begin();
	      
	      Customers c  = (Customers)em.find(Customers.class, 1);
	      c.setFirstname("rajesh");
	      c.setLastname("muley");
	      
	      em.getTransaction().commit();
	      em.close();
	      System.out.println("updating done------!!!!!!!!!");
	      
	}

}
