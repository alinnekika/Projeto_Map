
package br.com.av.agenda.model;

import br.com.av.agenda.enums.Categoria;
import br.com.av.agenda.enums.TipoLembrete;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alinne
 */
//CLASSE MODELO: LEMBRETE
@Entity
public class Lembrete implements Serializable {
//   ATRIBUTOS DA CLASSE - TODOS PRIVADOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String descricao;
    private String status;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @ManyToOne
    private Contato contato;
    @Enumerated(EnumType.STRING)
    private TipoLembrete tipo;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Calendar> calendar;
    private int intervaloDias;

//    CONSTRUTOR VAZIO -> CLASSE BEAN
    public Lembrete() {
        this.tipo = TipoLembrete.VAZIO;
        this.categoria = Categoria.SIMPLES;
        this.contato = new Contato("");
        this.calendar = new ArrayList<Calendar>();
        this.status = "INICIADO";
        this.intervaloDias = 0;
    }
//CONSTRUTOR COM PARAMENTRO

    public Lembrete(String descricao) {
        this.descricao = descricao;
        this.tipo = TipoLembrete.VAZIO;
        this.categoria = Categoria.SIMPLES;
        this.contato = new Contato("");
        this.calendar = new ArrayList<Calendar>();
        this.status = "INICIADO";
        this.intervaloDias = 0;
    }

//CONSTRUTOR COM PARAMENTRO -> PREENCHENDO TODOS OS ATRIBUTOS
    public Lembrete(long id, String titulo, String descricao, Categoria categoria, Contato contato, TipoLembrete tipo, List<Calendar> calendar, int intervaloDias) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.contato = contato;
        this.tipo = tipo;
        this.calendar = calendar;
        this.intervaloDias = intervaloDias;

    }

//   GETTERS E SETTERS -> METODOS DE ACESSO AOS ATRIBUTOS DA CLASSE! 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public TipoLembrete getTipo() {
        return tipo;
    }

    public void setTipo(TipoLembrete tipo) {
        this.tipo = tipo;
    }

    public List<Calendar> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<Calendar> calendar) {
        this.calendar = calendar;
    }

    public int getIntervaloDias() {
        return intervaloDias;
    }

    public void setIntervaloDias(int intervaloDias) {
        this.intervaloDias = intervaloDias;
    }

    @Override
    public String toString() {
        return "Lembrete \n\n" + id
                + "\ntitulo: " + titulo
                + "\ndescricao: " + descricao
                + "\ncategoria: " + categoria
                + "\ntipo: " + tipo
                + "\ncalendar: " + calendar
                + "\nintervaloDias: " + intervaloDias
                + "\ncontato: " + contato;
    }
}
