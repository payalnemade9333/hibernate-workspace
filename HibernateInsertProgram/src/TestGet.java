import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t = session.beginTransaction();
		
		UserDto dto = new UserDto();
		
		UserDto u = (UserDto)session.get(UserDto.class, 5);
		System.out.println(u.getId());
		System.out.println(u.getAddress());
		System.out.println(u.getCity());
		System.out.println(u.getState());
		System.out.println(u.getPincode());
		
		session.close();

	}

}
