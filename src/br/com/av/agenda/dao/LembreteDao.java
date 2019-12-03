
package br.com.av.agenda.dao;

import br.com.av.agenda.dao.interfaces.ILembreteDao;
import br.com.av.agenda.model.Lembrete;
import br.com.av.agenda.singleton.PersistenceUtil;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Alinne
 */
public class LembreteDao implements ILembreteDao {

    private EntityManager entityManager;

    @Override
    public void salvar(Lembrete lembrete) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(lembrete);
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
    public void alterar(Lembrete lembrete) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(lembrete);
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
    public void excluir(Lembrete lembrete) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.getReference(Lembrete.class, lembrete.getId()));
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
    public Lembrete buscar(long id) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            return entityManager.find(Lembrete.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao buscar no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public List<Lembrete> listar() throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            Query query = entityManager.createQuery("SELECT l FROM Lembrete l");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao listar no Banco de Dados!!!");
        } finally {
            PersistenceUtil.closeEntityManager();
        }
    }

    @Override
    public List<Lembrete> listarPorData(Calendar data) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            Query query = entityManager.createQuery("SELECT l FROM Lembrete l WHERE l.calendar ");
            query.setParameter("data", data);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao listar no Banco de Dados!!!");
        }
    }

    @Override
    public List<Lembrete> listarPorNome(String nome) throws Exception {
        try {
            entityManager = PersistenceUtil.getEntityManager();
            Query query = entityManager.createQuery("SELECT l FROM Lembrete l WHERE l.titulo = :param ");
            query.setParameter("param", nome);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao listar no Banco de Dados!!!");
        }
    }
}

