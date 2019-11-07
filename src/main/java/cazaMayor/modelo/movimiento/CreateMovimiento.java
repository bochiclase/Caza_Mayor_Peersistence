package cazaMayor.modelo.movimiento;

import javax.persistence.EntityManager;


import cazaMayor.negocio.MovimientoBean;
import cazaMayor.util.ConnectionEntityManagerFactory;

public class CreateMovimiento {
public void create(MovimientoBean movimiento) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(movimiento);
		entityManager.getTransaction().commit();
		entityManager.close();  
	}
}
