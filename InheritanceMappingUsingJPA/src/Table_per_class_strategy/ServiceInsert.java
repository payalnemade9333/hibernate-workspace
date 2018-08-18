package Table_per_class_strategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ServiceInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPAservice");
	      EntityManager entitymanager = emfactory.createEntityManager();
	      entitymanager.getTransaction().begin();
	      
		 TeachingStaff ts1 = new TeachingStaff();
		 ts1.setSid(1);
		 ts1.setQualification("Bsc BEd");
		 ts1.setSname("manisha");
		 ts1.setSubjectexpertise("engilsh");
		 
	     TeachingStaff ts2 = new TeachingStaff();
	     ts2.setSid(2);
		 ts2.setQualification("CA");
		 ts2.setSname("satish");
		 ts2.setSubjectexpertise("account");
	      //Non-Teaching Staff entity
	      NonTeachingStaff nts1 = new NonTeachingStaff();
	      nts1.setSid(3);
	      nts1.setSname("ramu");
	      nts1.setAreaexpertise("acc");
	      
	      NonTeachingStaff nts2 = new NonTeachingStaff();
	      nts2.setSid(4);
	      nts2.setSname("krishna");
	      nts2.setAreaexpertise("office admin");
	      
	      //storing all entities
	      entitymanager.persist(ts1);
	      entitymanager.persist(ts2);
	      entitymanager.persist(nts1);
	      entitymanager.persist(nts2);

	      entitymanager.getTransaction().commit();
	      entitymanager.close();
	}

}
