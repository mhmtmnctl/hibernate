package com.hb11.hql_criteriaapi;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave11 {

	public static void main(String[] args) {
	
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student11.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
         
		Random random=new Random();
		Student11 student;
		
		for (int i = 1; i <=50; i++) {
			student=new Student11();
			student.setName("Student Name "+i);
			student.setMathGrade(random.nextInt(100));
			session.save(student);
		}

		tx.commit();
		session.close();
		sf.close();

	}

}
