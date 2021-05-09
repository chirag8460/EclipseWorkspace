package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			//int studentId=10;
	
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//get student
			//Student myStudent=session.get(Student.class,studentId);
		    
			//delete
			//session.delete(myStudent);
			
			//approach 2
			session.createQuery("delete from Student where id=2").executeUpdate();
			
			//commit
			session.getTransaction().commit();
		} finally {
			factory.close();

		}
	}

}
