package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      
	      EntityManager em = emfactory.createEntityManager();
	      em.getTransaction().begin();
	      
	      Department d = new Department();
	      d.setId(1);
	      d.setName("management");
	      
	      Employee e = new Employee();
	      e.setId(1);
	      e.setEname("payal");
	      e.setDeg("software developer");
	      e.setDepartment(d);
	      
	      em.merge(e);
	      em.getTransaction().commit();
	      System.out.println("Many to One Update is Done....!!!!!");
	      
	}

}
