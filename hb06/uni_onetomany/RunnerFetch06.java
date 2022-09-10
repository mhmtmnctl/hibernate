package com.hb06.uni_onetomany;

import java.awt.print.Book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch06 {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student06.class).addAnnotatedClass(Book06.class);
		
		SessionFactory sf= con.buildSessionFactory();
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
         
	
//		Student06 student = session.get(Student06.class, 1001);
//		System.out.println(student);
		
		//bir öğrenci id ile kitapları çekme
		
//		String hqlQuery1="FROM Book06 b where b.id=101";
//		Book06 book= session.createQuery(hqlQuery1,Book06.class).uniqueResult();
//		System.out.println(book);
		
//		Student06 student = session.get(Student06.class, 1001);
//		student.getBookList().forEach(b->System.out.println(b));
		
		Book06 book=session.get(Book06.class, 101);
		System.out.println(book);
		
		
		tx.commit();
		session.close();
        sf.close();
	}

}
