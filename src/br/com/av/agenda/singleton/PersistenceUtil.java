
package br.com.av.agenda.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alinne
 */
public class PersistenceUtil {
    
    private static EntityManagerFactory entitiyManagerFactory = null;
    private static EntityManager entityManager = null;

    private PersistenceUtil() {
    }
    
    static{
        entitiyManagerFactory = Persistence.createEntityManagerFactory("AgendaPU");
    }
    
    public static EntityManager getEntityManager() throws Exception{
        try {
            if(entityManager == null || !entityManager.isOpen()){
                entityManager = entitiyManagerFactory.createEntityManager();
            }
            return entityManager;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public static void closeEntityManager() {
        try {
            if (entityManager != null && entityManager.isOpen()) {
                entityManager.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
