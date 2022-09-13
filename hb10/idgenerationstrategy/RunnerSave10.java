package com.hb10.idgenerationstrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave10 {

	public static void main(String[] args) {
		Student10 student1 = new Student10();
		student1.setName("John Coffee");
		student1.setGrade(10);

//		Student10 student2 = new Student10();
//		student2.setName("James Bond");
//		student2.setGrade(11);
//
//		Student10 student3 = new Student10();
//		student3.setName("Tony Stark");
//		student3.setGrade(9);

		Book10 book1 = new Book10();
		book1.setName("John's Art Book");
//
//		Book10 book2 = new Book10();
//		book2.setName("John's Math Book");


	
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student10.class)
				.addAnnotatedClass(Book10.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(student1);
//		session.save(student2);
//		session.save(student3);
		
		session.save(book1);
		
		

		tx.commit();
		session.close();
		sf.close();

	}

}
