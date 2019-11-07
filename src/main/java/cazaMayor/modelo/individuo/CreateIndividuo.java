package cazaMayor.modelo.individuo;

import javax.persistence.EntityManager;

import cazaMayor.negocio.IndividuoBean;
import cazaMayor.util.ConnectionEntityManagerFactory;

public class CreateIndividuo {
public void create(IndividuoBean personaje) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(personaje);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
