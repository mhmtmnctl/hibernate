package com.hb15.concurrency_locktype;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch15 {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student15.class);

		SessionFactory sf = con.buildSessionFactory();
//		Session session1 = sf.openSession();
//		Transaction tx1 = session1.beginTransaction();
//
//		Session session2=sf.openSession();
//		Transaction tx2= session2.beginTransaction();
//		
//		Student15 student1= session1.get(Student15.class, 1L);
//		Student15 student2= session2.get(Student15.class, 1L);
//		
//		//OptimisticLockException geliyor
//		student1.setName("session1 student");
//		student2.setName("session2 student");
//		
//		tx2.commit();
//		
//		tx1.commit();
//		
//		session2.close();
//        session1.close();	
		
		
		Session session3 = sf.openSession();
		System.out.println("After open session.... ");
		Transaction tx3 = session3.beginTransaction();
		System.out.println("After transaction begin.... ");
		
	 	Student15 student3= session3.get(Student15.class, 1L,LockMode.PESSIMISTIC_WRITE);
		System.out.println("after get student");
		
		
		tx3.commit();
		session3.close();
		
		sf.close();
	}

}
