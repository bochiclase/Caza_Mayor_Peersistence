package cazaMayor.modelo.biologos;

import javax.persistence.EntityManager;

import cazaMayor.negocio.BiologosBean;
import cazaMayor.util.ConnectionEntityManagerFactory;


public class CreateBiologos {

	
public void create(BiologosBean biologo) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(biologo);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
