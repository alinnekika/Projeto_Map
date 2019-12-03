
package br.com.av.agenda.dao.interfaces;

import br.com.av.agenda.model.Contato;
import java.util.List;

/**
 *
 * @author Alinne
 */
public interface IContatoDao {

    public void salvar(Contato contato) throws Exception;

    public void alterar(Contato contato) throws Exception;

    public void excluir(Contato contato) throws Exception;

    public Contato buscar(long id) throws Exception;

    public List<Contato> listar() throws Exception;

    public List<Contato> listarTodos() throws Exception;
    
    public List<Contato> listarPorNome(String nome) throws Exception;
}
