package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		try {
			//create student object
			Student tempStudent=new Student("chirag","kaushik","chiragkaushik@gmail.com");
			System.out.println("Student object created");
			//start transaction
			session.beginTransaction();
			
			//save object
			session.save(tempStudent);
			System.out.println("Student object saved");
			
			//commit
			session.getTransaction().commit();
			System.out.println("Student object Commited");
		} finally {
			factory.close();
			
		}
	}

}
