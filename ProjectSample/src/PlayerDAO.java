import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlayerDAO {

	private static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("PlayersPU");
	
	public PlayerDAO() {
	}
	
	public void persistPlayer(Player player) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(player);
		em.getTransaction().commit();
		em.close();
	}
}
