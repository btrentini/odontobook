package util;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe utilitária que devolve uma referência para um objeto EntityManager
 * @author Professor Márcio.
 *
 */
public class EntityManagerHelper {

    /** Mapa que contém o cache de EntityManager */
    private static Map<String, EntityManager> mapa;

    /** Método estático que cria um mapa de EntityManagers **/
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
