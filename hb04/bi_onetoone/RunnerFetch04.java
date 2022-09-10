package com.hb04.bi_onetoone;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Diary02.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		// student fetch ediyoruz bir id ile
//	    Student04 student = session.get(Student04.class, 1001);

		// diary fetch ediyoruz
//	    Diary02 diary= session.get(Diary02.class, 101);
//	    
//	    System.out.println(student);
//	    System.out.println("------------------------");
//	    System.out.println(student.getDiary());
//	    System.out.println("------------------------");
//	    System.out.println(diary);
//	    System.out.println("------------------------");
//	    System.out.println(diary.getStudent());
//	    System.out.println("------------------------");

		/*hql ile arka planda hibernate tarafından oluşturulan sql
		 * select student04x0_.std_name as col_0_0_, 
		 * diary02x1_.name as col_1_0_ from
		 * Student04 student04x0_ inner join Diary02 diary02x1_ on (
		 * student04x0_.id=diary02x1_.std_id )
		 *Bizim yazdığımız sql 
		 * select s.std_name,d.name from student04 s inner join diary02 d on s.id=d.std_id; 
		 * 
		 * 
		 */

//		String hqlQuery1 = "SELECT s.name,d.name FROM Student04 s INNER JOIN FETCH Diary02 d on s.id=d.student";
//		List<Object[]> resultList1 = session.createQuery(hqlQuery1).getResultList();
//		for (Object[] objects : resultList1) {
//			System.out.println(Arrays.toString(objects));
//		}
//		resultList1.forEach(oa->{
//			System.out.println(Arrays.toString(oa));
//		});
		
		//LEFT JOIN
//		String hqlQuery2 = "SELECT s.name,d.name FROM Student04 s LEFT JOIN FETCH Diary02 d on s.id=d.student";
//		List<Object[]> resultList2 = session.createQuery(hqlQuery2).getResultList();
//
//		resultList2.forEach(oa->{
//			System.out.println(Arrays.toString(oa));
//		});
		
		//HQL RIGHT JOIN
//		String hqlQuery3 = "SELECT s.name,d.name FROM Student04 s RIGHT JOIN FETCH Diary02 d on s.id=d.student";
//		List<Object[]> resultList3 = session.createQuery(hqlQuery3).getResultList();
//
//		resultList3.forEach(oa->{
//			System.out.println(Arrays.toString(oa));
//		});
		
//		String hqlQuery4 = "SELECT s.name,d.name FROM Student04 s FULL JOIN FETCH Diary02 d on s.id=d.student";
//		List<Object[]> resultList4 = session.createQuery(hqlQuery4).getResultList();
//
//		resultList4.forEach(oa->{
//			System.out.println(Arrays.toString(oa));
//		});
		
//		String hqlQuery5="FROM Student04 s INNER JOIN FETCH s.diary";
//		List<Student04> resulList5= session.createQuery(hqlQuery5,Student04.class).getResultList();
//		
//		for (Student04 student04 : resulList5) {
//			System.out.println(student04);
//		}
		
		
		String hqlQuery6="FROM Diary02 d INNER JOIN FETCH d.student";
		List<Diary02> resultList6= session.createQuery(hqlQuery6,Diary02.class).getResultList();
		
		resultList6.forEach(d->System.out.println(d));

		tx.commit();
		session.close();
		sf.close();
	}

}
