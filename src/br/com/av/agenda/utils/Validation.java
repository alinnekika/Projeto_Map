
package br.com.av.agenda.utils;

import br.com.av.agenda.enums.Categoria;
import br.com.av.agenda.enums.TipoLembrete;
import br.com.av.agenda.model.Contato;
import br.com.av.agenda.model.Lembrete;

/**
 *
 * @author Alinne
 */
public class Validation {

    public static void validarContato(Contato contato) throws Exception {
        if(contato.getNome().equals("")){
            throw new Exception("Informe um Nome!!!");
        }
        
        if(contato.getNumero().equals("(  )      -    ")){
            throw new Exception("Informe um Número!!!");
        }
        
        if(contato.getNumero().equals("(00) 00000-0000")){
            throw new Exception("Informe um Numero!!!");
        }
        
        if(contato.getEmail().equals("example@hotmail.com")){
            throw new Exception("Informe um Email!!!");
        }
        
        if(contato.getEmail().equals("")){
            throw new Exception("Informe um Email!!!");
        }
    }
    public static void validarLembrete(Lembrete lembrete) throws Exception {
        if(lembrete.getTitulo().equals("")){
            throw new Exception("Informe um Titulo!!!");
        }
        
        if(lembrete.getCategoria().equals(Categoria.VAZIO)){
            throw new Exception("Informe uma Categoria!!!");
        }
        
        if(lembrete.getTipo().equals(TipoLembrete.VAZIO)){
            throw new Exception("Selecione um Tipo!!!");
        }
        
    }
    
}
