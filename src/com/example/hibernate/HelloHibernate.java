package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HelloHibernate {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();  
		Session session = factory.openSession(); 
		Transaction txn=session.beginTransaction();
		Student st=new Student();
		st.setId(82);
		st.setName("shashi");
		
		session.save(st);
		txn.commit();
		System.out.println("connection successful.."+session);
		factory.close();
	}
}
