package ua.logos.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.orm.entity.Teacher;
import ua.logos.orm.entity.TeacherDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager em = factory.createEntityManager();
    	em.getTransaction().begin();
    	
//    	Teacher teacher = new Teacher();
//    	teacher.setLogin("teacher_login");
//    	teacher.setPassword("teacher_password");
//    	em.persist(teacher);
    	
//    	Teacher teacher = em.find(Teacher.class, 2);
//    	System.out.println(teacher.getLogin() + " " + teacher.getPassword());
//    	teacher.setLogin("teacher_login_updated");
    	
//    	
//    	TeacherDetails td = new TeacherDetails();
//    	td.setAge(20);
//    	td.setFirstName("first_name");
//    	td.setLastName("last");
//    	td.setHobby("hobby");
//    	em.persist(td);
    	
    	Teacher teacher = new Teacher();
    	teacher.setLogin("login_");
    	teacher.setPassword("password_");
    	teacher.setTeacherDetails(new TeacherDetails());
    	em.persist(teacher);
    	
    	em.getTransaction().commit();
    	em.close();
    	factory.close();
    }
}
