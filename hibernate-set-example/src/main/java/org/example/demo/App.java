package org.example.demo;

import java.util.Set;
import java.util.logging.Logger;

import org.example.demo.mode.Status;
import org.example.demo.mode.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger("org.example.demo.App.class");

	public static void main(String[] args) {

		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
					.buildSessionFactory();
			Session session = factory.getCurrentSession();

			Student student = new Student();
			student.setFirstName("Marry");
			student.setLastName("Public");
			student.setEmail("marry@email.com");
			student.setStatus(Status.INACTIVE);
			Set<String> set = student.getImages();
			set.add("img-1");
			set.add("img-2");
			set.add("img-3");
			student.setImages(set);
			session.getTransaction().begin();
			session.save(student);
			session.getTransaction().commit();
			System.out.println("done");

			/*
			 * session.getTransaction().begin(); Student student=session.get(Student.class,
			 * 102); session.remove(student); session.getTransaction().commit();
			 * logger.info("done");
			 */

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}