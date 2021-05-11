package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Course;
import com.app.hibernate.demo.entity.Instructor;
import com.app.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			//get instructor from db
			int theId=1;
			
			
			Instructor tempInstructor=session.get(Instructor.class,theId);			
			System.out.println("Eager Loding ::\nInstructor  : "+tempInstructor);
			System.out.println("Course : "+tempInstructor.getCourses());

			session.getTransaction().commit();

			session.close();
			
			System.out.println("The session is now closed");
			
			System.out.println("Course : "+tempInstructor.getCourses());

			
		} finally {
			session.close();
			factory.close();
		}
	}

}
