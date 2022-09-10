package com.hb09.fetchtypes;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch09 {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student09.class).addAnnotatedClass(Book09.class);
		
		SessionFactory sf= con.buildSessionFactory();
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
         
//	    Student09 student= session.get(Student09.class,1002);
//	    session.delete(student);
		
	/*	LAZY
	 * select
        student09x0_.id as id1_1_0_,
        student09x0_.grade as grade2_1_0_,
        student09x0_.student_name as student_3_1_0_ 
    from
        Student09 student09x0_ 
    where
        student09x0_.id=?*/
		
		/*EAGER
		 * Hibernate: 
    select
        student09x0_.id as id1_1_0_,
        student09x0_.grade as grade2_1_0_,
        student09x0_.student_name as student_3_1_0_,
        booklist1_.student_id as student_3_0_1_,
        booklist1_.id as id1_0_1_,
        booklist1_.id as id1_0_2_,
        booklist1_.name as name2_0_2_,
        booklist1_.student_id as student_3_0_2_ 
    from
        Student09 student09x0_ 
    left outer join
        Book09 booklist1_ 
            on student09x0_.id=booklist1_.student_id 
    where
        student09x0_.id=?
		 */
		
		// Student09 student1= session.get(Student09.class,1002);
		 
		
		
		/*
		 * Hibernate: EAGET MANTOONE BOOK FETCH
    select
        book09x0_.id as id1_0_0_,
        book09x0_.name as name2_0_0_,
        book09x0_.student_id as student_3_0_0_,
        student09x1_.id as id1_1_1_,
        student09x1_.grade as grade2_1_1_,
        student09x1_.student_name as student_3_1_1_ 
    from
        Book09 book09x0_ 
    left outer join
        Student09 student09x1_ 
            on book09x0_.student_id=student09x1_.id 
    where
        book09x0_.id=?
Hibernate: 
    select
        booklist0_.student_id as student_3_0_0_,
        booklist0_.id as id1_0_0_,
        booklist0_.id as id1_0_1_,
        booklist0_.name as name2_0_1_,
        booklist0_.student_id as student_3_0_1_ 
    from
        Book09 booklist0_ 
    where
        booklist0_.student_id=?
		 */
		
		Book09 book1= session.get(Book09.class,101);
		
		tx.commit();
		session.close();
        sf.close();
	}

}
