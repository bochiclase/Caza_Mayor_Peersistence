package cazaMayor.modelo.especie;

import javax.persistence.EntityManager;


import cazaMayor.negocio.EspecieBean;
import cazaMayor.util.ConnectionEntityManagerFactory;

public class CreateEspecie {
public void create(EspecieBean especie) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(especie);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}

}
