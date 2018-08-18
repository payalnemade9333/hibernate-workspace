import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestGetTheListOfUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from UserDto");
		List l = q.list();
		Iterator it = l.iterator();
		
		UserDto dto;
		while(it.hasNext())
		{
			dto = (UserDto)it.next();
			System.out.println(dto.getId() +" "+dto.getName() +" "+dto.getAddress() +" "+dto.getCity()+ " "+dto.getState()+ " "+dto.getPincode());
		}
		session.close();
	}
}
