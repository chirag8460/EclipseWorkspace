package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Course;
import com.app.hibernate.demo.entity.Instructor;
import com.app.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			

			Instructor tempInstructor = new Instructor("Vibhansh", "Jha", "vbshaikh@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://youtube.com/abc","cricket");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			session.beginTransaction();
			session.save(tempInstructor);
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
