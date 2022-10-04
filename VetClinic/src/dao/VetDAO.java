package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Vet;

public class VetDAO {

	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("VetPU");
	
	public VetDAO() {}
	
	public void persistVet(Vet vet) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(vet);
		em.getTransaction().commit();
		em.close();
	}
}
