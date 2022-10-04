package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Subscriber;

public class SubscriberDAO {
	
	//1. Get the EntityManagerFactory 
	//2. Get the EntityManager from the Factory when we need to talk to the DB
	//3. Call one of the operations on the EntityManager i.e., persist
	
	private static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("DarrensPU"); 	
	
	public SubscriberDAO() {
	}
	
	public void persistSubscriber(Subscriber subscriber) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(subscriber);
		em.getTransaction().commit();
		em.close();
	}
	
	

}
