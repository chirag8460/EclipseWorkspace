package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Instructor;
import com.app.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			// get instructor by primary key
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			System.out.println("Found : " + tempInstructor);

			// delete the instructor

			if (tempInstructor != null) {
				System.out.println("Deleting : " + tempInstructor);
				session.delete(tempInstructor);
			}
			// commit
			session.getTransaction().commit();
			System.out.println("Student object Commited");
		} finally {
			factory.close();
		}
	}

}
