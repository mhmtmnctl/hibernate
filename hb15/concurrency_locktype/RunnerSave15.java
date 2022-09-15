package com.hb15.concurrency_locktype;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave15 {

	public static void main(String[] args) {

		Student15 student1 = new Student15();
		student1.setName("John Coffee");
		student1.setMathGrade(10);

		Student15 student2 = new Student15();
		student2.setName("James Bond");
		student2.setMathGrade(11);

		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student15.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(student1);
		session.save(student2);

		
		tx.commit();
		session.close();
		
		
		sf.close();

	}

}
