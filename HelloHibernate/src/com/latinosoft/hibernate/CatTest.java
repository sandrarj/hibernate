package com.latinosoft.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.latinosoft.hibernate.model.Cat;

public class CatTest {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		c.setId(3);
		c.setName("Felina");
		c.setColor("Brown");
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(c);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}

}
