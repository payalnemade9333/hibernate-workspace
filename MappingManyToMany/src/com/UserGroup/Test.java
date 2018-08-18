package com.UserGroup;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Users u1 = new Users();
		u1.setUserId(500);
		u1.setUserName("johny");
		u1.setMobileNo(7854129);
		
		Users u2 = new Users();
		u2.setUserId(600);
		u2.setUserName("harry");
		u2.setMobileNo(158963);
		
		Groups g1 = new Groups();
		g1.setGroupId(10001);
		g1.setGroupName("social_Group");
		g1.setStrength(150);
		
		Groups g2 = new Groups();
		g2.setGroupId(20002);
		g2.setGroupName("media_Group");
		g2.setStrength(200);
		
		Set s = new HashSet();
			s.add(u1);
			s.add(u2);
				g1.setUsers(s);
				g2.setUsers(s);
			/*s.add(g1);
			s.add(g2);
				u1.setGroups(s);
				u2.setGroups(s);*/
		
				Transaction t = session.beginTransaction();
					session.save(g1);
					session.save(g2);
				t.commit();
				session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
	}
}
