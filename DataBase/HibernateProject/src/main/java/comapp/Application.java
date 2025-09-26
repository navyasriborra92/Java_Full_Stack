package comapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Student;
import com.util.HibernateUtil;

public class Application {
	
	public static void main(String[] args) {
		SessionFactory sessionfactory = HibernateUtil.getSessionfactory();
		
		Session session = sessionfactory.openSession();
		Student st = new Student("nav", 100);
		session.beginTransaction();
		
		session.persist(st);
		
		session.getTransaction().commit();
		session.close();
	}

}
