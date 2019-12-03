
package br.com.av.agenda.dao;

import br.com.av.agenda.dao.interfaces.IContatoDao;
import br.com.av.agenda.model.Contato;
import br.com.av.agenda.singleton.PersistenceUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Alinne
 */
public class ContatoDao implements IContatoDao {

    private EntityManager entityManager;

    @Override
    public void salvar(Contato contato) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(contato);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            throw new Exception("Erro ao salvar registro no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public void alterar(Contato contato) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(contato);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            throw new Exception("Erro ao alterar registro no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public void excluir(Contato contato) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.remove(contato);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
            throw new Exception("Erro ao excluir registro no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public Contato buscar(long id) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            return entityManager.find(Contato.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao buscar no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public List<Contato> listar() throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            Query query = entityManager.createQuery("SELECT c FROM Contato c WHERE c.id > 1 AND c.removido = false");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao listar no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public List<Contato> listarTodos() throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            Query query = entityManager.createQuery("SELECT c FROM Contato c WHERE c.removido = false");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao listar no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public List<Contato> listarPorNome(String nome) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            Query query = entityManager.createQuery("SELECT c FROM Contato c WHERE c.nome = :param " );
            query.setParameter("param", nome);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao listar no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

}
