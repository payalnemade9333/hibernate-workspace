package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      
	      EntityManager em = emfactory.createEntityManager();
	      em.getTransaction().begin();
	      
	      Object o = em.find(Employee.class, 4);
			Employee e = (Employee)o;
			
			em.remove(e);
			em.getTransaction().commit();
			em.close();
			System.out.println("many to one delete done..!!");
	}

}
