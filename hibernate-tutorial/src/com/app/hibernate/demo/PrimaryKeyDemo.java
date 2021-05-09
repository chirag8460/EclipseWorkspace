package com.app.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		//create session factory
				SessionFactory factory= new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
				//create session
				Session session=factory.getCurrentSession();
				try {
					//create 3 student object
					Student tempStudent1=new Student("chirag","kaushik","chiragkaushik@gmail.com");
					Student tempStudent2=new Student("Amitabh","cena","johhnypapa@gmail.com");
					Student tempStudent3=new Student("John","patel","marathi.manus.aahe@gmail.com");
					System.out.println("Student object created");
					
					//start transaction
					session.beginTransaction();
					
					//save object
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					System.out.println("Student object saved");
					
					//commit
					session.getTransaction().commit();
					System.out.println("Student object Commited");
					
				} 
				finally {
					factory.close();
				}
					

	}

}
