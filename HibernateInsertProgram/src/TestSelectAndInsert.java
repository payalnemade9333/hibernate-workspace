import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSelectAndInsert {
		public void SelectandInsert() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t = session.beginTransaction();
		
		UserDto dto = new UserDto();
		dto.setName("hansa");
		dto.setAddress("sharma");
		dto.setCity("indore");
		dto.setState("mp");
		dto.setPincode(147896);
		
		session.save(dto);
		t.commit();
		session.close();
		System.out.println("successfully saved");
		}
}
class TestUpdate {
	public void TestUpdateDemo() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t = session.beginTransaction();
		
		UserDto dto = new UserDto();
		dto.setId(5);
		dto.setName("nilm");
		dto.setAddress("junindore");
		dto.setCity("Indore");
		dto.setState("MP");
		dto.setPincode(789302);
		
		session.update(dto);
		t.commit();
		session.close();
		System.out.println("successfully saved");
		}
}
