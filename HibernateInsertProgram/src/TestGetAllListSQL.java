import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestGetAllListSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createSQLQuery("select * from employeedata");
		List<Object[]> list = query.list();
		Iterator itr = list.iterator();
		for(Object[] o : list)
		{
			UserDto dto = new UserDto();
			dto.setId(Integer.parseInt(o[0].toString()));
			dto.setName(o[1].toString());
			dto.setAddress(o[2].toString());
			dto.setCity(o[3].toString());
			dto.setState(o[4].toString());
			dto.setPincode(Integer.parseInt(o[5].toString()));
			
			System.out.println(dto.getId()+"  "+dto.getName()+" "+dto.getAddress()+" "+dto.getCity()+" "+dto.getState()+" "+dto.getPincode());
		}
	}

}
