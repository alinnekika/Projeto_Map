
package br.com.av.agenda.dao.factory;

import br.com.av.agenda.dao.ContatoDao;
import br.com.av.agenda.dao.LembreteDao;
import br.com.av.agenda.dao.interfaces.IContatoDao;
import br.com.av.agenda.dao.interfaces.ILembreteDao;


public class DaoFactory {
    
    private static IContatoDao contatoDao;
    private static ILembreteDao lembreteDao;

    private DaoFactory() {  
    }
    
    public static IContatoDao getContatoDao(){
        if(contatoDao == null){
            return new ContatoDao();
        }
        return contatoDao;
    }
    public static ILembreteDao getLembreteDao(){
        if(lembreteDao == null){
            return new LembreteDao();
        }
        return lembreteDao;
    }
    
    
}
