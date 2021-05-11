package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Course;
import com.app.hibernate.demo.entity.Instructor;
import com.app.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

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
						
			//create courses
			Course course1=new Course("Java"); 
			Course course2=new Course("PHP"); 
			
			//add course to instructor
			tempInstructor.add(course1);
			tempInstructor.add(course2);
			
		

			
			//save course
			session.save(course1);
			session.save(course2);	

			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}

}
