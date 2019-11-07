package cazaMayor.modelo.torreta;

import javax.persistence.EntityManager;


import cazaMayor.negocio.TorretaBean;
import cazaMayor.util.ConnectionEntityManagerFactory;

public class CreateTorreta {
public void create(TorretaBean torreta) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(torreta);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
