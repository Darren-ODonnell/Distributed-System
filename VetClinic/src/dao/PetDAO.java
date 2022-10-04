package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pet;

public class PetDAO{
	
	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("VetPU");
	
	public PetDAO() {}
	
	public void persistPet(Pet pet) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(pet);
		em.getTransaction().commit();
		em.close();
	}
}
