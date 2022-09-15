package com.hb14.entity_life_cycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave14 {

	public static void main(String[] args) {

		//Transient State
		Student14 student1 = new Student14();
		student1.setName("John Coffee");
		student1.setMathGrade(10);

		Student14 student2 = new Student14();
		student2.setName("James Bond");
		student2.setMathGrade(11);

		Student14 student3 = new Student14();
		student3.setName("Tony Stark");
		student3.setMathGrade(9);

		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student14.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		//session.save(student1);
		//student1 save edildikten sonra persistent state' geçiyor.
        
		//student1.setName("Updated in persistent state");
		
		//detached yapınca yukarıdaki save metodunun yaptığı değişiklikte kalıcı olmuyor.
		//session.evict(student1);
		
		//detached yapınca ağağıdaki set işe yaramıyor. Çünkü artık persistent context tarafından 
		//detach edilmiş.
		//student1.setName("Updated in detached");
		
		//session.update(student1);//detached edilen bir nesne geri persistent state update metodu ile alınabilir.
		//session.merge(student1);//detached edilen bir nesne geri persistent state merge metodu ile alınabilir.
		
		
		//-----------delete metodu ile silineceğini söylüyoruz daha sonra commit ile vt'den kalıcı olarak siliniyor.
		Student14 studentFound= session.load(Student14.class, 1L);
		session.delete(studentFound);
		
		tx.commit();
		session.close();
		
		
		sf.close();

	}

}
