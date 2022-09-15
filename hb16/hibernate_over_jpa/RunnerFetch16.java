package com.hb16.hibernate_over_jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RunnerFetch16 {

	public static void main(String[] args) {


				
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentunit");
		EntityManager em=emf.createEntityManager();

		em.getTransaction().begin();

		Student16 student= em.find(Student16.class, 1L); //find işlemi için
//        System.out.println(student);
		
		//em.remove(student);//silme işlemi için
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
