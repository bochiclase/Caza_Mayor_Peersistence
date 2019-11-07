package cazaMayor.modelo.informe;

import javax.persistence.EntityManager;


import cazaMayor.negocio.InformeBean;
import cazaMayor.util.ConnectionEntityManagerFactory;

public class CreateInforme {
public void create(InformeBean informe) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(informe);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
