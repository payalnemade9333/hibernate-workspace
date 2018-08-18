package OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      
	      EntityManager em = emfactory.createEntityManager();
	      em.getTransaction().begin();
	      
	      Customers c = em.find(Customers.class, 3);
	      em.remove(c);
	      em.getTransaction().commit();
			em.close();
			System.out.println("one to many  delete done..!!");
	}

}
