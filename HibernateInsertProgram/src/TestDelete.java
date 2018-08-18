import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t = session.beginTransaction();
		
		UserDto dto = new UserDto();
		dto.setId(4);
		
		session.delete(dto);
		t.commit();
		session.close();
	}

}
