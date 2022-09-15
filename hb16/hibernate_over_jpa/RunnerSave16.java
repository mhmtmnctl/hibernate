package com.hb16.hibernate_over_jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RunnerSave16 {

	public static void main(String[] args) {

		Student16 student=new Student16();
		student.setName("John Coffee");
		student.setMathGrade(100);
				

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentunit");
		EntityManager em=emf.createEntityManager();

		em.getTransaction().begin();


		em.persist(student); // we can persist the object

		

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
