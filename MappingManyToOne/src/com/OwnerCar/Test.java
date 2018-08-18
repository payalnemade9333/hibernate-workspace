package com.OwnerCar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Owner o = new Owner();
		o.setUserId(1);
		o.setName("john");
		
		Car c1 = new Car();
		c1.setCarId(12);
		c1.setCarName("BMW");
		c1.setParentObjects(o);
		
		Car c2 = new Car();
		c2.setCarId(13);
		c2.setCarName("verna");
		c2.setParentObjects(o);
		
		Car c3 = new Car();
		c3.setCarId(14);
		c3.setCarName("jaquar");
		c3.setParentObjects(o);
		
		Car c4 = new Car();
		c4.setCarId(15);
		c4.setCarName("certa");
		c4.setParentObjects(o);
		
		Car c5 = new Car();
		c5.setCarId(16);
		c5.setCarName("maruti");
		c5.setParentObjects(o);
		
		Car c6 = new Car();
		c6.setCarId(17);
		c6.setCarName("wagenor");
		c6.setParentObjects(o);
		
		Owner o1 = new Owner();
		o1.setUserId(2);
		o1.setName("harry");
		
		Car c7 = new Car();
		c7.setCarId(18);
		c7.setCarName("nano");
		c7.setParentObjects(o1);
		
		Owner o2 = new Owner();
		o2.setUserId(3);
		o2.setName("ramesh");
		
		/*Car c8 = new Car();
		c8.setCarId(19);
		c8.setCarName("honda");
		c8.setParentObjects(o2);
		
		Owner o3 = new Owner();
		o3.setUserId(4);
		o3.setName("raju");*/
		
		Car c9 = new Car();
		c9.setCarId(20);
		c9.setCarName("mahindra");
		c9.setParentObjects(o2);
		
		Transaction t = session.beginTransaction();
			/*session.save(c1);
			session.save(c2);
			session.save(c3);
			session.save(c4);
			session.save(c5);
			session.save(c6);
			session.save(c7);
		//	session.save(c8);
*/			session.save(c9);
		t.commit();
		session.close();
		System.out.println("Many to One is Done....!!!!!");
	}

}
