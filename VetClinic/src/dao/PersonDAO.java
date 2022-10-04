package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Person;

public class PersonDAO {
	
	private static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("VetPU");
	
	public PersonDAO() {}
	
	public void persistPerson(Person person) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		em.close();
		
	}

}
