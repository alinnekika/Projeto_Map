
package br.com.av.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Contato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String numero;
    private String email;
    private boolean removido;

    public Contato() {
        this.removido = false;
    }

    public Contato(long id, String nome, String numero, String email) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.removido = false;
    }

    public Contato(String nome) {
        this.nome = nome;
        this.removido = false;
    }

    public boolean isRemovido() {
        return removido;
    }

    public void setRemovido(boolean removido) {
        this.removido = removido;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    @Override
    public String toString() {
        return nome;
    }
    
}
