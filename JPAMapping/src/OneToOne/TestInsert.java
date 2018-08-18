package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	    EntityManager entitymanager = emfactory.createEntityManager();
	    entitymanager.getTransaction().begin();
	    
		Car c1 = new Car();
	//	c1.setCarid(15369);
		c1.setCarname("BMW");
		c1.setPrice(8000000);
		
		Engine e1 = new Engine();
	//	e1.setEngno(52485419);
		e1.setGearbox("4-gear");
		e1.setCar(c1);
		
        entitymanager.persist(e1);
        entitymanager.getTransaction().commit();
        System.out.println("One to One done");
        entitymanager.close();
        
	}
}
