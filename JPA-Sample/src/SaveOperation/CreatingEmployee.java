package SaveOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import SaveOperation.Employee;
public class CreatingEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Employee employee = new Employee( ); 
	      employee.setEname("suresh");
	      employee.setSalary(152300);
	      employee.setDeg("project manager");
	      
	      entitymanager.persist(employee);
	      entitymanager.getTransaction( ).commit( );
	      
	      entitymanager.close( );
	      emfactory.close( );
	}

}
