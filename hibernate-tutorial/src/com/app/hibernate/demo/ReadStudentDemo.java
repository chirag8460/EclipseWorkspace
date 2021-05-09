package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			// create student object
			Student tempStudent = new Student("Donald", "Trump", "makeAmericaPoorAgain@gmail.com");
			System.out.println("Student object created");
			System.out.println(tempStudent);
			// start transaction
			session.beginTransaction();

			// Save object
			session.save(tempStudent);
			System.out.println("Student object saved");

			// commit
			session.getTransaction().commit();
			System.out.println("Student object Commited");

			// find new studetns id
			System.out.println("saved student :" + tempStudent.getId());

			// get session
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve
			System.out.println("Getting student with id : " + tempStudent.getId());

			Student myStudent = session.get(Student.class, tempStudent.getId());
			System.out.println(myStudent);
			session.getTransaction().commit();
			System.out.println("Done !!!");

		} finally {
			factory.close();

		}
	}

}
