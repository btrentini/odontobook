package util;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe utilit�ria que devolve uma refer�ncia para um objeto EntityManager
 * @author Professor M�rcio.
 *
 */
public class EntityManagerHelper {

    /** Mapa que cont�m o cache de EntityManager */
    private static Map<String, EntityManager> mapa;

    /** M�todo est�tico que cria um mapa de EntityManagers **/
    static {
        mapa = new HashMap<String, EntityManager>();
    }

    /**
     * Recupera um objeto EntityManager a partir de uma Persistence Unit
     * @param unit nome da Persistence Unit
     * @return EntityManager
     */
    public static EntityManager getEntityManager(String unit) {

        EntityManager em = mapa.get(unit);

        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(unit);
            em = emf.createEntityManager();
            mapa.put(unit, em);
     
        }
        
        return em;
    }
}
