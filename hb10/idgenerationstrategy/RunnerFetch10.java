package com.hb10.idgenerationstrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch10 {

	public static void main(String[] args) {

		 
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student10.class).addAnnotatedClass(Book10.class);
		
		SessionFactory sf= con.buildSessionFactory();
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
         

		tx.commit();
		session.close();
        sf.close();
	}

}
