package com.app.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try {
			
			
			//start transaction
			session.beginTransaction();
			
			//retrieve
			//List<Student> students=session.createQuery("from Student").getResultList();
			List<Student> students=session.createQuery("from Student where lastName='Trump'").getResultList();

			
			//display
			for(Student tempStudent:students) {
				System.out.println(tempStudent);
			}
			//commit
			session.getTransaction().commit();
		}
		finally {
			factory.close();
			
		}
	}

}
