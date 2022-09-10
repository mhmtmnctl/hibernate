package com.hb07.bi_onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch07 {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student07.class).addAnnotatedClass(Book07.class);
		
		SessionFactory sf= con.buildSessionFactory();
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
         
	   // Student07 student= session.get(Student07.class, 1001);
		
	    //student.getBookList().forEach(System.out::println);
	    //student.getBookList().forEach(b->System.out.println(b));
		
		// SQL query öğrencinin bilgilerini getirelim
//	    String sqlQuery1="SELECT s.student_name,b.name FROM student07 s INNER JOIN book07 b ON s.id=b.student_id";
//	    List<Object[]> resultList1= session.createSQLQuery(sqlQuery1).getResultList();
//		
//	    for (Object[] objects : resultList1) {
//			System.out.println(Arrays.toString(objects));
//		}
	    
//		String hqlQuery1="SELECT s.name,b.name FROM Student07 s INNER JOIN FETCH Book07 b ON s.id=b.student.id";
//		List<Object[]> resultList2= session.createQuery(hqlQuery1).getResultList();
//		resultList2.forEach(oa->System.out.println(Arrays.toString(oa)));
		
//		
//		String sqlQuery2="DELETE FROM book07";
//		int numOfRec= session.createSQLQuery(sqlQuery2).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec);
//		
//		String sqlQuery3="DELETE FROM Student07";
//		int numOfRec2= session.createSQLQuery(sqlQuery3).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec2);
		
		
//		String hqlQuery1="DELETE FROM Book07";
//		int numOfRec3= session.createQuery(hqlQuery1).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec3);
//		
//		String hqlQuery2="DELETE FROM Student07";
//		int numOfRec4= session.createQuery(hqlQuery2).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec4);
	
		
		//Kitap ismine göre Kitap silmeyi sağyalan bir HQL
		
//		String hqlQuery3="DELETE FROM Book07 b WHERE b.name='John''s Art Book'";
//		int numOfRec5= session.createQuery(hqlQuery3).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec5);
		
//		String hqlQuery4="DELETE FROM Book07 b WHERE b.student=1001";//referans ile silme
//		String hqlQuery4="DELETE FROM Book07 b WHERE b.student.id=1001";
//		int numOfRec6= session.createQuery(hqlQuery4).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec6);
		
        //Herhangi bir kitaba sahip olmayan bir öğrenciyi id ile silme
//		String hqlQuery5="DELETE FROM Student07 s where s.id=1001";
//		int numOfRec7= session.createQuery(hqlQuery5).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec7);
		
		/*
		 * update or delete on table "student07" 
		 * violates foreign key constraint "fk95pa12xmsmpq144c2dq69x5m1" on table "book07"
		 */
		//eğer bu öğrencinin bir kitabı varsa book tablosunda bir foreign keye karşılık gelir.
		//kitaba sahip bir öğrenciyi silebilmek için
		//1-Öğrenciye ait bütün kitapları silip sonra öğrenciyi silebiliriz.
//		String hqlQuery6="DELETE FROM Student07 s where s.id=1003";
//		int numOfRec8= session.createQuery(hqlQuery6).executeUpdate();
//		System.out.println("Effected Row count:"+numOfRec8);
		
		
		//Student07 student= session.get(Student07.class, 1001);
		
		//session.delete(student);
		
		//student.getBookList().set(0,null);
		
		
//		String hqlQuery7="SELECT s  FROM Student07 s JOIN Book07 b ON s.id=b.student";
//		session.createQuery(hqlQuery7).getResultList();
		
//		String hqlQuery8="SELECT s  FROM Student07 s JOIN s.bookList";
//		session.createQuery(hqlQuery8).getResultList();
		
		
//		String hqlQuery8="SELECT s FROM Student07 s JOIN s.bookList b WHERE b.name LIKE '%Java%'";
//		 List<Student07> resultList1= session.createQuery(hqlQuery8,Student07.class).getResultList();
//		
//		 for (Student07 student07 : resultList1) {
//			System.out.println(student07);
//		}
		
		
	
		
		tx.commit();
		session.close();
        sf.close();
	}

}
