
package br.com.av.agenda.facade;

import br.com.av.agenda.dao.factory.DaoFactory;
import br.com.av.agenda.model.Contato;
import br.com.av.agenda.model.Lembrete;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Alinne
 */
public class Facade {
    
//********************Contato*************************
    
    public void salvarContato(Contato contato) throws Exception{
        DaoFactory.getContatoDao().salvar(contato);
    }
    public void alterarContato(Contato contato) throws Exception{
        DaoFactory.getContatoDao().alterar(contato);
    }
    public void excluirContato(Contato contato) throws Exception{
        DaoFactory.getContatoDao().excluir(contato);
    }
    public Contato buscarContato(long id) throws Exception{
        return DaoFactory.getContatoDao().buscar(id);
    }
    public List<Contato> listarContatos() throws Exception{
        return DaoFactory.getContatoDao().listar();
    }
    public List<Contato> listarTodosContatos() throws Exception{
        return DaoFactory.getContatoDao().listarTodos();
    }
    public List<Contato> listarContatosPorNome(String nome) throws Exception{
        return DaoFactory.getContatoDao().listarPorNome(nome);
    }
//********************Lembrete*************************
    
    public void salvarLembrete(Lembrete lembrete) throws Exception{
        DaoFactory.getLembreteDao().salvar(lembrete);
    }
    public void alterarLembrete(Lembrete lembrete) throws Exception{
        DaoFactory.getLembreteDao().alterar(lembrete);
    }
    public void excluirLembrete(Lembrete lembrete) throws Exception{
        DaoFactory.getLembreteDao().excluir(lembrete);
    }
    public Lembrete buscarLembrete(long id) throws Exception{
        return DaoFactory.getLembreteDao().buscar(id);
    }
    public List<Lembrete> listarLembretes() throws Exception{
        return DaoFactory.getLembreteDao().listar();
    }
    public List<Lembrete> listarLembretesPorData(Calendar data) throws Exception{
        return DaoFactory.getLembreteDao().listarPorData(data);
    }
    public List<Lembrete> listarLembretesPorTitulo(String titulo) throws Exception{
        return DaoFactory.getLembreteDao().listarPorNome(titulo);
    }
}
