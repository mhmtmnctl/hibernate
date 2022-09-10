package com.hb08.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch08 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student08.class)
				.addAnnotatedClass(Book08.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

//        Student08 student= session.get(Student08.class, 1001);
//
//        System.out.println(student.getBookList());
		
//      Book08 book= session.get(Book08.class, 101);
//
//      System.out.println(book.getStudents());
		
//		String hqlQuery1="SELECT s FROM Student08 s JOIN FETCH s.bookList b";
//        List<Student08> resultList1= session.createQuery(hqlQuery1,Student08.class).getResultList();
//        
//        for (Student08 student08 : resultList1) {
//			System.out.println(student08);
//		}
		
		//isteğe göre alanlar seçiliyor burada JOIN FETCH kullanılmadı.
		String hqlQuery2="SELECT s.name,b.name FROM Student08 s JOIN s.bookList b";
        List<Object []> resultList2= session.createQuery(hqlQuery2).getResultList();
        
        for (Object[] objects : resultList2) {
			System.out.println(Arrays.toString(objects));
		}
        
		tx.commit();
		session.close();
		sf.close();

	}

}
