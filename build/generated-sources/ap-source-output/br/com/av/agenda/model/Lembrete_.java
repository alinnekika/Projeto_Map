package br.com.av.agenda.model;

import br.com.av.agenda.enums.Categoria;
import br.com.av.agenda.enums.TipoLembrete;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lembrete.class)
public abstract class Lembrete_ {

	public static volatile ListAttribute<Lembrete, Calendar> calendar;
	public static volatile SingularAttribute<Lembrete, TipoLembrete> tipo;
	public static volatile SingularAttribute<Lembrete, Integer> intervaloDias;
	public static volatile SingularAttribute<Lembrete, Categoria> categoria;
	public static volatile SingularAttribute<Lembrete, String> titulo;
	public static volatile SingularAttribute<Lembrete, Long> id;
	public static volatile SingularAttribute<Lembrete, Contato> contato;
	public static volatile SingularAttribute<Lembrete, String> descricao;
	public static volatile SingularAttribute<Lembrete, String> status;

}

