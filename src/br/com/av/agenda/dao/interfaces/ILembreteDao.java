
package br.com.av.agenda.dao.interfaces;

import br.com.av.agenda.model.Lembrete;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Alinne
 */
public interface ILembreteDao {

    public void salvar(Lembrete lembrete) throws Exception;

    public void alterar(Lembrete lembrete) throws Exception;

    public void excluir(Lembrete lembrete) throws Exception;

    public Lembrete buscar(long id) throws Exception;

    public List<Lembrete> listar() throws Exception;

    public List<Lembrete> listarPorData(Calendar data) throws Exception;

    public List<Lembrete> listarPorNome(String nome) throws Exception;

}
