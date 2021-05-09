package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			int studentId=1;
	
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//get student
			Student myStudent=session.get(Student.class,studentId);
			System.out.println(myStudent);
			//update name
			myStudent.setFirstName("subhash");	
			
			//commit changes
			session.getTransaction().commit();
			
			System.out.println(myStudent);
			
			
			
			
			//new code bulk update
			session=factory.getCurrentSession();
			session.beginTransaction();
			//update email for all trump
			System.out.println("update all emails for trumps");
			session.createQuery("update Student s set email='foobar@gmail.com' where s.lastName='Trump'").executeUpdate();
			session.getTransaction().commit();
		} finally {
			factory.close();

		}
	}

}
