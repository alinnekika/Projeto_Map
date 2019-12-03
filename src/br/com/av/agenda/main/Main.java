
package br.com.av.agenda.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class Main {

    public static void main(String[] args) {
        //EntityManager em = Persistence.createEntityManagerFactory("AgendaPU").createEntityManager();

        System.out.println(Persistence.createEntityManagerFactory("AgendaPU").createEntityManager().isOpen());

        System.out.println("Carregado com Sucesso!!!");

    }

}
