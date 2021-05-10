package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Instructor;
import com.app.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			// create objects
//			Instructor tempInstructor = new Instructor("chetan", "jha", "chetanjha@youtubb.com");
//			InstructorDetail tempInstructorDetail = new InstructorDetail("http://youtube.com/chetanjha","like volleyball");
			
			Instructor tempInstructor = new Instructor("Abhishek", "upmanty", "abmanyu@youtubb.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://youtube.com/abc","cricket");

			// associate object
			tempInstructor.setInstructorDetail(tempInstructorDetail);

			// save instructor also saves instructor_detail object because of cascase all annotation
			
			session.save(tempInstructor);

			// commit
			session.getTransaction().commit();
			System.out.println("Student object Commited");
		}
		finally {
			factory.close();
		}
	}

}
