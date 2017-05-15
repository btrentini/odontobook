package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SetEntity {

	/**
	 * @param args
	 * @return 
	 */
	public static EntityManager getEntityManager() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BRUNO");
		
		EntityManager em = emf.createEntityManager();
		
		return em;
	}

}
